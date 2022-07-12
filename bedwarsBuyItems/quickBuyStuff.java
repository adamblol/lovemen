package bedwarsBuyItems;

import com.google.gson.JsonObject;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import static bedwarsBuyItems.bedwarsItemPrice.*;

public class quickBuyStuff implements Listener {
    public static void quickBuyItems(InventoryClickEvent event, Player player) {
        // get the item type clicked
        Material itemClicked = event.getCurrentItem().getType();
        Material itemRequired = null;

        // check if unbreakable tag for this shit
        if(event.getCurrentItem().getItemMeta().isUnbreakable() == true) {
            return;
        }

        System.out.println(itemClicked.toString());
        // find the price
        JsonObject bedwarsPrice = bedwarsItems();
        System.out.println(bedwarsPrice.get(itemClicked.toString()).getAsString() + " i like men");
        int price = Integer.parseInt(bedwarsPrice.get(itemClicked.toString()).getAsString());

        if(Integer.toString(price).equals(null)) {
            return;
        }

        // get the required type of item to buy it
        JsonObject bedwarsItemRequired = bedwarsItemsBuyType();
        String name = bedwarsItemRequired.get(itemClicked.toString()).getAsString();

        // means prob dont exist ngl
        if(name == null) {
            return;
        }

        // if iron required
        if(name.equalsIgnoreCase("IRON_INGOT")) {
            itemRequired = Material.IRON_INGOT;
        }

        // gold required
        if(name.equalsIgnoreCase("GOLD_INGOT")) {
            itemRequired = Material.GOLD_INGOT;
        }

        // emerald required
        if(name.equalsIgnoreCase("EMERALD")) {
            itemRequired = Material.EMERALD;
        }


        // item name
        JsonObject bedwarsItemName = bedwarsItemNames.bedwarsItemNamesObject();

        // check if they have enough
        if(player.getInventory().contains(itemRequired, price) == false) {
            String itemName = bedwarsItemName.get(itemRequired.toString()).getAsString();
            player.sendMessage(ChatColor.RED + "You dont have enough " + itemName + "!");
            return;
        }

        JsonObject bedwarsReceiveItemAmount = bedwarsReceiveAmount();
        int amount = Integer.parseInt(bedwarsReceiveItemAmount.get(itemClicked.toString()).getAsString());

        if(Integer.toString(price).equals(null)) {
            return;
        }

        // give the player the item they click
        ItemStack giveItem = new ItemStack(itemClicked, amount);
        player.getInventory().addItem(giveItem);

        // remove the total amount of whatever from inventory
        ItemStack removeItem = new ItemStack(itemRequired, price);
        player.getInventory().removeItem(removeItem);

        String itemName = bedwarsItemName.get(itemClicked.toString()).getAsString();

        player.sendMessage(ChatColor.GREEN + "You purchased " + ChatColor.YELLOW + itemName);

        return;
    }
}
