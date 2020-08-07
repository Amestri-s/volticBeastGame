package me.adam.volticbeasts.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class IllegalActions implements Listener {
    /*
    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        event.setCancelled(true);
    }


    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        event.setCancelled(true);
    }
    */

    @EventHandler
    public void damageTaken(EntityDamageEvent event) {
        EntityDamageEvent.DamageCause cause = event.getCause();
        if(!(event.getCause() == EntityDamageEvent.DamageCause.ENTITY_ATTACK || event.getCause() == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK || event.getCause() == EntityDamageEvent.DamageCause.PROJECTILE)) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void foodLevelChange(FoodLevelChangeEvent event){
        event.setCancelled(true);
        event.setFoodLevel(20);
    }

}
