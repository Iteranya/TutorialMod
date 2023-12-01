package net.iteranya.tutorialmod.item;

import net.iteranya.tutorialmod.TutorialMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);


    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> UNOBTAINIUM = ITEMS.register("unobtainium",
            ()-> new Item(new Item.Properties()
                            .tab(CreativeModeTab.TAB_MISC)
                            .stacksTo(16)
                            .food(Foods.APPLE)
            ));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
