import org.bukkit.plugin.java.JavaPlugin;


public class ConfigStuff extends JavaPlugin {

	public int getConfigValues(){
		return this.getConfig().getInt("Worlds.world.prevent");
	}
}
