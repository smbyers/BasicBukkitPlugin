package com.hunstergames.sample;

import java.util.List;

import org.bukkit.plugin.java.JavaPlugin;

import com.hunstergames.sample.commands.EchoCommandExecutor;
import com.hunstergames.sample.listeners.LoginListener;

// Reference:  http://wiki.bukkit.org/Plugin_Tutorial
public final class SamplePlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		
		// save a copy of the default config.xml if one is not there
		this.saveDefaultConfig();
		
		// create an event listenter which will register itself
		new LoginListener(this); 
		
		// register command executor
		this.getCommand(EchoCommandExecutor.CMD_NAME).setExecutor(new EchoCommandExecutor(this));
		
		// read some configuration file values and print to log
		// Reference: http://wiki.bukkit.org/Configuration_API_Reference
		getLogger().info("Configuration value for 'greeting': " + this.getConfig().getString("greeting"));
		List<String> days = this.getConfig().getStringList("days.ofweek");
		getLogger().info("Days from config:");
		for(String day : days) {
			getLogger().info(day);
		}
	}
	
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
}
