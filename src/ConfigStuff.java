import org.bukkit.plugin.java.JavaPlugin;


public class ConfigStuff extends JavaPlugin {

	public PreventBlocks plugin;
	public ConfigStuff(PreventBlocks instance){
		plugin = instance;
	}
	public void UpdateConfig(){
		int warnBlocks = this.getConfig().getInt("Worlds.world.warn");
		if(warnBlocks == 0){
			this.getConfig().set("Worlds.world.warn", 46);
		}
		
	}
}
