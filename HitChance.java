
public class HitChance
{
	static double random;
	
	public static boolean willItHit(int accuracy) // If the random number is less than the attackers Hit chance, the attack is successful so return true
	{
		random = 1 + (int)(Math.random() * ((100 - 1) + 1));
		
		if (random <= accuracy)
		{
			return true;
		}
		
		else
		{
			return false;
		}		
	}
}
