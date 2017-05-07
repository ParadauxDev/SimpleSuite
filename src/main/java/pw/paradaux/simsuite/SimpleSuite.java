package pw.paradaux.simsuite;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import pw.paradaux.simapi.ChatHandler;
import pw.paradaux.simcommands.*;

import java.io.File;
import java.util.Arrays;

public class SimpleSuite extends JavaPlugin {
    public static SimpleSuite instance;
    private FileConfiguration config;
    private FileConfiguration lang;
    private File configFile;
    private File langFile;

	public void onEnable() {
	    instance = this;

		//Gamemode added v0.01
		this.getCommand("gamemode").setExecutor(new GamemodeCommand());
		this.getCommand("gamemode").setAliases(Arrays.asList("gm", "creative", "survival", "adventure", "spectator", "gmc", "gms", "gma", "gmsp"));

		//Clearchat added v0.03
		this.getCommand("clearchat").setExecutor(new ClearChatCommand());
		this.getCommand("clearchat").setAliases(Arrays.asList("clearc", "cc"));

		//Simple Main Commands added v0.03
		this.getCommand("simple").setExecutor(new SimpleSuiteCommand());

		//chatEvents for ChatHandler API added 0.03
		getServer().getPluginManager().registerEvents(new ChatHandler(), this);
		this.getCommand("mutechat").setExecutor(new MuteChatCommand());

		// Message Command (added v.04)
        this.getCommand("msg").setExecutor(new MessageCommand());
        this.getCommand("msg").setAliases(Arrays.asList("w", "whisper", "message", "t", "tell"));

        loadFiles();
	}

	public void onDisable() {
		
	}

	public static String getMessage(String type)
    {
        return ChatColor.translateAlternateColorCodes('&', SimpleSuite.instance.lang.getString(type));
    }

    public void loadFiles()
    {
        config = getConfig();
        config.options().copyDefaults(true);
        saveConfig();
        configFile = new File(getDataFolder(), "config.yml");

        lang = YamlConfiguration.loadConfiguration(getResource("lang.yml"));
    }
}
