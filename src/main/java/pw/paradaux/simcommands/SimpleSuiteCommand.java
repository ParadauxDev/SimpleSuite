package pw.paradaux.simcommands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class SimpleSuiteCommand extends CommandBase {
	public SimpleSuiteCommand() {
		super("simple", "", false, "/simple");
	}

	@Override
	public CommandResult run(CommandSender sender, String[] args, String label) {
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Version &8>> &7You're running SimpleSuite v0.5. Developed by Paradaux and IntelInside. For support, wiki, source code, and more, visit &6https://github.com/ParadauxDev/SimpleSuite&7."));
		return CommandResult.SUCCESS;
	}
}
