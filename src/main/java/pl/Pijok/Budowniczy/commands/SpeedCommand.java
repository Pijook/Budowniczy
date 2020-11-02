package pl.Pijok.Budowniczy.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.Pijok.Budowniczy.utils.ChatUtils;
import pl.Pijok.Budowniczy.utils.Utils;

public class SpeedCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)){
            sender.sendMessage(ChatUtils.fixColor("&cNie mozesz tego zrobic"));
            return true;
        }

        Player player = (Player) sender;

        if(args.length == 1){

            if(!Utils.isInteger(args[0])){
                player.sendMessage(ChatUtils.fixColor("&cMusisz podac liczbe miedzy 1, a 10!"));
                return true;
            }

            int speed = Integer.parseInt(args[0]);

            if(speed < 1 || speed > 10){
                player.sendMessage(ChatUtils.fixColor("&cMusisz podac liczbe miedzy 1, a 10!"));
                return true;
            }

            if(player.isFlying()){
                player.setFlySpeed(speed);
                player.sendMessage(ChatUtils.fixColor("&aUstawiono predkosc latania na &7" + speed));
            }
            else{
                player.setWalkSpeed(speed);
                player.sendMessage(ChatUtils.fixColor("&aUstawiono predkosc chodzenia na &7" + speed));
            }
            return true;

        }

        player.sendMessage(ChatUtils.fixColor("&7/" + label + " <speed>"));
        return true;
    }
}
