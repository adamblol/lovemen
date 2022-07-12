package utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class armorBuyMenu implements Listener {
    public static Inventory armorBuy(Player player) {
        Inventory armorBuyInventory = Bukkit.createInventory(player, 54, ChatColor.RED + "Armor");

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

        // second row
        ItemStack chainMailBoots = new ItemStack(Material.CHAINMAIL_BOOTS);
        ItemStack ironBoots = new ItemStack(Material.IRON_BOOTS);
        ItemStack diamondBoots = new ItemStack(Material.DIAMOND_BOOTS);

        // edit items
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
        armorBuyInventory.setItem(0, netherStar);
        armorBuyInventory.setItem(1, clayBlock);
        armorBuyInventory.setItem(2, goldSword);
        armorBuyInventory.setItem(3, chainBoots);
        armorBuyInventory.setItem(4, stonePickaxe);
        armorBuyInventory.setItem(5, bow);
        armorBuyInventory.setItem(6, brewingStand);
        armorBuyInventory.setItem(7, tnt);

        // set the glass panes
        armorBuyInventory.setItem(12, greenWindow);
        armorBuyInventory.setItem(10, firstGrayWindow);
        armorBuyInventory.setItem(11, secondGrayWindow);
        armorBuyInventory.setItem(9, thirdGrayWindow);
        armorBuyInventory.setItem(13, fourthGrayWindow);
        armorBuyInventory.setItem(14, fifthGrayWindow);
        armorBuyInventory.setItem(15, sixthGrayWindow);
        armorBuyInventory.setItem(16, seventhGrayWindow);
        armorBuyInventory.setItem(17, eightGrayWindow);

        // set the armor shit
        armorBuyInventory.setItem(19, chainMailBoots);
        armorBuyInventory.setItem(20, ironBoots);
        armorBuyInventory.setItem(21, diamondBoots);

        return armorBuyInventory;
    }
}
