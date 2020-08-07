package me.adam.volticbeasts.main;


import me.adam.volticbeasts.events.IllegalActions;
import me.adam.volticbeasts.events.KeyBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {

    public boolean build = false;

    public void onEnable() {
        getLogger().info("Loading");

        getServer().getPluginManager().registerEvents(new IllegalActions(), this);
        getServer().getPluginManager().registerEvents(new KeyBreakEvent(), this);

        getLogger().info("Loaded");
    }

    public void onDisable() {
        getLogger().info("Unloaded");
    }

}
