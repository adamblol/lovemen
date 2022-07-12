package utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class quickBuyMenu implements Listener {
    public static Inventory quickBuy(Player player) {
        Inventory quickBuyInventory = Bukkit.createInventory(player, 54, ChatColor.RED + "Quick Buy");

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
        ItemStack wool = new ItemStack(Material.WHITE_WOOL, 16);
        ItemStack stoneSword = new ItemStack(Material.STONE_SWORD);
        ItemStack chainBoots1 = new ItemStack(Material.CHAINMAIL_BOOTS);
        ItemStack woodenAxe = new ItemStack(Material.WOODEN_AXE);
        ItemStack normalBow = new ItemStack(Material.BOW);
        ItemStack speedPotion = new ItemStack(Material.POTION);
        ItemStack tnt1 = new ItemStack(Material.TNT);

        // third row
        ItemStack wood = new ItemStack(Material.OAK_PLANKS, 16);
        ItemStack ironSword = new ItemStack(Material.IRON_SWORD);
        ItemStack ironBoots = new ItemStack(Material.IRON_BOOTS);
        ItemStack woodenPickaxe = new ItemStack(Material.WOODEN_PICKAXE);
        ItemStack sixArrows = new ItemStack(Material.ARROW, 6);
        ItemStack invisiblePotion = new ItemStack(Material.POTION);
        ItemStack waterBucket = new ItemStack(Material.WATER_BUCKET);

        // fourth row right now just red pain glass until i make a swap feature and add own items feature for all of this
        ItemStack temp1 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemStack temp2 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemStack temp3 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemStack temp4 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemStack temp5 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemStack temp6 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemStack temp7 = new ItemStack(Material.RED_STAINED_GLASS_PANE);

        // fifth row
        ItemStack compass = new ItemStack(Material.COMPASS);
        ItemStack blazePowder = new ItemStack(Material.BLAZE_POWDER);

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

        // temp shit
        ItemMeta temp11 = temp1.getItemMeta();
        temp11.setUnbreakable(true);
        temp1.setItemMeta(temp11);

        ItemMeta temp12 = temp2.getItemMeta();
        temp12.setUnbreakable(true);
        temp2.setItemMeta(temp12);

        ItemMeta temp13 = temp3.getItemMeta();
        temp13.setUnbreakable(true);
        temp3.setItemMeta(temp13);

        ItemMeta temp14 = temp4.getItemMeta();
        temp14.setUnbreakable(true);
        temp4.setItemMeta(temp14);

        ItemMeta temp15 = temp5.getItemMeta();
        temp15.setUnbreakable(true);
        temp5.setItemMeta(temp15);

        ItemMeta temp16 = temp6.getItemMeta();
        temp16.setUnbreakable(true);
        temp6.setItemMeta(temp16);

        ItemMeta temp17 = temp7.getItemMeta();
        temp17.setUnbreakable(true);
        temp7.setItemMeta(temp17);

        // wooden axe
        ItemMeta woodenAxeMeta = woodenAxe.getItemMeta();
        woodenAxeMeta.addEnchant(Enchantment.SILK_TOUCH, 5, true);
        woodenAxe.setItemMeta(woodenAxeMeta);

        // wooden pickaxe
        ItemMeta woodenPickaxeMeta = woodenPickaxe.getItemMeta();
        woodenPickaxeMeta.addEnchant(Enchantment.KNOCKBACK, 5, true);
        woodenPickaxe.setItemMeta(woodenPickaxeMeta);


        // set the items in the quick buy menu
        quickBuyInventory.setItem(0, netherStar);
        quickBuyInventory.setItem(1, clayBlock);
        quickBuyInventory.setItem(2, goldSword);
        quickBuyInventory.setItem(3, chainBoots);
        quickBuyInventory.setItem(4, stonePickaxe);
        quickBuyInventory.setItem(5, bow);
        quickBuyInventory.setItem(6, brewingStand);
        quickBuyInventory.setItem(7, tnt);

        // set the glass panes
        quickBuyInventory.setItem(9, greenWindow);
        quickBuyInventory.setItem(10, firstGrayWindow);
        quickBuyInventory.setItem(11, secondGrayWindow);
        quickBuyInventory.setItem(12, thirdGrayWindow);
        quickBuyInventory.setItem(13, fourthGrayWindow);
        quickBuyInventory.setItem(14, fifthGrayWindow);
        quickBuyInventory.setItem(15, sixthGrayWindow);
        quickBuyInventory.setItem(16, seventhGrayWindow);
        quickBuyInventory.setItem(17, eightGrayWindow);

        // set second row
        quickBuyInventory.setItem(19, wool);
        quickBuyInventory.setItem(20, stoneSword);
        quickBuyInventory.setItem(21, chainBoots1);
        quickBuyInventory.setItem(22, woodenAxe);
        quickBuyInventory.setItem(23, normalBow);
        quickBuyInventory.setItem(24, speedPotion);
        quickBuyInventory.setItem(25, tnt1);

        // set third row
        quickBuyInventory.setItem(28, wood);
        quickBuyInventory.setItem(29, ironSword);
        quickBuyInventory.setItem(30, ironBoots);
        quickBuyInventory.setItem(31, woodenPickaxe);
        quickBuyInventory.setItem(32, sixArrows);
        quickBuyInventory.setItem(33, invisiblePotion);
        quickBuyInventory.setItem(34, waterBucket);

        // set fourth row
        quickBuyInventory.setItem(37, temp1);
        quickBuyInventory.setItem(38, temp2);
        quickBuyInventory.setItem(39, temp3);
        quickBuyInventory.setItem(40, temp4);
        quickBuyInventory.setItem(41, temp5);
        quickBuyInventory.setItem(42, temp6);
        quickBuyInventory.setItem(43, temp7);

        // set fifth row
        quickBuyInventory.setItem(45, compass);
        quickBuyInventory.setItem(53, blazePowder);

        return quickBuyInventory;
    }
}
