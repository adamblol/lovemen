package bedwarsBuyItems;

import com.google.gson.JsonObject;
import org.bukkit.Material;

public class bedwarsItemPrice {

    // amount they cost to purchase
    public static JsonObject bedwarsItems() {
        JsonObject bedwarsItemsObject = new JsonObject();

        // quick buy items
        bedwarsItemsObject.addProperty("WHITE_WOOL", 4);
        bedwarsItemsObject.addProperty("STONE_SWORD", 10);
        bedwarsItemsObject.addProperty("CHAINMAIL_BOOTS", 30);
        bedwarsItemsObject.addProperty("WOODEN_AXE", 10);
        bedwarsItemsObject.addProperty("BOW", 30);
        bedwarsItemsObject.addProperty("POTION", 1);
        bedwarsItemsObject.addProperty("TNT", 8);
        bedwarsItemsObject.addProperty("OAK_PLANKS", 4);
        bedwarsItemsObject.addProperty("IRON_SWORD", 10);
        bedwarsItemsObject.addProperty("IRON_BOOTS", 12);
        bedwarsItemsObject.addProperty("WOODEN_PICKAXE", 10);
        bedwarsItemsObject.addProperty("ARROW", 2);
        bedwarsItemsObject.addProperty("POTION", 2);
        bedwarsItemsObject.addProperty("WATER_BUCKET", 6);

        // blocks buy menu
        bedwarsItemsObject.addProperty("CLAY", 12);
        bedwarsItemsObject.addProperty("GLASS", 12);
        bedwarsItemsObject.addProperty("END_STONE", 24);
        bedwarsItemsObject.addProperty("LADDER", 4);
        bedwarsItemsObject.addProperty("OBSIDIAN", 4);

        // melee buy menu
        bedwarsItemsObject.addProperty("STONE_SWORD", 10);
        bedwarsItemsObject.addProperty("IRON_SWORD", 7);
        bedwarsItemsObject.addProperty("DIAMOND_SWORD", 4);
        bedwarsItemsObject.addProperty("STICK", 5);

        // armour buy menu
        bedwarsItemsObject.addProperty("DIAMOND_BOOTS", 6);

        // tools buy menu
        bedwarsItemsObject.addProperty("SHEARS", 20);

        // utilitys
        bedwarsItemsObject.addProperty("GOLDEN_APPLE", 3);
        bedwarsItemsObject.addProperty("SNOWBALL", 5);
        bedwarsItemsObject.addProperty("GHAST_SPAWN_EGG", 120);
        bedwarsItemsObject.addProperty("FIRE_CHARGE", 40);
        bedwarsItemsObject.addProperty("ENDER_PEARL", 4);
        bedwarsItemsObject.addProperty("EGG", 1);
        bedwarsItemsObject.addProperty("MILK_BUCKET", 1);
        bedwarsItemsObject.addProperty("SPONGE", 10);
        bedwarsItemsObject.addProperty("CHEST", 24);

        return bedwarsItemsObject;
    }

