package com.gabriel2329.jumblejunk.singleton;

import com.gabriel2329.jumblejunk.item.ModItems;

import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class LifeStarSingleton {
    private static final int STAR_HEIGHT_OFFSET = 50;

    public static void spawnStar(ServerPlayerEntity player) {
        World world = player.getWorld();
        Vec3d pos = player.getPos();
        
        ItemEntity starEntity = new ItemEntity(world, 
        pos.getX(), 
        pos.getY() + STAR_HEIGHT_OFFSET, 
        pos.getZ(), 
        new ItemStack(ModItems.LIFE_STAR, 1));

        world.spawnEntity(starEntity);
    }
}
