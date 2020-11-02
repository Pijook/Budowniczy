package pl.Pijok.Budowniczy.utils;

import org.bukkit.ChatColor;

public class ChatUtils {

    public static String fixColor(String message){
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
