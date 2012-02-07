import java.io.File;
import java.util.logging.Logger;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class PreventBlocks extends JavaPlugin implements Listener {
	Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable(){
        getServer().getPluginManager().registerEvents(new BlockListener(this), this);
		log.info("plugin enabled");
		File configFile = new File(this.getDataFolder(), "config.yml");
		if(!configFile.exists())
			this.saveDefaultConfig();
	}
	public void onDisable(){
		
	}
	
}
