package pl.Pijok.Budowniczy.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class EntitySpawnListener implements Listener {

    @EventHandler
    public void onSpawn(EntitySpawnEvent event){
        event.setCancelled(true);
    }
}
