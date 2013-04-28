package anotherDEVer.Revenge;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.*;
import org.bukkit.command.*;
import org.bukkit.event.entity.*;

public final class Revenge extends JavaPlugin
{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("revenge"))
		{
			if ((sender instanceof Player) == true)
			{
				Player player = (Player) sender;
				
			}
			
			else
			{
				sender.sendMessage("Only a player can use this command.");
			}
		}
		return false;
	}
}
