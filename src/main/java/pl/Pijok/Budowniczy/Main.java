package pl.Pijok.Budowniczy;

import org.bukkit.plugin.java.JavaPlugin;
import pl.Pijok.Budowniczy.commands.GmCommand;
import pl.Pijok.Budowniczy.commands.SpeedCommand;
import pl.Pijok.Budowniczy.commands.TpCommand;
import pl.Pijok.Budowniczy.listeners.ChatListener;
import pl.Pijok.Budowniczy.listeners.EntitySpawnListener;
import pl.Pijok.Budowniczy.listeners.JoinListener;
import pl.Pijok.Budowniczy.listeners.QuitListener;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getServer().getPluginManager().registerEvents(new QuitListener(), this);
        getServer().getPluginManager().registerEvents(new EntitySpawnListener(), this);

        getCommand("gm").setExecutor(new GmCommand());
        getCommand("speed").setExecutor(new SpeedCommand());
        getCommand("tp").setExecutor(new TpCommand());

    }

    @Override
    public void onDisable() {

    }
}
