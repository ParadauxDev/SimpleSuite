package pw.paradaux.simcommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pw.paradaux.simapi.languageControl;

public class simpleCMD implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			languageControl.playersOnly(sender);
			return false;
		}
		if (cmd.getName().equalsIgnoreCase("simple")) {
			if (args.length > 0) {
				if (args[0].equalsIgnoreCase("help")) {
					languageControl.simpleMenu(sender);
				} else {
					languageControl.simpleMenu(sender);
				}
			} languageControl.simpleMenu(sender);
			return false;
		}
		return false;
	}
}
