import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;


public class BlockListener implements Listener {

	public PreventBlocks plugin;

	public BlockListener(PreventBlocks instance){
		plugin = instance;
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event){
		Player player = event.getPlayer();
		Block block = event.getBlock();
		if(block.getTypeId() == plugin.getConfig().getInt("Worlds.world.prevent")){
			event.setCancelled(true);
			player.sendMessage("You are not allowd to  place tnt in World" + player.getWorld());
		}
		
	}
}
