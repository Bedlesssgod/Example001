package com.bedless.example001.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import org.bukkit.entity.Player;

@CommandAlias("example")
public class ExampleCommand extends BaseCommand {
    @Default
    public void exampleCommand(Player player) {
        player.sendMessage("Hallo");
    }
}
