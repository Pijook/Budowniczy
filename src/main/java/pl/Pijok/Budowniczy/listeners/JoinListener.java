package pl.Pijok.Budowniczy.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.Pijok.Budowniczy.utils.ChatUtils;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        event.setJoinMessage(ChatUtils.fixColor("&a&l" + player.getName() + "&7 dolaczyl na serwer"));
    }
}
