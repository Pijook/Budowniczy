package pl.Pijok.Budowniczy.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.Pijok.Budowniczy.utils.ChatUtils;
import pl.Pijok.Budowniczy.utils.Utils;

import javax.rmi.CORBA.Util;

public class GmCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)){
            sender.sendMessage(ChatUtils.fixColor("&cTa komenda jest tylko dla graczy!"));
            return true;
        }

        Player player = (Player) sender;

        if(args.length == 1){
            String mode = args[0];

            if(!Utils.isInteger(mode)){
                player.sendMessage(ChatUtils.fixColor(("&cMusisz wpisac liczbe od 0 do 3!")));
                return true;
            }

            int gm_mode = Integer.parseInt(mode);

            switch (gm_mode){
                case 0:
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatUtils.fixColor("&7Ustawiono tryb &a&l" + player.getGameMode().name()));
                    break;
                case 1:
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatUtils.fixColor("&7Ustawiono tryb &a&l" + player.getGameMode().name()));
                    break;
                case 2:
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage(ChatUtils.fixColor("&7Ustawiono tryb &a&l" + player.getGameMode().name()));
                    break;
                case 3:
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage(ChatUtils.fixColor("&7Ustawiono tryb &a&l" + player.getGameMode().name()));
                    break;
                default:
                    player.sendMessage(ChatUtils.fixColor(("&cMusisz wpisac liczbe od 0 do 3!")));
                    break;
            }

            return true;
        }


        player.sendMessage(ChatUtils.fixColor("&7/" + label + " <0/1/2/3>"));
        return true;
    }
}
