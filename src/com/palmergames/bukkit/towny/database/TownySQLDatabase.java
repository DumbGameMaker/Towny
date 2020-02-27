package com.palmergames.bukkit.towny.database;

import com.palmergames.bukkit.towny.object.Nation;
import com.palmergames.bukkit.towny.object.Resident;
import com.palmergames.bukkit.towny.object.Town;
import com.palmergames.bukkit.towny.object.TownBlock;
import com.palmergames.bukkit.towny.object.TownyWorld;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

/**
 * TownyDatabase-implementing class that deals with storing towny objects in SQL Databases
 *
 * @author Lukas Mansour (ArticDive)
 * @author Suneet Tipirneni (Siris)
 * @see Saveable
 * @see TownyDatabase
 */
public final class TownySQLDatabase extends TownyDatabase {
	@Override
	public boolean backup() {
		return false;
	}
	
	@Nonnull
	@Override
	public Map<UUID, Resident> loadResidents() {
		return null;
	}
	
	@Override
	public boolean loadResident(String identifier) {
		return false;
	}
	
	@Nonnull
	@Override
	public Map<UUID, Town> loadTowns() {
		return null;
	}
	
	@Override
	public boolean loadTown(String name) {
		return false;
	}
	
	@Nonnull
	@Override
	public Map<UUID, Nation> loadNations() {
		return null;
	}
	
	@Override
	public boolean loadNation(String name) {
		return false;
	}
	
	@Nonnull
    @Override
	public Map<UUID, TownyWorld> loadWorlds() {
		return null;
	}
	
	@Override
	public boolean loadTownyWorld(String name) {
		return false;
	}
	
	@Nonnull
	@Override
	public Map<UUID, TownBlock> loadTownBlocks() {
		return null;
	}
	
	@Override
	public boolean loadTownBlock(int x, int z, TownyWorld world) {
		return false;
	}

	@Override
	public boolean save(Saveable obj) {
		return false;
	}

	@Override
	public boolean delete(Saveable... objs) {
		return false;
	}
	
	@Override
	public void loadRegenQueue() {
		
	}
	
	@Override
	public void saveRegenQueue() {
		
	}
	
	@Override
	public void saveRegenData() {
		
	}
	
	@Override
	public void loadRegenData() {
		
	}
}