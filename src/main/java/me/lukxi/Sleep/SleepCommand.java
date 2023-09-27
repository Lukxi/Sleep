package me.lukxi.Sleep;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SleepCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
                if (p.hasPermission("sleep.command")) {
                    if (Sleep.sleepList.contains(p.getName())){
                        Sleep.sleepList.remove(p.getName());
                        p.sendMessage(MiniMessage.miniMessage().deserialize(Sleep.PREFIX + "<color:gray>Phantome spawnen für dich nun wieder."));
                    }else {
                        Sleep.sleepList.add(p.getName());
                        p.setStatistic(Statistic.TIME_SINCE_REST, 0);
                        p.sendMessage(MiniMessage.miniMessage().deserialize(Sleep.PREFIX  + "<color:gray>Du hast erfolgreich geschlafen, für dich spawnen keine Phantome mehr!"));
                    }
                    return true;
                }
        }
        return false;
    }

}
