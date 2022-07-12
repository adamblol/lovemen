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

public class meleeBuyMenu implements Listener {

    public static Inventory meleeBuy(Player player) {
        Inventory meleeBuyInventory = Bukkit.createInventory(player, 54, ChatColor.RED + "Melee");

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
        ItemStack stoneSword = new ItemStack(Material.STONE_SWORD);
        ItemStack ironSword = new ItemStack(Material.IRON_SWORD);
        ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
        ItemStack kbStick = new ItemStack(Material.STICK);

        // edit items
        ItemMeta kbStickMeta = kbStick.getItemMeta();
        kbStickMeta.addEnchant(Enchantment.KNOCKBACK, 5, true);
        kbStick.setItemMeta(kbStickMeta);

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
        meleeBuyInventory.setItem(0, netherStar);
        meleeBuyInventory.setItem(1, clayBlock);
        meleeBuyInventory.setItem(2, goldSword);
        meleeBuyInventory.setItem(3, chainBoots);
        meleeBuyInventory.setItem(4, stonePickaxe);
        meleeBuyInventory.setItem(5, bow);
        meleeBuyInventory.setItem(6, brewingStand);
        meleeBuyInventory.setItem(7, tnt);

        // set the glass panes
        meleeBuyInventory.setItem(11, greenWindow);
        meleeBuyInventory.setItem(10, firstGrayWindow);
        meleeBuyInventory.setItem(9, secondGrayWindow);
        meleeBuyInventory.setItem(12, thirdGrayWindow);
        meleeBuyInventory.setItem(13, fourthGrayWindow);
        meleeBuyInventory.setItem(14, fifthGrayWindow);
        meleeBuyInventory.setItem(15, sixthGrayWindow);
        meleeBuyInventory.setItem(16, seventhGrayWindow);
        meleeBuyInventory.setItem(17, eightGrayWindow);

        // set the weapons shit
        meleeBuyInventory.setItem(19, stoneSword);
        meleeBuyInventory.setItem(20, ironSword);
        meleeBuyInventory.setItem(21, diamondSword);
        meleeBuyInventory.setItem(22, kbStick);

        return meleeBuyInventory;
    }

}
