package com.yessaboy18.deltarunemc.util;

import com.yessaboy18.deltarunemc.DeltaBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(DeltaBlock.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BLEEDING_HIT = createTag("bleeding_hit");
        public static final TagKey<Item> DARKWORLD_ITEM = createTag("darkworld_item");
        public static final TagKey<Item> LIGHTWORLD_ITEM = createTag("lightworld_item");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(DeltaBlock.MOD_ID, name));
        }
    }
}
