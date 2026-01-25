package com.yessaboy18.deltarunemc.item;

import com.yessaboy18.deltarunemc.DeltaBlock;
import com.yessaboy18.deltarunemc.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup DELTABLOCK_ITEM_GROUPS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DeltaBlock.MOD_ID, "deltablock_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DARKNESS_STONE))
                    .displayName(Text.translatable("itemgroup.deltablock.deltablock_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLACK_SHARD);
                        entries.add(ModItems.IRON_KNIFE);
                        entries.add(ModItems.SHADOW_CRYSTAL);
                        entries.add(ModBlocks.DARKNESS_STONE);
                    }).build());

    public static void registerItemGroups() {
        DeltaBlock.LOGGER.info("...THEY WILL BE ONE GROUP...");
    }
}
