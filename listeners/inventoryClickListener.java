package listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import utils.blocksBuyMenu;
import utils.quickBuyMenu;
import utils.meleeBuyMenu;
import utils.armorBuyMenu;
import utils.toolsBuyMenu;
import utils.rangedBuyMenu;
import utils.potionsBuyMenu;
import utils.utilityBuyMenu;
import static bedwarsBuyItems.quickBuyStuff.quickBuyItems;

public class inventoryClickListener implements Listener {
    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        String username = event.getWhoClicked().getName();
        Player player = Bukkit.getPlayer(username);

        if(player == null) {
            return;
        }

        // if they click anywhere on the inventory where an item isnt set then return
        if(event.getCurrentItem() == null) {
            return;
        }

        // quick buy shit
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Quick Buy")) {
            quickBuyClicks(event, player);
            quickBuyItems(event, player);

            // make it so whenever we click item in this menu buy it
        }

        // blocks menu shit
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Blocks")) {
            blockBuyClicks(event, player);
            quickBuyItems(event, player);
        }

        // melee menu shit
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Melee")) {
            menuBuyClicks(event, player);
            quickBuyItems(event, player);
        }

        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Armor")) {
            armorBuyMenu(event, player);
            quickBuyItems(event, player);
        }

        // melee shit
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Tools")) {
            toolsBuyMenu(event, player);
            quickBuyItems(event, player);
        }

        // ranged tab
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Ranged")) {
            rangedBuyMenu(event, player);
            quickBuyItems(event, player);
        }

        // potions shit
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Potions")) {
            potionsBuyMenu(event, player);
            quickBuyItems(event, player);
        }

        // utility shit
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Utility")) {
            utilitysBuyMenu(event, player);
            quickBuyItems(event, player);
        }
    }

    public void quickBuyClicks(InventoryClickEvent event, Player player) {
        // set this to true so they cant move the items around but wait that might be useful soon
        event.setCancelled(true);


        // if clicked is clay send to blocks menu
        if(event.getCurrentItem().getType() == Material.CLAY) {
            player.openInventory(blocksBuyMenu.blocksBuy(player));
            return;
        }

        // if clicked is golden sword send to swords menu
        if(event.getCurrentItem().getType() == Material.GOLDEN_SWORD) {
            player.openInventory(meleeBuyMenu.meleeBuy(player));
            return;
        }

        // if clicked chain boots send to armor menu
        if(event.getCurrentItem().getType() == Material.CHAINMAIL_BOOTS && event.getSlot() == 3) {
            player.openInventory(armorBuyMenu.armorBuy(player));
            return;
        }

        // if clicked on stone pickaxe send to tools shit
        if(event.getCurrentItem().getType() == Material.STONE_PICKAXE) {
            player.openInventory(toolsBuyMenu.toolsBuy(player));
            return;
        }

        if(event.getCurrentItem().getType() == Material.BOW && event.getSlot() == 5) {
            player.openInventory(rangedBuyMenu.rangedBuy(player));
            return;
        }

        // if clicked on potion send to potion
        if(event.getCurrentItem().getType() == Material.BREWING_STAND) {
            player.openInventory(potionsBuyMenu.potionsBuy(player));
            return;
        }

        // if clicked tnt send utilitys
        if(event.getCurrentItem().getType() == Material.TNT && event.getSlot() == 7) {
            player.openInventory(utilityBuyMenu.utilitysBuy(player));
            return;
        }
    }

    public void blockBuyClicks(InventoryClickEvent event, Player player) {
        event.setCancelled(true);

        // if clicked send back to main quick buy
        if(event.getCurrentItem().getType() == Material.NETHER_STAR) {
            player.openInventory(quickBuyMenu.quickBuy(player));
            return;
        }

        // if clicked is golden sword send to swords menu
        if(event.getCurrentItem().getType() == Material.GOLDEN_SWORD) {
            player.openInventory(meleeBuyMenu.meleeBuy(player));
            return;
        }

        // if clicked chain boots send to armor menu
        if(event.getCurrentItem().getType() == Material.CHAINMAIL_BOOTS) {
            player.openInventory(armorBuyMenu.armorBuy(player));
            return;
        }

        // if clicked on stone pickaxe send to tools shit
        if(event.getCurrentItem().getType() == Material.STONE_PICKAXE) {
            player.openInventory(toolsBuyMenu.toolsBuy(player));
            return;
        }

        if(event.getCurrentItem().getType() == Material.BOW) {
            player.openInventory(rangedBuyMenu.rangedBuy(player));
            return;
        }

        // if clicked on potion send to potion
        if(event.getCurrentItem().getType() == Material.BREWING_STAND) {
            player.openInventory(potionsBuyMenu.potionsBuy(player));
            return;
        }

        // if clicked tnt send utilitys
        if(event.getCurrentItem().getType() == Material.TNT) {
            player.openInventory(utilityBuyMenu.utilitysBuy(player));
            return;
        }
    }

    public void menuBuyClicks(InventoryClickEvent event, Player player) {
        event.setCancelled(true);

        // if clicked send back to main quick buy
        if(event.getCurrentItem().getType() == Material.NETHER_STAR) {
            player.openInventory(quickBuyMenu.quickBuy(player));
            return;
        }

        // if clicked is clay send to blocks menu
        if(event.getCurrentItem().getType() == Material.CLAY) {
            player.openInventory(blocksBuyMenu.blocksBuy(player));
            return;
        }

        // if clicked chain boots send to armor menu
        if(event.getCurrentItem().getType() == Material.CHAINMAIL_BOOTS) {
            player.openInventory(armorBuyMenu.armorBuy(player));
            return;
        }

        // if clicked on stone pickaxe send to tools shit
        if(event.getCurrentItem().getType() == Material.STONE_PICKAXE) {
            player.openInventory(toolsBuyMenu.toolsBuy(player));
            return;
        }

        if(event.getCurrentItem().getType() == Material.BOW) {
            player.openInventory(rangedBuyMenu.rangedBuy(player));
            return;
        }

        // if clicked on potion send to potion
        if(event.getCurrentItem().getType() == Material.BREWING_STAND) {
            player.openInventory(potionsBuyMenu.potionsBuy(player));
            return;
        }

        // if clicked tnt send utilitys
        if(event.getCurrentItem().getType() == Material.TNT) {
            player.openInventory(utilityBuyMenu.utilitysBuy(player));
            return;
        }
    }

    public void armorBuyMenu(InventoryClickEvent event, Player player) {
        event.setCancelled(true);

        // if clicked send back to main quick buy
        if(event.getCurrentItem().getType() == Material.NETHER_STAR) {
            player.openInventory(quickBuyMenu.quickBuy(player));
            return;
        }

        // if clicked is clay send to blocks menu
        if(event.getCurrentItem().getType() == Material.CLAY) {
            player.openInventory(blocksBuyMenu.blocksBuy(player));
            return;
        }

        // if clicked sword shit
        if(event.getCurrentItem().getType() == Material.GOLDEN_SWORD) {
            player.openInventory(meleeBuyMenu.meleeBuy(player));
            return;
        }

        // if clicked chain boots send to armor menu
        if(event.getCurrentItem().getType() == Material.CHAINMAIL_BOOTS) {
            player.openInventory(armorBuyMenu.armorBuy(player));
            return;
        }

        // if clicked on stone pickaxe send to tools shit
        if(event.getCurrentItem().getType() == Material.STONE_PICKAXE) {
            player.openInventory(toolsBuyMenu.toolsBuy(player));
            return;
        }

        if(event.getCurrentItem().getType() == Material.BOW) {
            player.openInventory(rangedBuyMenu.rangedBuy(player));
            return;
        }

        // if clicked on potion send to potion
        if(event.getCurrentItem().getType() == Material.BREWING_STAND) {
            player.openInventory(potionsBuyMenu.potionsBuy(player));
            return;
        }

        // if clicked tnt send utilitys
        if(event.getCurrentItem().getType() == Material.TNT) {
            player.openInventory(utilityBuyMenu.utilitysBuy(player));
            return;
        }
    }

    public void toolsBuyMenu(InventoryClickEvent event, Player player) {
        event.setCancelled(true);
        // if clicked send back to main quick buy
        if(event.getCurrentItem().getType() == Material.NETHER_STAR) {
            player.openInventory(quickBuyMenu.quickBuy(player));
            return;
        }

        // if clicked is clay send to blocks menu
        if(event.getCurrentItem().getType() == Material.CLAY) {
            player.openInventory(blocksBuyMenu.blocksBuy(player));
            return;
        }

        // if clicked sword shit
        if(event.getCurrentItem().getType() == Material.GOLDEN_SWORD) {
            player.openInventory(meleeBuyMenu.meleeBuy(player));
            return;
        }

        // if clicked chain boots send to armor menu
        if(event.getCurrentItem().getType() == Material.CHAINMAIL_BOOTS) {
            player.openInventory(armorBuyMenu.armorBuy(player));
            return;
        }

        // if clicked bow ssend to bow
        if(event.getCurrentItem().getType() == Material.BOW) {
            player.openInventory(rangedBuyMenu.rangedBuy(player));
            return;
        }

        // if clicked on potion send to potion
        if(event.getCurrentItem().getType() == Material.BREWING_STAND) {
            player.openInventory(potionsBuyMenu.potionsBuy(player));
            return;
        }

        // if clicked tnt send utilitys
        if(event.getCurrentItem().getType() == Material.TNT) {
            player.openInventory(utilityBuyMenu.utilitysBuy(player));
            return;
        }
    }

    public void rangedBuyMenu(InventoryClickEvent event, Player player) {
        event.setCancelled(true);

        // if clicked send back to main quick buy
        if(event.getCurrentItem().getType() == Material.NETHER_STAR) {
            player.openInventory(quickBuyMenu.quickBuy(player));
            return;
        }

        // if clicked is clay send to blocks menu
        if(event.getCurrentItem().getType() == Material.CLAY) {
            player.openInventory(blocksBuyMenu.blocksBuy(player));
            return;
        }

        // if clicked is golden sword send to swords menu
        if(event.getCurrentItem().getType() == Material.GOLDEN_SWORD) {
            player.openInventory(meleeBuyMenu.meleeBuy(player));
            return;
        }

        // if clicked chain boots send to armor menu
        if(event.getCurrentItem().getType() == Material.CHAINMAIL_BOOTS) {
            player.openInventory(armorBuyMenu.armorBuy(player));
            return;
        }

        // if clicked on stone pickaxe send to tools shit
        if(event.getCurrentItem().getType() == Material.STONE_PICKAXE) {
            player.openInventory(toolsBuyMenu.toolsBuy(player));
            return;
        }

        // if clicked on potion send to potion
        if(event.getCurrentItem().getType() == Material.BREWING_STAND) {
            player.openInventory(potionsBuyMenu.potionsBuy(player));
            return;
        }

        // if clicked tnt send utilitys
        if(event.getCurrentItem().getType() == Material.TNT) {
            player.openInventory(utilityBuyMenu.utilitysBuy(player));
            return;
        }
    }

    public void potionsBuyMenu(InventoryClickEvent event, Player player) {
        event.setCancelled(true);
        // if clicked send back to main quick buy
        if(event.getCurrentItem().getType() == Material.NETHER_STAR) {
            player.openInventory(quickBuyMenu.quickBuy(player));
            return;
        }

        // if clicked is clay send to blocks menu
        if(event.getCurrentItem().getType() == Material.CLAY) {
            player.openInventory(blocksBuyMenu.blocksBuy(player));
            return;
        }

        // if clicked is golden sword send to swords menu
        if(event.getCurrentItem().getType() == Material.GOLDEN_SWORD) {
            player.openInventory(meleeBuyMenu.meleeBuy(player));
            return;
        }

        // if clicked chain boots send to armor menu
        if(event.getCurrentItem().getType() == Material.CHAINMAIL_BOOTS) {
            player.openInventory(armorBuyMenu.armorBuy(player));
            return;
        }

        // if clicked on stone pickaxe send to tools shit
        if(event.getCurrentItem().getType() == Material.STONE_PICKAXE) {
            player.openInventory(toolsBuyMenu.toolsBuy(player));
            return;
        }

        // if clicked bow ssend to bow
        if(event.getCurrentItem().getType() == Material.BOW) {
            player.openInventory(rangedBuyMenu.rangedBuy(player));
            return;
        }

        // if clicked tnt send utilitys
        if(event.getCurrentItem().getType() == Material.TNT) {
            player.openInventory(utilityBuyMenu.utilitysBuy(player));
            return;
        }
    }

    public void utilitysBuyMenu(InventoryClickEvent event, Player player) {
        event.setCancelled(true);
        // if clicked send back to main quick buy
        if(event.getCurrentItem().getType() == Material.NETHER_STAR) {
            player.openInventory(quickBuyMenu.quickBuy(player));
            return;
        }

        // if clicked is clay send to blocks menu
        if(event.getCurrentItem().getType() == Material.CLAY) {
            player.openInventory(blocksBuyMenu.blocksBuy(player));
            return;
        }

        // if clicked is golden sword send to swords menu
        if(event.getCurrentItem().getType() == Material.GOLDEN_SWORD) {
            player.openInventory(meleeBuyMenu.meleeBuy(player));
            return;
        }

        // if clicked chain boots send to armor menu
        if(event.getCurrentItem().getType() == Material.CHAINMAIL_BOOTS) {
            player.openInventory(armorBuyMenu.armorBuy(player));
            return;
        }

        // if clicked on stone pickaxe send to tools shit
        if(event.getCurrentItem().getType() == Material.STONE_PICKAXE) {
            player.openInventory(toolsBuyMenu.toolsBuy(player));
            return;
        }

        // if clicked bow ssend to bow
        if(event.getCurrentItem().getType() == Material.BOW) {
            player.openInventory(rangedBuyMenu.rangedBuy(player));
            return;
        }

        // if clicked on potion send to potion
        if(event.getCurrentItem().getType() == Material.BREWING_STAND) {
            player.openInventory(potionsBuyMenu.potionsBuy(player));
            return;
        }

        // if clicked brewing stand ssend to potion
        if(event.getCurrentItem().getType() == Material.BREWING_STAND) {
            player.openInventory(rangedBuyMenu.rangedBuy(player));
            return;
        }
    }
}
