package utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class potionsBuyMenu implements Listener {
    public static Inventory potionsBuy(Player player) {
        Inventory potionsBuyInventory = Bukkit.createInventory(player, 54, ChatColor.RED + "Potions");

        // store the items to add to the quick boy
        // first row
        ItemStack netherStar = new ItemStack(Material.NETHER_STAR);
        ItemStack clayBlock = new ItemStack(Material.CLAY);
        ItemStack goldSword = new ItemStack(Material.GOLDEN_SWORD);
        ItemStack chainBoots = new ItemStack(Material.CHAINMAIL_BOOTS);
        ItemStack stonePickaxe = new ItemStack(Material.STONE_PICKAXE);
        ItemStack bow = new ItemStack(Material.BOW);
        ItemStack brewingStand = new ItemStack(Material.BREWING_STAND);
        ItemStack tnt = new ItemStack(Material.TNT);

        // stained glass panels
        ItemStack greenWindow = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        ItemStack firstGrayWindow = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemStack secondGrayWindow = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemStack thirdGrayWindow = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemStack fourthGrayWindow = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemStack fifthGrayWindow = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemStack sixthGrayWindow = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemStack seventhGrayWindow = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemStack eightGrayWindow = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);

        ItemStack speedPotion = new ItemStack(Material.POTION);
        ItemStack jumpPotion = new ItemStack(Material.POTION);
        ItemStack invisiblePotion = new ItemStack(Material.POTION);

        // nether star
        ItemMeta netherstarMeta = netherStar.getItemMeta();
        netherstarMeta.setUnbreakable(true);
        netherStar.setItemMeta(netherstarMeta);

        // clay
        ItemMeta clayBlockMeta = clayBlock.getItemMeta();
        clayBlockMeta.setUnbreakable(true);
        clayBlock.setItemMeta(clayBlockMeta);

        // gold sword
        ItemMeta goldSwordMeta = goldSword.getItemMeta();
        goldSwordMeta.setUnbreakable(true);
        goldSword.setItemMeta(goldSwordMeta);

        // boots
        ItemMeta boots = chainBoots.getItemMeta();
        boots.setUnbreakable(true);
        chainBoots.setItemMeta(boots);

        // pickaxe
        ItemMeta pickaxe = stonePickaxe.getItemMeta();
        pickaxe.setUnbreakable(true);
        stonePickaxe.setItemMeta(pickaxe);

        // bow
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setUnbreakable(true);
        bow.setItemMeta(bowMeta);

        //potions one
        ItemMeta potions = brewingStand.getItemMeta();
        potions.setUnbreakable(true);
        brewingStand.setItemMeta(potions);

        // utilitys
        ItemMeta utils = tnt.getItemMeta();
        utils.setUnbreakable(true);
        tnt.setItemMeta(utils);

        // set the items in the quick buy menu
        potionsBuyInventory.setItem(0, netherStar);
        potionsBuyInventory.setItem(1, clayBlock);
        potionsBuyInventory.setItem(2, goldSword);
        potionsBuyInventory.setItem(3, chainBoots);
        potionsBuyInventory.setItem(4, stonePickaxe);
        potionsBuyInventory.setItem(5, bow);
        potionsBuyInventory.setItem(6, brewingStand);
        potionsBuyInventory.setItem(7, tnt);

        // set the glass panes
        potionsBuyInventory.setItem(15, greenWindow);
        potionsBuyInventory.setItem(10, firstGrayWindow);
        potionsBuyInventory.setItem(11, secondGrayWindow);
        potionsBuyInventory.setItem(12, thirdGrayWindow);
        potionsBuyInventory.setItem(13, fourthGrayWindow);
        potionsBuyInventory.setItem(14, fifthGrayWindow);
        potionsBuyInventory.setItem(9, sixthGrayWindow);
        potionsBuyInventory.setItem(16, seventhGrayWindow);
        potionsBuyInventory.setItem(17, eightGrayWindow);

        // set the potions tab
        potionsBuyInventory.setItem(19, speedPotion);
        potionsBuyInventory.setItem(20, jumpPotion);
        potionsBuyInventory.setItem(21, invisiblePotion);

        return potionsBuyInventory;
    }
}
