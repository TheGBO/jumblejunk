package com.gabriel2329.jumblejunk.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent FRIED_EGG = new FoodComponent
    .Builder()
    .hunger(6)
    .saturationModifier(0.5f)
    .build();

    public static final FoodComponent LIFE_STAR = new FoodComponent
    .Builder()
    .hunger(3)
    .saturationModifier(0.25f)
    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10, 16), 1f)
    .alwaysEdible()
    .build();
}
