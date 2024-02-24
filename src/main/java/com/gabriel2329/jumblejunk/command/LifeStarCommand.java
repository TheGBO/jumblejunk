package com.gabriel2329.jumblejunk.command;


import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;

import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class LifeStarCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated){
        dispatcher.register(CommandManager.literal("lifestar").executes(context -> {
            return execute(context);
        }));
    }

    private static int execute(CommandContext<ServerCommandSource> context) {
        ServerPlayerEntity player = context.getSource().getPlayer();
        player.sendMessage(Text.literal("lifestar Command is vvorking"));
        return 1;
    }
}
