package main.java.pw.paradaux.simcommands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import main.java.pw.paradaux.simsuite.SimpleSuite;

public class ClearChatCommand extends CommandBase {
    public ClearChatCommand() {
        super("clearchat", "simple.clearchat", false, "/clearchat");
    }

    @Override
    public CommandResult run(CommandSender sender, String[] args, String label) {
        for(int i = 0; i <= 100; i++)
        {
            Bukkit.broadcastMessage("");
        }
        Bukkit.broadcastMessage(SimpleSuite.getMessage("chatClearBroadcast").replace("{by}", sender.getName()));
        return CommandResult.SUCCESS;
    }
}