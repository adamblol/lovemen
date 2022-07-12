package utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class rangedBuyMenu implements Listener {
    public static Inventory rangedBuy(Player player) {
        Inventory rangedBuyInventory = Bukkit.createInventory(player, 54, ChatColor.RED + "Ranged");

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
        ItemStack sixArrows = new ItemStack(Material.ARROW, 6);
        ItemStack normalBow = new ItemStack(Material.BOW);
        ItemStack firstEnchantedBow = new ItemStack(Material.BOW);
        ItemStack secondEnchantedBow = new ItemStack(Material.BOW);

        // ya tbh i got no idea what enchants they are too lazy to look
        ItemMeta firstBow = firstEnchantedBow.getItemMeta();
        firstBow.addEnchant(Enchantment.KNOCKBACK, 5, true);
        firstEnchantedBow.setItemMeta(firstBow);

        ItemMeta secondBow = secondEnchantedBow.getItemMeta();
        secondBow.addEnchant(Enchantment.KNOCKBACK, 5, true);
        secondEnchantedBow.setItemMeta(secondBow);

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
        rangedBuyInventory.setItem(0, netherStar);
        rangedBuyInventory.setItem(1, clayBlock);
        rangedBuyInventory.setItem(2, goldSword);
        rangedBuyInventory.setItem(3, chainBoots);
        rangedBuyInventory.setItem(4, stonePickaxe);
        rangedBuyInventory.setItem(5, bow);
        rangedBuyInventory.setItem(6, brewingStand);
        rangedBuyInventory.setItem(7, tnt);

        // set the glass panes
        rangedBuyInventory.setItem(14, greenWindow);
        rangedBuyInventory.setItem(10, firstGrayWindow);
        rangedBuyInventory.setItem(11, secondGrayWindow);
        rangedBuyInventory.setItem(12, thirdGrayWindow);
        rangedBuyInventory.setItem(13, fourthGrayWindow);
        rangedBuyInventory.setItem(9, fifthGrayWindow);
        rangedBuyInventory.setItem(15, sixthGrayWindow);
        rangedBuyInventory.setItem(16, seventhGrayWindow);
        rangedBuyInventory.setItem(17, eightGrayWindow);

        // ranged items shit
        rangedBuyInventory.setItem(19, sixArrows);
        rangedBuyInventory.setItem(20, normalBow);
        rangedBuyInventory.setItem(21, firstEnchantedBow);
        rangedBuyInventory.setItem(22, secondEnchantedBow);

        return rangedBuyInventory;
    }
}
