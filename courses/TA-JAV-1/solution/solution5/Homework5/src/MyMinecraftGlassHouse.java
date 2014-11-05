import org.bukkit.Material;


public class MyMinecraftGlassHouse extends MyMinecraftHouse {
	
	public MyMinecraftGlassHouse(String name, int width, int height) {
		super(name, width, height);
	}

	@Override
	public void build() {
		System.out.println("building a house made of " + Material.WOOD  + " called " + name + " of width " + width + " and height " + height);
	}
	
}
