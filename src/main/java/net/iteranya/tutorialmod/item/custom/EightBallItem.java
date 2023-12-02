package net.iteranya.tutorialmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EightBallItem extends Item {
    public EightBallItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if(level.isClientSide && interactionHand == InteractionHand.MAIN_HAND){
            //Do Stuff Here when right-clicked nyaaa~
            showRandomStuff(player);
            player.getCooldowns().addCooldown(this,200);
        }
        return super.use(level, player, interactionHand);
    }

    private void showRandomStuff(Player player){
        var random = RandomSource.createNewThreadLocalInstance().nextInt(9);
        var message = "";
        //Right here, how  to make switch case statement that changes the message variable based on the random number
        player.sendSystemMessage(Component.literal("Nyaaaa~ " + random));
    }
}
