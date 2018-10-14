package me.xixdev.test;

import org.bukkit.plugin.java.*;
import org.bukkit.command.*;
import me.xixdev.test.commands.*;

public abstract class TestPlugin extends JavaPlugin
{
    public void onEnable() {
        this.getLogger().warning(data.Prefix + "Das ist nur ein Test Plugin :P");
        this.getCommand("fly").setExecutor((CommandExecutor)new fly());
        this.getCommand("heal").setExecutor((CommandExecutor)new heal());
        this.getCommand("report").setExecutor((CommandExecutor)new report());
    }
}
