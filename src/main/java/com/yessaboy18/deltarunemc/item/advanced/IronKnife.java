package com.yessaboy18.deltarunemc.item.advanced;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;

public class IronKnife extends Item {

    public IronKnife(Settings settings) {
        super(settings);
    }

    @Override
    public void onCraftByPlayer(ItemStack stack, World world, PlayerEntity player) {
        super.onCraft(stack, world);

        if (!world.isClient && player instanceof ServerPlayerEntity serverPlayer) {
            serverPlayer.sendMessage(
                    Text.literal("§4 Everybody bleeds, right?"),
                    false // false = chat, true = action bar
            );
        }
    }
}
