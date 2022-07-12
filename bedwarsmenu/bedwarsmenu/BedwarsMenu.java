package bedwarsmenu.bedwarsmenu;

import com.google.gson.JsonObject;
import commands.bedwarsMenuCommand;
import listeners.inventoryClickListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BedwarsMenu extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Bedwars menu plugin has been loaded");

        // register plugin
        getServer().getPluginManager().registerEvents(new inventoryClickListener(), this);

        // register command
        getCommand("bedwarsMenu").setExecutor(new bedwarsMenuCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
