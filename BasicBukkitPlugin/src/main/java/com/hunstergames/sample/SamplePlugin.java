package com.hunstergames.sample;

import org.bukkit.plugin.java.JavaPlugin;

import com.hunstergames.sample.commands.EchoCommandExecutor;
import com.hunstergames.sample.listeners.LoginListener;

// Reference:  http://wiki.bukkit.org/Plugin_Tutorial
public final class SamplePlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		new LoginListener(this); // create an event listenter which will register itself
		this.getCommand(EchoCommandExecutor.CMD_NAME).setExecutor(new EchoCommandExecutor(this)); // register cmd executor
	}
	
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
}
