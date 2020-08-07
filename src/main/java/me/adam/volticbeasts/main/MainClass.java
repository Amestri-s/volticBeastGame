package me.adam.volticbeasts.main;

import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {

    public void onEnable() {
        getLogger().info("Loading");



        getLogger().info("Loaded");
    }

    public void onDisable() {
        getLogger().info("Unloaded");
    }

}
