package pw.paradaux.simsuite;
import org.bukkit.plugin.java.JavaPlugin;

import pw.paradaux.simapi.chatHandler;
import pw.paradaux.simcommands.clearChat;
import pw.paradaux.simcommands.gamemodeCMD;
import pw.paradaux.simcommands.muteCMD;
import pw.paradaux.simcommands.simpleCMD;
public class SimpleSuite extends JavaPlugin {
	public void onEnable() {
		//Gamemode added v0.01
		this.getCommand("gamemode").setExecutor(new gamemodeCMD());
		this.getCommand("gamemode").setAliases(Arrays.asList("gm", "creative","survival", "adventure", "spectator", "gmc", "gms", "gma", "gmsp"));
		//Clearchat added v0.03
		this.getCommand("clearchat").setExecutor(new clearChat());
		this.getCommand("clearchat").setAliases(Arrays.asList("clearc", "cc"));
		//Simple Main Commands added v0.03
		this.getCommand("simple").setExecutor(new simpleCMD());
		//chatEvents for chatHandler API added 0.03
		getServer().getPluginManager().registerEvents(new chatHandler(), this);
		this.getCommand("mutechat").setExecutor(new muteCMD());
	}
	public void onDisable() {
		
	}
}
