package com.dre.brewery.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class PlayerFillBottleEvent extends PlayerEvent {

	private static final HandlerList handlers = new HandlerList();
	private final ItemStack bottle;

	public PlayerFillBottleEvent(@NotNull Player who, ItemStack bottle) {
		super(who);
		this.bottle = bottle;
	}

	public ItemStack getBottle() {
		return bottle;
	}

	@NotNull
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
