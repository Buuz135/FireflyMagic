package com.mart.ffmagic.item;

import com.hrznstudio.titanium.item.ItemBase;
import com.hrznstudio.titanium.util.TitaniumMod;
import com.mart.ffmagic.FireflyMagic;
import com.mart.ffmagic.entity.EntityFirefly;
import com.mart.ffmagic.item.scrolls.ItemScrollSage;
import net.minecraft.item.Item;

public class ModItems {

    public static Item firefly_jar, firefly_jar_forest, firefly_jar_fairy, firefly_jar_mountain, firefly_jar_demon, firefly_jar_ice, firefly_jar_void, firefly_jar_earth;

    public static Item scroll_sage;

    public static void registerItems(TitaniumMod mod){
        mod.addItems(
                firefly_jar = new ItemBase("firefly_jar", new Item.Properties().group(FireflyMagic.GROUP)),
                firefly_jar_fairy = new ItemFireflyJar("firefly_jar_fairy", EntityFirefly.FireflyType.FAIRY),
                firefly_jar_forest = new ItemFireflyJar("firefly_jar_forest", EntityFirefly.FireflyType.FOREST),
                firefly_jar_mountain = new ItemFireflyJar("firefly_jar_mountain", EntityFirefly.FireflyType.MOUNTAIN),
                firefly_jar_demon = new ItemFireflyJar("firefly_jar_demon", EntityFirefly.FireflyType.DEMON),
                firefly_jar_ice = new ItemFireflyJar("firefly_jar_ice", EntityFirefly.FireflyType.ICE),
                firefly_jar_void = new ItemFireflyJar("firefly_jar_void", EntityFirefly.FireflyType.VOID),
                firefly_jar_earth = new ItemFireflyJar("firefly_jar_earth", EntityFirefly.FireflyType.EARTH),

                scroll_sage = new ItemScrollSage("scroll_sage")
        );
    }

}
