package net.iteranya.tutorialmod.item;

import net.iteranya.tutorialmod.TutorialMod;
import net.iteranya.tutorialmod.item.custom.BeegSwordItem;
import net.iteranya.tutorialmod.item.custom.EightBallItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            ()-> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            ()-> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> UNOBTAINIUM = ITEMS.register("unobtainium",
            ()-> new EightBallItem(
                    new Item.Properties()
                            .tab(ModCreativeModTab.TUTORIAL_TAB)
                            .stacksTo(1)
            ));

    public static final RegistryObject<Item> BEEG_SWORD = ITEMS.register( "beeg_sword",
            ()-> new BeegSwordItem(Tiers.DIAMOND,50, 0.8f,
                    new SwordItem.Properties()
                            .tab(ModCreativeModTab.TUTORIAL_TAB)
                            .stacksTo(1)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
