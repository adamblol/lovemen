package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import utils.quickBuyMenu;

public class bedwarsMenuCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player;

        if(sender instanceof Player) {
            player = (Player) sender;
        } else {
            return true;
        }

        Inventory bedwarsInventory = quickBuyMenu.quickBuy(player);

        player.openInventory(bedwarsInventory);

        return true;
    }
}
