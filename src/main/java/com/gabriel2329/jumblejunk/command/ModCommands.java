package com.gabriel2329.jumblejunk.command;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class ModCommands {
    public static void registerCommands(){
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            LifeStarCommand.register(dispatcher, false);
        });
    }
}
