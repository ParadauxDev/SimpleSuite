package pw.paradaux.simsuite;
import org.bukkit.plugin.java.JavaPlugin;
import pw.paradaux.simcommands.gamemodeCMD;
public class SimpleSuite extends JavaPlugin {
	public void onEnable() {
		//Gamemode
		this.getCommand("gamemode").setExecutor(new gamemodeCMD());
		this.getCommand("gm").setExecutor(new gamemodeCMD());
		this.getCommand("creative").setExecutor(new gamemodeCMD());
		this.getCommand("survival").setExecutor(new gamemodeCMD());
		this.getCommand("adventure").setExecutor(new gamemodeCMD());
		this.getCommand("spectator").setExecutor(new gamemodeCMD());
		this.getCommand("gmc").setExecutor(new gamemodeCMD());
		this.getCommand("gms").setExecutor(new gamemodeCMD());
		this.getCommand("gma").setExecutor(new gamemodeCMD());
		this.getCommand("gmsp").setExecutor(new gamemodeCMD());
	}
	public void onDisable() {
		
	}
}
