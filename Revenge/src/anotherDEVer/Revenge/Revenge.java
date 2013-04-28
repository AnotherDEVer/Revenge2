package anotherDEVer.Revenge;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.*;
import org.bukkit.command.*;
import org.bukkit.event.entity.*;
import org.bukkit.*;

public final class Revenge extends JavaPlugin
{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("revenge"))
		{
			if ((sender instanceof Player) == true)
			{
				Player player = (Player) sender;
				
				try
				{
					EntityDamageByEntityEvent play = (EntityDamageByEntityEvent) player.getLastDamageCause();
				
					Entity culprit = play.getDamager();
				
					double x;
					double y;
					double z;
				
					Location culLoc = culprit.getLocation();
				
					x = culLoc.getX();
					y = culLoc.getY();
					z = culLoc.getZ();
				
					World world = culprit.getWorld();
				
					world.createExplosion(x,  y, z, 10f, false, false);
				}
				catch(Exception e)
				{
					player.sendMessage("You must be attacked before you can use this.");
				}
			}
			
			else
			{
				sender.sendMessage("Only a player can use this command.");
			}
		}
		return false;
	}
}
