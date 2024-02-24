package com.gabriel2329.jumblejunk.command;


import com.gabriel2329.jumblejunk.singleton.LifeStarSingleton;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;

import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;

public class LifeStarCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated){
        dispatcher.register(CommandManager.literal("lifestar").executes(context -> {
            return execute(context);
        }));
    }

    private static int execute(CommandContext<ServerCommandSource> context) {
        ServerPlayerEntity player = context.getSource().getPlayer();
        LifeStarSingleton.spawnStar(player);
        return 1;
    }
}
