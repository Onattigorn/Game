
public class RandomInInterval // Used for obtaining a random number within a defined interval 
{
	public static int randomNumber(int lower, int upper)
	{
		int randomNumber = 0;
		
		randomNumber = lower + (int)(Math.random() * ((upper - lower) + 1));
		
		return randomNumber;
		
	}
}
