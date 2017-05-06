package pw.paradaux.simcommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pw.paradaux.simapi.chatHandler;
import pw.paradaux.simapi.languageControl;

public class muteCMD implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			languageControl.playersOnly(sender);
			return false;
		} else {
			if (sender.hasPermission("simple.mutechat")) {
				if (cmd.getName().equalsIgnoreCase("mutechat")) {
					if (!chatHandler.getChatStatus()) {
						chatHandler.setChatMuted(true);
						languageControl.chatMuteOn(sender);
					} else {
						chatHandler.setChatMuted(false);
						languageControl.chatMuteOff(sender);
					}
					return true;
				}
				return false;
			}
		}
		return false;
	}
}
