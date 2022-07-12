package utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class blocksBuyMenu implements Listener {
    public static Inventory blocksBuy(Player player) {
        Inventory blocksBuyInventory = Bukkit.createInventory(player, 54, ChatColor.RED + "Blocks");

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

        // the blocks row
        ItemStack whiteWool = new ItemStack(Material.WHITE_WOOL, 16);
        ItemStack clay = new ItemStack(Material.CLAY, 16);
        ItemStack glass = new ItemStack(Material.GLASS, 4);
        ItemStack endStone = new ItemStack(Material.END_STONE, 24);
        ItemStack ladders = new ItemStack(Material.LADDER, 8);
        ItemStack woodenPlanks = new ItemStack(Material.OAK_PLANKS, 16);
        ItemStack obsidian = new ItemStack(Material.OBSIDIAN, 4);

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
        blocksBuyInventory.setItem(0, netherStar);
        blocksBuyInventory.setItem(1, clayBlock);
        blocksBuyInventory.setItem(2, goldSword);
        blocksBuyInventory.setItem(3, chainBoots);
        blocksBuyInventory.setItem(4, stonePickaxe);
        blocksBuyInventory.setItem(5, bow);
        blocksBuyInventory.setItem(6, brewingStand);
        blocksBuyInventory.setItem(7, tnt);

        // set the glass panes
        blocksBuyInventory.setItem(10, greenWindow);
        blocksBuyInventory.setItem(9, firstGrayWindow);
        blocksBuyInventory.setItem(11, secondGrayWindow);
        blocksBuyInventory.setItem(12, thirdGrayWindow);
        blocksBuyInventory.setItem(13, fourthGrayWindow);
        blocksBuyInventory.setItem(14, fifthGrayWindow);
        blocksBuyInventory.setItem(15, sixthGrayWindow);
        blocksBuyInventory.setItem(16, seventhGrayWindow);
        blocksBuyInventory.setItem(17, eightGrayWindow);

        // set the blocks row
        blocksBuyInventory.setItem(19, whiteWool);
        blocksBuyInventory.setItem(20, clay);
        blocksBuyInventory.setItem(21, glass);
        blocksBuyInventory.setItem(22, endStone);
        blocksBuyInventory.setItem(23, ladders);
        blocksBuyInventory.setItem(24, woodenPlanks);
        blocksBuyInventory.setItem(25, obsidian);

        return blocksBuyInventory;
    }
}
