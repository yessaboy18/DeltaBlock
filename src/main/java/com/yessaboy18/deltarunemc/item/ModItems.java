package com.yessaboy18.deltarunemc.item;

import com.yessaboy18.deltarunemc.DeltaBlock;
import com.yessaboy18.deltarunemc.item.advanced.IronKnife;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BLACK_SHARD = registerItem("black_shard", new Item(new Item.Settings()
            .fireproof()
            .maxDamage(769)) {
        @Override
        public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
            stack.damage(1, attacker, EquipmentSlot.MAINHAND);
            return true;
        }
    });
    public static final Item SHADOW_CRYSTAL = registerItem("shadow_crystal", new Item(new Item.Settings()));
    public static final Item RUNE_PIECE = registerItem("rune_piece", new Item(new Item.Settings()));
    public static final Item COMPLETED_RUNE = registerItem("completed_rune", new Item(new Item.Settings()));
    public static final Item BROKEN_SOUL = registerItem("broken_soul", new Item(new Item.Settings()));
    public static final Item IRON_KNIFE = registerItem("iron_knife", new IronKnife(new Item.Settings()
            .maxCount(1)
            .maxDamage(127)
    ));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(DeltaBlock.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SHADOW_CRYSTAL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLACK_SHARD);
            fabricItemGroupEntries.add(IRON_KNIFE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLACK_SHARD);
            fabricItemGroupEntries.add(SHADOW_CRYSTAL);
            fabricItemGroupEntries.add(RUNE_PIECE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(IRON_KNIFE);
            fabricItemGroupEntries.add(COMPLETED_RUNE);
        });
        DeltaBlock.LOGGER.info("...TO TURN OBJECTS INTO DARKNERS...");
    }
}
