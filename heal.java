package me.xixdev.test.commands;

import org.bukkit.command.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import me.xixdev.test.*;

public class heal implements CommandExecutor
{
    public boolean onCommand(final CommandSender p, final Command command, final String s, final String[] args) {
        final Player p2 = Bukkit.getServer().getPlayer(args[0]);
        if (p instanceof Player) {
            if (p.hasPermission("test.heal")) {
                if (args[0] == null) {
                    ((Player)p).setHealth(20.0);
                    p.sendMessage(data.Prefix + "Du bist geheilt!");
                    return true;
                }
                if (p2 != null) {
                    p2.setHealth(20.0);
                    p.sendMessage(data.Prefix + p2 + " ist geheilt!");
                    return true;
                }
                p.sendMessage(data.Prefix + p2 + " ist kein Spieler der online ist!");
                return false;
            }
            else {
                p.sendMessage(data.Prefix + "Keine Rechte!");
            }
        }
        return false;
    }
}
