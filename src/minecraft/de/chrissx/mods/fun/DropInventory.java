package de.chrissx.mods.fun;

import de.chrissx.mods.Semimod;

public class DropInventory extends Semimod {

	public DropInventory() {
		super("DropInventory", "dropinventory");
	}

	@Override
	public void toggle() {
		inventory().dropAllItems();
	}
}
