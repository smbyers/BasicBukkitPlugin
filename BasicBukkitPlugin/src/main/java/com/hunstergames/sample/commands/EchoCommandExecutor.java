package com.hunstergames.sample.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.hunstergames.sample.SamplePlugin;

public class EchoCommandExecutor implements CommandExecutor {
	public static final String CMD_NAME = "echo";
	private final SamplePlugin plugin;
	
	public EchoCommandExecutor(SamplePlugin plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			sender.sendMessage("Hey " + player.getName() + ", you said: " + args[0]);
			return true;
		} else {
			Player target = Bukkit.getServer().getPlayer(args[0]);
			target.sendMessage("Hey " + target.getName() + ", Console said: " + args[1]);
			return true;
		}
	}

}
