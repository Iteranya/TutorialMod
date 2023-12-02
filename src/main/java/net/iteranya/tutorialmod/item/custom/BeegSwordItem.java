package net.iteranya.tutorialmod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class BeegSwordItem extends SwordItem {
    public BeegSwordItem(Tier tier, int damage, float speed, Properties properties) {
        super(tier, damage, speed, properties);

    }

    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
        entity.heal(9);
        return super.onEntitySwing(stack, entity);
    }
}
