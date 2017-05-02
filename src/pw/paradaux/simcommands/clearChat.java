package pw.paradaux.simcommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import pw.paradaux.simapi.chatHandler;
import pw.paradaux.simapi.prefix;

public class clearChat implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.GOLD + "[SimpleSuite]" + ChatColor.RESET + "Players Only, Silly!");
			return false;
		} else if (sender.hasPermission("simple.clearchat")) {
			if (cmd.getName().equalsIgnoreCase("clearchat") || cmd.getName().equalsIgnoreCase("cc") || cmd.getName().equalsIgnoreCase("clearc")) {
			chatHandler.clearChat(100, p);
			prefix.bIt(p.getDisplayName() + "has cleared chat!", p);
			}
		} return false;
	}
}