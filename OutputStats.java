
public class OutputStats 
{
	public static void outputStats (GoodHero one, EnemyHero two)
	{
		System.out.println(one.getName() + " has " + one.getStrength() + " Strength.");
    	System.out.println(one.getArmor() + " Armor.");
    	System.out.println(one.getAccuracy() + "% Hit Chance.");
    	System.out.println(one.getHealth() + " Health. \n");
    	
    	System.out.println(two.getName() + " has " + two.getStrength() + " Strength.");
    	System.out.println(two.getArmor() + " Armor.");
    	System.out.println(two.getAccuracy() + "% Hit Chance.");
    	System.out.println(two.getHealth() + " Health. \n");
	}

}
