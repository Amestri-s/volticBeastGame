package me.adam.volticbeasts.main;


import me.adam.volticbeasts.events.IllegalActions;
import me.adam.volticbeasts.events.KeyBreakEvent;
import me.adam.volticbeasts.mongo.MongoMain;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {

    MongoMain mongoMain;

    public void onEnable() {
        getLogger().info("Loading");

        getServer().getPluginManager().registerEvents(new IllegalActions(), this);
        getServer().getPluginManager().registerEvents(new KeyBreakEvent(), this);
        mongoMain = new MongoMain();

        getLogger().info("Loaded");
    }

    public void onDisable() {
        getLogger().info("Unloaded");
    }

}
