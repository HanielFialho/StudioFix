package MobSpawners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import Principal.Main;

public class MobSpawnerDupe implements Listener {

	@EventHandler
	public void QuebrarMobsSpawner(BlockBreakEvent e) {
		Block block = e.getBlock();
		if (block.getType() == Material.MOB_SPAWNER) {
			if (Main.getPlugin().getConfig().getBoolean("Fix.MobsSpawners.Xp") == true) {
				e.setExpToDrop(0);
			} else {

			}
		}
	}
}
