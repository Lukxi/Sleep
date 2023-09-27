package me.lukxi.Sleep;

import com.destroystokyo.paper.event.entity.EntityPathfindEvent;
import com.destroystokyo.paper.event.entity.PhantomPreSpawnEvent;
import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Objects;

public class PhantomListner implements Listener {

    @EventHandler
    public void onPrePhantomSpawn(PhantomPreSpawnEvent e){
        if (Sleep.sleepList.contains(e.getSpawningEntity().getName())) {
            if (e.getSpawningEntity() instanceof Player) {
                Bukkit.broadcastMessage("nix da");
                ((Player) e.getSpawningEntity()).getPlayer().setStatistic(Statistic.TIME_SINCE_REST, 0);
                e.setCancelled(true);
            }
        }
        Bukkit.broadcastMessage("Spawning Phantom for: " + e.getSpawningEntity().getName());
    }
}
