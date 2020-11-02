package pl.Pijok.Budowniczy.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import pl.Pijok.Budowniczy.utils.ChatUtils;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){
        Player player = event.getPlayer();
        String world_name = player.getLocation().getWorld().getName();

        String format = "&7[" + world_name + "] " + player.getName() + ": " + "&7" + event.getMessage();
        format = ChatUtils.fixColor(format);

        event.setFormat(format);
    }
}
