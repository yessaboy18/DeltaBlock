package com.yessaboy18.deltarunemc.item;

import com.yessaboy18.deltarunemc.DeltaBlock;
import com.yessaboy18.deltarunemc.item.advanced.IronKnife;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BLACK_SHARD = registerItem("black_shard", new Item(new Item.Settings()));
    public static final Item SHADOW_CRYSTAL = registerItem("shadow_crystal", new Item(new Item.Settings()));
    public static final Item IRON_KNIFE = registerItem("iron_knife", new IronKnife(new Item.Settings()
            .maxCount(1)
            .maxDamage(97)
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
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(IRON_KNIFE);
        });
        DeltaBlock.LOGGER.info("...TO TURN OBJECTS INTO DARKNERS...");
    }
}
