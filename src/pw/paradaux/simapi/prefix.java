package pw.paradaux.simapi;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.md_5.bungee.api.ChatColor;
public class prefix {
	public static void sndMsg(String text, Object sender) {
	    if(sender instanceof CommandSender){  
	    	((CommandSender) sender).sendMessage(text);
	    }  
	    else if(sender instanceof Player){
	    	((Player) sender).sendMessage(text);
	   }
	}
	public static void it(String text, Object player) {
		sndMsg(ChatColor.GOLD +  "[Simple] " + ChatColor.YELLOW + text, player);
	}
	public static void bIt(String text) {
		Bukkit.broadcastMessage(ChatColor.GOLD +  "[Simple] " + ChatColor.YELLOW + text);
	}
	public static void headIt(String text, Object player) {	
		sndMsg(ChatColor.YELLOW + "---" + " " + ChatColor.GOLD + text + ChatColor.YELLOW + "---", player);
	}
	public static void seperate(String text, String text2, Object player) {
		sndMsg(ChatColor.GOLD + text + " " + ChatColor.WHITE + text2, player);
	}
}