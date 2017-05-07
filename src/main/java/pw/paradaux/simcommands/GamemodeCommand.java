package pw.paradaux.simcommands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pw.paradaux.simsuite.SimpleSuite;

import java.util.Arrays;
import java.util.List;

public class GamemodeCommand extends CommandBase {
    public GamemodeCommand() {
        super("gamemode", "simple.gamemode", true, "/gamemode <gamemode> [player]");
    }

    @Override
    public CommandResult run(CommandSender sender, String[] args) {
        if(args.length == 0 || args.length > 2)
        {
            return CommandResult.INVALID_ARGS;
        }
        else if(args.length == 1)
        {
            GameMode gm = getGamemode(args[0]);
            if(gm != null)
            {
                ((Player) sender).setGameMode(gm);
                sender.sendMessage(SimpleSuite.getMessage("selfGamemodeChanged").replace("{gamemode}", gm.name()));
            }
            else
            {
                return CommandResult.INVALID_ARGS;
            }
        }
        else if(args.length == 2)
        {
            if(sender.hasPermission("simple.gamemode.others"))
            {
                GameMode gm = getGamemode(args[0]);
                Player p = Bukkit.getPlayer(args[1]);
                if(gm != null && p != null && p.isOnline())
                {
                    p.setGameMode(gm);
                    sender.sendMessage(SimpleSuite.getMessage("otherGamemodeChanged").replace("{user}", p.getName()).replace("{gamemode}", gm.name()));
                    p.sendMessage(SimpleSuite.getMessage("selfGamemodeChangedByOther").replace("{gamemode}", gm.name()).replace("{by}", sender.getName()));
                }
                else
                {
                    return CommandResult.INVALID_ARGS;
                }
            }
            else
            {
                return CommandResult.NO_PERM;
            }
        }
        return CommandResult.SUCCESS;
    }

    private GameMode getGamemode(String gm)
    {
        List<String> survival = Arrays.asList("survival", "s", "0");
        List<String> creative = Arrays.asList("creative", "c", "1");
        List<String> adventure = Arrays.asList("adventure", "a", "2");
        List<String> spectator = Arrays.asList("spectator", "sp", "3");

        if(survival.contains(gm.toLowerCase()))
        {
            return GameMode.SURVIVAL;
        }
        else if(creative.contains(gm.toLowerCase()))
        {
            return GameMode.CREATIVE;
        }
        else if(adventure.contains(gm.toLowerCase()))
        {
            return GameMode.ADVENTURE;
        }
        else if(spectator.contains(gm.toLowerCase()))
        {
            return GameMode.SPECTATOR;
        }
        return null;
    }
}
