package com.hunstergames.sample;

import org.bukkit.plugin.java.JavaPlugin;

import com.hunstergames.sample.listeners.LoginListener;

// Reference:  http://wiki.bukkit.org/Plugin_Tutorial
public final class SamplePlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		new LoginListener(this);
	}
	
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
}
