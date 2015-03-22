/**
 * MyMinecraftPlayerInfo.java
 * 
 * Copyright Tinker Academy 2014
 * 
 */

/**
 * @author student
 *
 */
public class MyMinecraftPlayerInfo {
		
	private String listName;
	
	private float experience;
	
	private int foodLevel;
	
	private boolean onGround;
	
	public MyMinecraftPlayerInfo(String listName, float experience,
			int foodLevel, boolean onGround) {
		this.listName = listName;
		this.experience = experience;
		this.foodLevel = foodLevel;
		this.onGround = onGround;
	}

	public String getListName() {
		return listName;
	}

	public float getExperience() {
		return experience;
	}

	public int getFoodLevel() {
		return foodLevel;
	}

	public boolean isOnGround() {
		return onGround;
	}
	
	public void addFoodLevel(int value) {
		if (value > 0) {
			this.foodLevel = this.foodLevel + value;
		}
	}
}
