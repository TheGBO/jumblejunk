package com.gabriel2329.jumblejunk.singleton;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class LifeStarSingleton {
    public static void spawnStar(ServerPlayerEntity player) {
        World world = player.getWorld();
        Vec3d pos = player.getPos();
        
    }
}
