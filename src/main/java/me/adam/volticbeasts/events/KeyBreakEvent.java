package me.adam.volticbeasts.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class KeyBreakEvent implements Listener {
    @EventHandler
    public void blockBreak(BlockBreakEvent event) {
        if (event.getBlock().getType().equals(Material.SPAWNER)) {
            event.getBlock().setType(Material.REDSTONE_BLOCK);
            Bukkit.getServer().broadcastMessage("§m-----------------------------------------------------");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage("§f" + event.getPlayer().getDisplayName() + " §afound a key!");
            Bukkit.getServer().broadcastMessage(" ");
            Bukkit.getServer().broadcastMessage("§m-----------------------------------------------------");
            //TODO Add more to the message
            for(Player player : Bukkit.getOnlinePlayers()){
                player.sendTitle("§f" + event.getPlayer().getDisplayName() + " §afound a key!", "[] keys remain...", 10, 40, 20);
                player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 10, 10);
                //TODO Add in the key numbers
            }
            //TODO Add mongo stats and other game related events
        }
    }
}
