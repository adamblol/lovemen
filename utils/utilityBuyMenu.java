package utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class utilityBuyMenu implements Listener {
    public static Inventory utilitysBuy(Player player) {
        Inventory utilityBuyInventory = Bukkit.createInventory(player, 54, ChatColor.RED + "Utility");

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

        // utility shit
        ItemStack goldenApple = new ItemStack(Material.GOLDEN_APPLE);
        ItemStack snowBall = new ItemStack(Material.SNOWBALL);
        ItemStack ironGolemEgg = new ItemStack(Material.GHAST_SPAWN_EGG); // is it even the ghast spawn egg ;v
        ItemStack fireCharge = new ItemStack(Material.FIRE_CHARGE);
        ItemStack tnt1 = new ItemStack(Material.TNT);
        ItemStack enderPearl = new ItemStack(Material.ENDER_PEARL);
        ItemStack waterBucket = new ItemStack(Material.WATER_BUCKET);
        ItemStack egg = new ItemStack(Material.EGG);
        ItemStack milkBucket = new ItemStack(Material.MILK_BUCKET);
        ItemStack sponge = new ItemStack(Material.SPONGE, 4);
        ItemStack chest = new ItemStack(Material.CHEST);

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
        utilityBuyInventory.setItem(0, netherStar);
        utilityBuyInventory.setItem(1, clayBlock);
        utilityBuyInventory.setItem(2, goldSword);
        utilityBuyInventory.setItem(3, chainBoots);
        utilityBuyInventory.setItem(4, stonePickaxe);
        utilityBuyInventory.setItem(5, bow);
        utilityBuyInventory.setItem(6, brewingStand);
        utilityBuyInventory.setItem(7, tnt);

        // set the glass panes
        utilityBuyInventory.setItem(16, greenWindow);
        utilityBuyInventory.setItem(10, firstGrayWindow);
        utilityBuyInventory.setItem(11, secondGrayWindow);
        utilityBuyInventory.setItem(12, thirdGrayWindow);
        utilityBuyInventory.setItem(13, fourthGrayWindow);
        utilityBuyInventory.setItem(14, fifthGrayWindow);
        utilityBuyInventory.setItem(15, sixthGrayWindow);
        utilityBuyInventory.setItem(9, seventhGrayWindow);
        utilityBuyInventory.setItem(17, eightGrayWindow);

        // set the utility page
        utilityBuyInventory.setItem(19, goldenApple);
        utilityBuyInventory.setItem(20, snowBall);
        utilityBuyInventory.setItem(21, ironGolemEgg);
        utilityBuyInventory.setItem(22, fireCharge);
        utilityBuyInventory.setItem(23, tnt1);
        utilityBuyInventory.setItem(24, enderPearl);
        utilityBuyInventory.setItem(25, waterBucket);
        utilityBuyInventory.setItem(28, egg);
        utilityBuyInventory.setItem(29, milkBucket);
        utilityBuyInventory.setItem(30, sponge);
        utilityBuyInventory.setItem(31, chest);

        return utilityBuyInventory;
    }
}
