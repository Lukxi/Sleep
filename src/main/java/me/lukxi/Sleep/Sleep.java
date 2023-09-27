package me.lukxi.Sleep;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.ArrayList;


public class Sleep extends JavaPlugin implements CommandExecutor {

    public static ArrayList<String> sleepList = new ArrayList<>();
    public static String PREFIX ="<bold><color:#232424>[<color:#a10a6c>Sleep<color:#232424>]</bold> ";
    @Override
    public void onEnable() {
        getCommand("sleep").setExecutor(new SleepCommand());
        Bukkit.getPluginManager().registerEvents(new PhantomListner(), this);

    }


}
