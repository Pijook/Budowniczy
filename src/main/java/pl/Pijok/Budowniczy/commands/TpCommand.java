package pl.Pijok.Budowniczy.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.Pijok.Budowniczy.utils.ChatUtils;
import pl.Pijok.Budowniczy.utils.Utils;

public class TpCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)){
            sender.sendMessage(ChatUtils.fixColor("&cNie mozesz tego zrobic"));
            return true;
        }

        Player player = (Player) sender;

        if(args.length == 1){
            String nickname = args[0];

            Player target = Bukkit.getPlayer(nickname);

            if(target == null || !target.isOnline()){
                player.sendMessage(ChatUtils.fixColor("&cTen gracz jest offline!"));
                return true;
            }

            player.teleport(target.getLocation());
            player.sendMessage(ChatUtils.fixColor("&aTeleportowano do gracza &7" + nickname));
            return true;
        }
        if(args.length == 3){
            for(int i = 0; i < 3; i++){
                if(!Utils.isInteger(args[i])){
                    player.sendMessage("&cMusisz podac liczbe!");
                    return true;
                }
            }

            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = Integer.parseInt(args[2]);

            player.teleport(new Location(player.getWorld(), x, y, z));
            player.sendMessage(ChatUtils.fixColor("&aTeleportowano na koordynaty " + x + " " + y + " " + z));
            return true;
        }

        player.sendMessage(ChatUtils.fixColor("&7/" + label + " <nick>"));
        player.sendMessage(ChatUtils.fixColor("&7/" + label + " <x> <y> <z>"));
        return true;
    }
}
