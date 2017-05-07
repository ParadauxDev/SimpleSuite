package pw.paradaux.simcommands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import pw.paradaux.simapi.ChatHandler;
import pw.paradaux.simsuite.SimpleSuite;

public class MuteChatCommand extends CommandBase {
	public MuteChatCommand() {
		super("mutechat", "simple.mutechat", true, "/mutechat");
	}

	@Override
	public CommandResult run(CommandSender sender, String[] args) {
		if(ChatHandler.isChatMuted())
        {
            ChatHandler.setChatMuted(true);
            Bukkit.broadcastMessage(SimpleSuite.getMessage("chatMute").replace("{action}", "muted").replace("{by}", sender.getName()));
        }
        else
        {
            ChatHandler.setChatMuted(false);
            Bukkit.broadcastMessage(SimpleSuite.getMessage("chatMute").replace("{action}", "unmuted").replace("{by}", sender.getName()));
        }
		return CommandResult.SUCCESS;
	}
}
