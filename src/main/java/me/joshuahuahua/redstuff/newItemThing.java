package me.joshuahuahua.redstuff;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class newItemThing {
    public static void initItem(RegistryObject<Item> varName, String name, ItemGroup group) {

        final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                RedStuff.MOD_ID);

        final RegistryObject<Item> tes = ITEMS.register(name,
                () -> new Item(new Item.Properties().group(group)));

    }
}
