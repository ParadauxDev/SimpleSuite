package pw.paradaux.simapi;
import org.bukkit.entity.Player;
import net.md_5.bungee.api.ChatColor;
public class prefix {
	public static void it(String text, Player player) {
		player.sendMessage(ChatColor.GOLD +  "[Simple]" + ChatColor.RESET + text);
	}
}