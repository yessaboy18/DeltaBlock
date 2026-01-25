package com.yessaboy18.deltarunemc.effect;

import com.yessaboy18.deltarunemc.DeltaBlock;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> BLEEDING = registerStatusEffect("bleeding",
            new BleedingEffect());

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(DeltaBlock.MOD_ID, name), statusEffect);
    }

    public static void regsiterEffects() {
        DeltaBlock.LOGGER.info("...WITH THE MAGIC FROM THE HEROS HEARTS...");
    }
}
