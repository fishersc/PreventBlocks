import org.bukkit.plugin.java.JavaPlugin;


public class ConfigStuff extends JavaPlugin {

<<<<<<< HEAD
	public PreventBlocks plugin;
	public ConfigStuff(PreventBlocks instance){
		plugin = instance;
	}
=======
>>>>>>> parent of 23e8452... Revert 4022579d908f70b0cf1af824aae7a58874edddb3^..HEAD
	public void UpdateConfig(){
		int warnBlocks = this.getConfig().getInt("Worlds.world.warn");
		if(warnBlocks == 0){
			this.getConfig().set("Worlds.world.warn", 46);
		}
		
	}
}
