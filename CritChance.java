public class CritChance
{
	static double random;
	
	public static boolean willItCrit(int crit) // If the random number is less than the attackers Crit chance, it is a critical strike so return true
	{
		random = 1 + (int)(Math.random() * ((100 - 1) + 1));
		
		if (random <= crit)
		{
			return true;
		}
		
		else
		{
			return false;
		}		
	}
}