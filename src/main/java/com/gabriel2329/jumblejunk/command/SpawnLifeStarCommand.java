package com.gabriel2329.jumblejunk.command;

import java.util.Collection;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;

public class SpawnLifeStarCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated){
        dispatcher.register((LiteralArgumentBuilder)CommandManager.literal("lifestar").requires((source) -> {
            return source.hasPermissionLevel(2);
        }).then(CommandManager.argument("targets", EntityArgumentType.players())).executes(context) -> {
            return execute((ServerCommandSource)context.getSource(), EntityArgumentType.getPlayer(context, "targets"));
        });
    }

    private static int execute(CommandContext<ServerCommandSource> source, Collection<ServerPlayerEntity> targets) throws CommandSyntaxException {

    }
}
