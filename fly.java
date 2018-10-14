package me.xixdev.test.commands;

import org.bukkit.command.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import me.xixdev.test.*;

public class fly implements CommandExecutor
{
    public boolean onCommand(final CommandSender p, final Command command, final String s, final String[] args) {
        final Player p2 = Bukkit.getServer().getPlayer(args[0]);
        if (p instanceof Player) {
            if (p.hasPermission("test.fly")) {
                if (args[0] == null) {
                    if (((Player)p).isFlying()) {
                        ((Player)p).setAllowFlight(false);
                        ((Player)p).setFlying(false);
                        p.sendMessage(data.Prefix + "Du kannst nun nicht mehr fliegen!");
                    }
                    else {
                        ((Player)p).setAllowFlight(true);
                        ((Player)p).setFlying(true);
                        p.sendMessage(data.Prefix + "Du kannst nun fliegen!");
                    }
                    return true;
                }
                if (p2 != null) {
                    if (p2.isFlying()) {
                        p2.setAllowFlight(false);
                        p2.setFlying(false);
                        p.sendMessage(data.Prefix + args[0] + " kann nun nicht mehr fliegen!");
                    }
                    else {
                        p2.setAllowFlight(true);
                        p2.setFlying(true);
                        p.sendMessage(data.Prefix + args[0] + " kann nun fliegen!");
                    }
                    return true;
                }
                return false;
            }
            else {
                p.sendMessage(data.Prefix + "Keine Rechte!");
            }
        }
        return false;
    }
}
