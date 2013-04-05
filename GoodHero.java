
public class GoodHero extends Character
{
	protected static int crit; // Chance to Crit... Used by CritChance.java... Can be modified by items
	protected int accuracy; // Chance to hit... Used by HitChance.java... Can be modified by items
	 
	GoodHero()
	{
		
	}
	
	GoodHero(String Name, int Strength, int Armor, int Accuracy, int Crit)
	{
		name = Name;
		strength = Strength;
		armor = Armor;
		accuracy = Accuracy;
		crit = Crit;
		damage = strength;
		health = strength*10;
	}
	
	public int getAccuracy() 
	{
		return accuracy;
	}
	public void setAccuracy(int accuracy)
	{
		this.accuracy = accuracy;
	}
	
	public int getCrit() 
	{
		return crit;
	}
	public void setCrit(int crit)
	{
		this.crit = crit;
	}
}
