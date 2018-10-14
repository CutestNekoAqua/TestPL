package me.xixdev.test.commands;

import org.bukkit.command.*;
import me.xixdev.test.*;
import org.bukkit.*;

public class report implements CommandExecutor
{
    public boolean onCommand(final CommandSender p, final Command command, final String s, final String[] args) {
        if (args[0] != null && args[1] != null) {
            Bukkit.broadcast(data.Prefix + ">> Neuer Report", "test.reports");
            Bukkit.broadcast("    Reporter: " + p, "test.reports");
            Bukkit.broadcast("    Spieler: " + args[0], "test.reports");
            Bukkit.broadcast("    Grund: " + args[1], "test.reports");
            p.sendMessage("Report wurde allen Teamlern die online sind gesendet!");
            return true;
        }
        p.sendMessage(data.Prefix + "Syntax: /report <Spieler> <Grund>");
        return false;
    }
}
