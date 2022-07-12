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

public class toolsBuyMenu implements Listener {
    public static Inventory toolsBuy(Player player) {
        Inventory toolsBuyInventory = Bukkit.createInventory(player, 54, ChatColor.RED + "Tools");

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
        ItemStack shears = new ItemStack(Material.SHEARS);
        ItemStack woodenPickaxe = new ItemStack(Material.WOODEN_PICKAXE);
        ItemStack woodenAxe = new ItemStack(Material.WOODEN_AXE);

        // wooden pickaxe
        ItemMeta woodenPickaxeMeta = woodenPickaxe.getItemMeta();
        woodenPickaxeMeta.addEnchant(Enchantment.KNOCKBACK, 5, true);
        woodenPickaxe.setItemMeta(woodenPickaxeMeta);

        // wooden axe
        ItemMeta woodenAxeMeta = woodenAxe.getItemMeta();
        woodenAxeMeta.addEnchant(Enchantment.KNOCKBACK, 5, true);
        woodenAxe.setItemMeta(woodenAxeMeta);

        // do upgrades for pickaxe etc
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
        toolsBuyInventory.setItem(0, netherStar);
        toolsBuyInventory.setItem(1, clayBlock);
        toolsBuyInventory.setItem(2, goldSword);
        toolsBuyInventory.setItem(3, chainBoots);
        toolsBuyInventory.setItem(4, stonePickaxe);
        toolsBuyInventory.setItem(5, bow);
        toolsBuyInventory.setItem(6, brewingStand);
        toolsBuyInventory.setItem(7, tnt);

        // set the glass panes
        toolsBuyInventory.setItem(13, greenWindow);
        toolsBuyInventory.setItem(10, firstGrayWindow);
        toolsBuyInventory.setItem(11, secondGrayWindow);
        toolsBuyInventory.setItem(12, thirdGrayWindow);
        toolsBuyInventory.setItem(9, fourthGrayWindow);
        toolsBuyInventory.setItem(14, fifthGrayWindow);
        toolsBuyInventory.setItem(15, sixthGrayWindow);
        toolsBuyInventory.setItem(16, seventhGrayWindow);
        toolsBuyInventory.setItem(17, eightGrayWindow);

        // set tools shit
        toolsBuyInventory.setItem(19, shears);
        toolsBuyInventory.setItem(20, woodenPickaxe);
        toolsBuyInventory.setItem(21, woodenAxe);

        return toolsBuyInventory;
    }
}
