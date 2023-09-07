package net.monstertrex.goldendelicacies.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static FoodComponent GOLDEN_BAKED_POTATO = new FoodComponent.Builder()
            .hunger(8).saturationModifier(1.25f)
            .build();

    public static FoodComponent GOLDEN_BEETROOT = new FoodComponent.Builder()
            .hunger(4).saturationModifier(1.0f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600), 1f)
            .build();

    public static FoodComponent GOLDEN_BEETROOT_SOUP = new FoodComponent.Builder()
            .hunger(14).saturationModifier(0.75f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3000), 1f)
            .build();

    public static FoodComponent GOLDEN_BREAD = new FoodComponent.Builder()
            .hunger(8).saturationModifier(1.25f)
            .build();

    public static FoodComponent GOLDEN_CHORUS_FRUIT = new FoodComponent.Builder()
            .hunger(6).saturationModifier(0.6f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 500), 1f)
            .build();

    public static FoodComponent GOLDEN_COOKED_BEEF = new FoodComponent.Builder()
            .hunger(12).saturationModifier(0.75f).meat()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1f)
            .build();

    public static FoodComponent GOLDEN_COOKED_CHICKEN = new FoodComponent.Builder()
            .hunger(10).saturationModifier(0.6f).meat()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1000), 1f)
            .build();

    public static FoodComponent GOLDEN_COOKED_COD = new FoodComponent.Builder()
            .hunger(7).saturationModifier(0.6f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 750), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 750), 1f)
            .build();

    public static FoodComponent GOLDEN_COOKED_MUTTON = new FoodComponent.Builder()
            .hunger(10).saturationModifier(0.75f).meat()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 150), 1f)
            .build();

    public static FoodComponent GOLDEN_COOKED_PORKCHOP = new FoodComponent.Builder()
            .hunger(12).saturationModifier(0.75f).meat()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1f)
            .build();

    public static FoodComponent GOLDEN_COOKED_RABBIT = new FoodComponent.Builder()
            .hunger(8).saturationModifier(0.6f).meat()
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200), 1f)
            .build();

    public static FoodComponent GOLDEN_COOKED_SALMON = new FoodComponent.Builder()
            .hunger(9).saturationModifier(0.8f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1200), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1f)
            .build();

    public static FoodComponent GOLDEN_GLOW_BERRIES = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.4f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600), 1f)
            .build();

    public static FoodComponent GOLDEN_PUMPKIN_PIE = new FoodComponent.Builder()
            .hunger(10).saturationModifier(0.8f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200), 1f)
            .build();

    public static FoodComponent GOLDEN_SWEET_BERRIES = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.4f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 900), 1f)
            .build();

}
