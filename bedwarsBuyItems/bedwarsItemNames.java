package bedwarsBuyItems;

import com.google.gson.JsonObject;
import org.bukkit.Material;

public class bedwarsItemNames {
    public static JsonObject bedwarsItemNamesObject() {
        JsonObject bedwarsItemNamesObject = new JsonObject();

        // loot stuff
        bedwarsItemNamesObject.addProperty("IRON_INGOT", "Iron Ingot");
        bedwarsItemNamesObject.addProperty("GOLD_INGOT", "Gold Ingot");
        bedwarsItemNamesObject.addProperty("EMERALD", "Emerald");

        // quick buy stuff
        bedwarsItemNamesObject.addProperty("WHITE_WOOL", "White Wool");
        bedwarsItemNamesObject.addProperty("STONE_SWORD", "Stone Sword");
        bedwarsItemNamesObject.addProperty("CHAINMAIL_BOOTS", "Chain Armour");
        bedwarsItemNamesObject.addProperty("WOODEN_AXE", "Wooden Axe");
        bedwarsItemNamesObject.addProperty("BOW", "Bow");
        bedwarsItemNamesObject.addProperty("POTION", "Potion");
        bedwarsItemNamesObject.addProperty("TNT", "Tnt");
        bedwarsItemNamesObject.addProperty("OAK_PLANKS", "Oak Planks");
        bedwarsItemNamesObject.addProperty("IRON_SWORD", "Iron Sword");
        bedwarsItemNamesObject.addProperty("IRON_BOOTS", "Iron Armour");
        bedwarsItemNamesObject.addProperty("WOODEN_PICKAXE", "Wooden Pickaxe");
        bedwarsItemNamesObject.addProperty("ARROW", "Arrow");
        bedwarsItemNamesObject.addProperty("POTION", "Potion");
        bedwarsItemNamesObject.addProperty("WATER_BUCKET", "Water Bucket");

        // blocks buy stuff
        bedwarsItemNamesObject.addProperty("CLAY", "Clay");
        bedwarsItemNamesObject.addProperty("GLASS", "Glass");
        bedwarsItemNamesObject.addProperty("END_STONE", "End Stone");
        bedwarsItemNamesObject.addProperty("LADDER", "Ladder");
        bedwarsItemNamesObject.addProperty("OBSIDIAN", "Obsidian");

        // melee buy stuff
        bedwarsItemNamesObject.addProperty("DIAMOND_SWORD", "Diamond Sword");
        bedwarsItemNamesObject.addProperty("STICK", "Knockback Stick");

        // armour stuff
        bedwarsItemNamesObject.addProperty("DIAMOND_BOOTS", "Diamond Armour");

        // tools stuff
        bedwarsItemNamesObject.addProperty("SHEARS", "Shears");

        // bow stuff

        // potion stuff

        // utilitys
        bedwarsItemNamesObject.addProperty("GOLDEN_APPLE", "Golden Apple");
        bedwarsItemNamesObject.addProperty("SNOWBALL", "Snow ball");
        bedwarsItemNamesObject.addProperty("GHAST_SPAWN_EGG", "Iron Golem");
        bedwarsItemNamesObject.addProperty("FIRE_CHARGE", "Fireball");
        bedwarsItemNamesObject.addProperty("ENDER_PEARL", "Ender Pearl");
        bedwarsItemNamesObject.addProperty("EGG", "Bridge Egg");
        bedwarsItemNamesObject.addProperty("MILK_BUCKET", "Milk Bucket");
        bedwarsItemNamesObject.addProperty("SPONGE", "Sponge");
        bedwarsItemNamesObject.addProperty("CHEST", "Chest");

        return bedwarsItemNamesObject;
    }
}
