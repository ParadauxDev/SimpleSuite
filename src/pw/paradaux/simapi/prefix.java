package pw.paradaux.simapi;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import net.md_5.bungee.api.ChatColor;
public class prefix {
	public static void it(String text, Player player) {
		player.sendMessage(ChatColor.GOLD +  "[Simple] " + ChatColor.YELLOW + text);
	}
	public static void bIt(String text, Player player) {
		Bukkit.broadcastMessage(ChatColor.GOLD +  "[Simple] " + ChatColor.YELLOW + text);
	}
	public static void headIt(String text, Player player) {	
		player.sendMessage(ChatColor.YELLOW + "---" + " " + ChatColor.GOLD + text + ChatColor.YELLOW + "---");
	}
	public static void seperate(String text, String text2, Player player) {
		player.sendMessage(ChatColor.GOLD + text + " " + ChatColor.WHITE + text2);
	}
}