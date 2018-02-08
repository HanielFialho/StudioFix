package Principal;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import InventoryFIx.CorreçãoCritica;
import MobSpawners.MobSpawnerDupe;
import PluginsExternos.NameTag;
import Teleportes.EnderPearlFix;
import Teleportes.NetherFix;
import Teleportes.PlayerDeathFix;

public class Main extends JavaPlugin {

	public static Main getPlugin() {
		return JavaPlugin.getPlugin(Main.class);
	}

	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage(
				ChatColor.YELLOW.toString() + ChatColor.ITALIC.toString() + "StudioFix - Developed by HanielFialho");
		Bukkit.getConsoleSender().sendMessage("");
		RegistrarEventos();
		saveDefaultConfig();
	}

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("StudioFix - Developed in Brazil");
		Bukkit.getConsoleSender().sendMessage("");
	}

	private void RegistrarEventos() {
		getServer().getPluginManager().registerEvents(new PluginsExternos.PlayerVaultsFix(), this);
		getServer().getPluginManager().registerEvents(new Anvil.RenameFixAnvil(), this);
		getServer().getPluginManager().registerEvents(new Anvil.AnvilStacksFix(), this);
		getServer().getPluginManager().registerEvents(new Bussola.BussolaFix(), this);
		getServer().getPluginManager().registerEvents(new PluginsExternos.Holograms(), this);
		getServer().getPluginManager().registerEvents(new EnderPearlFix(), this);
		getServer().getPluginManager().registerEvents(new MobSpawnerDupe(), this);
		getServer().getPluginManager().registerEvents(new PlayerDeathFix(), this);
		getServer().getPluginManager().registerEvents(new NetherFix(), this);
		getServer().getPluginManager().registerEvents(new CorreçãoCritica(), this);
		getServer().getPluginManager().registerEvents(new NameTag(), this);
	}
}