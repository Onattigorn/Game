
public class Character 
{
	protected String name;
	protected int strength; // Main Modifier for Damage and Health... Can be modified by items and leveling up
	protected int armor; // Reduces enemy physical attacks... Can be modified by items
	protected int accuracy; // Chance to hit... Used by HitChance.java... Can be modified by items
	protected int damage; // How much damage the Hero deals... Modified by items and Strength
	protected int health; // How much health the Hero has... Modified by items strength and leveling up
	 
	Character()
	{
		
	}
	
	Character(String Name, int Strength, int Armor, int Accuracy)
	{
		name = Name;
		strength = Strength;
		armor = Armor;
		accuracy = Accuracy;
		damage = strength;
		health = strength;
	}
	
	public int getStrength()
	{
		return strength;
	}
	public void setStrength(int strength) 
	{
		this.strength = strength;
	}
	public int getArmor()
	{
		return armor;
	}
	public void setArmor(int armor)
	{
		this.armor = armor;
	}
	public int getAccuracy() 
	{
		return accuracy;
	}
	public void setAccuracy(int accuracy)
	{
		this.accuracy = accuracy;
	}
	public int getDamage() 
	{
		return damage;
	}
	public void setDamage(int damage) 
	{
		this.damage = damage;
	}
	public int getHealth() 
	{
		return health;
	}
	public void setHealth(int health) 
	{
		this.health = health;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}

