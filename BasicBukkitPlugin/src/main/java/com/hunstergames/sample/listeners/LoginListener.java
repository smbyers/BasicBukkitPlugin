package com.hunstergames.sample.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import com.hunstergames.sample.SamplePlugin;

// Reference:  http://wiki.bukkit.org/Event_API_Reference#The_Basics
public final class LoginListener implements Listener {
	SamplePlugin plugin;
	
	public LoginListener(SamplePlugin plugin) {
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onLogin(PlayerLoginEvent event) {
		this.plugin.getLogger().info("Player " + event.getPlayer().getName() + " is logged in!");
	}
}
