package pl.Pijok.Budowniczy.utils;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;

public class Debug {

    private static final ConsoleCommandSender console = Bukkit.getConsoleSender();
    private static String prefix = "";

    public static void log(String a) {
        a = prefix + a;
        console.sendMessage(a.replace("&", "§"));
    }

    public static void log(Object a) {
        a = prefix + a;
        console.sendMessage(String.valueOf(a).replace("&", "§"));
    }

}
