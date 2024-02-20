package com.gabriel2329.jumblejunk.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SignalMeterItem extends Item {

    private static final TextColor weakColour = TextColor.parse("#cccccc");
    private static final TextColor mediumColour = TextColor.parse("#fefe00");
    private static final TextColor strongColour = TextColor.parse("#00ff00");

    public SignalMeterItem(Settings settings) {
        super(settings);
    }
    
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        BlockPos pos = context.getBlockPos();
        if(!world.isClient()){
            int redstonePower = world.getReceivedRedstonePower(pos);

            player.sendMessage(Text.literal("Redstone Power:"+redstonePower)
            .setStyle(Style.EMPTY
            .withColor(getColourForSignalStrength(redstonePower))));
        }
        context.getStack().damage(1, player, playerEntity -> playerEntity.sendToolBreakStatus(player.getActiveHand()));
        return super.useOnBlock(context);
    }

    private TextColor getColourForSignalStrength(int value){
        if(value <= 5) return weakColour;
        if(value > 5 && value < 10) return mediumColour;
        if(value > 10 && value < 16) return strongColour;
        else return TextColor.parse("#ff0000");
    }
}