    // so if need iron, gold, diamonds, emeralds
    public static JsonObject bedwarsItemsBuyType() {
        JsonObject bedwarsItemsBuyTypeObject = new JsonObject();

        // all iron items
        bedwarsItemsBuyTypeObject.addProperty("WHITE_WOOL", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("STONE_SWORD", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("CHAINMAIL_BOOTS", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("WOODEN_AXE", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("WOODEN_PICKAXE", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("CLAY", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("GLASS", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("END_STONE", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("LADDER", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("SHEARS", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("SNOWBALL", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("GHAST_SPAWN_EGG", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("FIRE_CHARGE", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("SPONGE", Material.IRON_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("CHEST", Material.IRON_INGOT.toString());

        // all gold items
        bedwarsItemsBuyTypeObject.addProperty("BOW", Material.GOLD_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("TNT", Material.GOLD_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("OAK_PLANKS", Material.GOLD_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("IRON_SWORD", Material.GOLD_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("IRON_BOOTS", Material.GOLD_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("ARROW", Material.GOLD_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("WATER_BUCKET", Material.GOLD_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("STICK", Material.GOLD_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("GOLDEN_APPLE", Material.GOLD_INGOT.toString());
        bedwarsItemsBuyTypeObject.addProperty("MILK_BUCKET", Material.GOLD_INGOT.toString());

        // all emerald items
        bedwarsItemsBuyTypeObject.addProperty("POTION", Material.EMERALD.toString());
        bedwarsItemsBuyTypeObject.addProperty("OBSIDIAN", Material.EMERALD.toString());
        bedwarsItemsBuyTypeObject.addProperty("DIAMOND_SWORD", Material.EMERALD.toString());
        bedwarsItemsBuyTypeObject.addProperty("DIAMOND_BOOTS", Material.EMERALD.toString());
        bedwarsItemsBuyTypeObject.addProperty("ENDER_PEARL", Material.EMERALD.toString());
        bedwarsItemsBuyTypeObject.addProperty("EGG", Material.EMERALD.toString());

        return bedwarsItemsBuyTypeObject;
    }

    // the amount you receive upon purchase
    public static JsonObject bedwarsReceiveAmount() {
        JsonObject bedwarsReceiveAmount = new JsonObject();

        // quick buy
        bedwarsReceiveAmount.addProperty("WHITE_WOOL", 16);
        bedwarsReceiveAmount.addProperty("STONE_SWORD", 1);
        bedwarsReceiveAmount.addProperty("CHAINMAIL_BOOTS", 1);
        bedwarsReceiveAmount.addProperty("WOODEN_AXE", 1);
        bedwarsReceiveAmount.addProperty("BOW", 1);
        bedwarsReceiveAmount.addProperty("POTION", 1);
        bedwarsReceiveAmount.addProperty("TNT", 1);
        bedwarsReceiveAmount.addProperty("OAK_PLANKS", 16);
        bedwarsReceiveAmount.addProperty("IRON_SWORD", 1);
        bedwarsReceiveAmount.addProperty("IRON_BOOTS", 1);
        bedwarsReceiveAmount.addProperty("WOODEN_PICKAXE", 1);
        bedwarsReceiveAmount.addProperty("ARROW", 6);
        bedwarsReceiveAmount.addProperty("POTION", 1);
        bedwarsReceiveAmount.addProperty("WATER_BUCKET", 1);

        // blocks buy
        bedwarsReceiveAmount.addProperty("CLAY", 16);
        bedwarsReceiveAmount.addProperty("GLASS", 1);
        bedwarsReceiveAmount.addProperty("END_STONE", 12);
        bedwarsReceiveAmount.addProperty("LADDER", 8);
        bedwarsReceiveAmount.addProperty("OBSIDIAN", 4);

        // melee buy
        bedwarsReceiveAmount.addProperty("DIAMOND_SWORD", 1);
        bedwarsReceiveAmount.addProperty("STICK", 1);

        // armour buy
        bedwarsReceiveAmount.addProperty("DIAMOND_BOOTS", 1);

        // tools buy
        bedwarsReceiveAmount.addProperty("SHEARS", 1);

        // utilitys buy
        bedwarsReceiveAmount.addProperty("GOLDEN_APPLE", 1);
        bedwarsReceiveAmount.addProperty("SNOWBALL", 1);
        bedwarsReceiveAmount.addProperty("GHAST_SPAWN_EGG", 1);
        bedwarsReceiveAmount.addProperty("FIRE_CHARGE", 1);
        bedwarsReceiveAmount.addProperty("ENDER_PEARL", 1);
        bedwarsReceiveAmount.addProperty("EGG", 1);
        bedwarsReceiveAmount.addProperty("MILK_BUCKET", 1);
        bedwarsReceiveAmount.addProperty("SPONGE", 1);
        bedwarsReceiveAmount.addProperty("CHEST", 1);

        return bedwarsReceiveAmount;
    }
}
