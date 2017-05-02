package pw.paradaux.simcommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import pw.paradaux.simapi.prefix;

public class simpleCMD {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.GOLD + "[SimpleSuite]" + ChatColor.RESET + "Players Only, Silly!");
			return false;
		} if (cmd.getName().equalsIgnoreCase("simple")){
			if (args.length > 0) {
				prefix.headIt(), p);
				sender.sendMessage("");
				sender.sendMessage("");
				sender.sendMessage("");
				sender.sendMessage("");
				sender.sendMessage("");
				sender.sendMessage("");
				
			} else {
				
			}
			}
		return false;
	}
}
