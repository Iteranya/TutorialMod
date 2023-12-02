package net.iteranya.tutorialmod.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

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
