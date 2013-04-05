import java.util.Scanner;
import javax.swing.SwingUtilities;

public class Game 
{
    public static void main (String[] args)
    {
    	
    	int newHealth; // variable amount for health after a battle takes place 
    	
    	System.out.println("What is your name?");
    	
    	Scanner nameIn = new Scanner(System.in);
    	
    	String responseName = nameIn.nextLine(); // takes in the main characters name
    	
    	// For both hero and enemy, it goes XX(Name, Strength, Armor, Accuracy, Crit)
    	// Creates a Hero with name from above currently with hard-coded values
    	final GoodHero MainHero = new GoodHero(responseName, 100, 25, 95, 5); 
    	// Creates an Enemy with a hard-coded with random values
    	final EnemyHero MainEnemy = new EnemyHero("Bailey", RandomInInterval.randomNumber(50, 100), RandomInInterval.randomNumber(5, 30), RandomInInterval.randomNumber(50, 85), RandomInInterval.randomNumber(0, 10));
    	    	
    	System.out.println("Please help us " + MainHero.getName() + ". You must defeat the evil lord " + MainEnemy.getName() + "! \n");
    	
    	// While both Characters are still alive, ask user to check stats and then attack...
    	while (MainHero.getHealth() > 0  && MainEnemy.getHealth() > 0)
    	{
    		System.out.println("Would you like to Check the Current Stats?: ('1' for yes, '0' for no)");
    		
    		Scanner statsDecisionIn = new Scanner(System.in);
        	
        	int statsResponse = statsDecisionIn.nextInt();
        	
        	if (statsResponse == 1)
        	{
        		OutputStats.outputStats(MainHero, MainEnemy); // Outputs Basic Stats for both Characters
        	}

    		System.out.println("Would you like to Attack (Enter '1') or Run (Enter '2'):");
        	
        	Scanner attackDecisionIn = new Scanner(System.in);
        	
        	int attackResponse = attackDecisionIn.nextInt();
        	
        	if (attackResponse == 1)
        	{
        		newHealth = PhysicalAttack.physicalAttack(MainHero, MainEnemy); // Call a player attack sending in the two characters stats for the battle Class
        		MainEnemy.setHealth(newHealth);  // Set the enemies health to the new value obtained from the battle
        		if (MainEnemy.getHealth() > 0) // if the enemy still has health after the first battle, counter-attack
        		{
        			newHealth = AIAttack.physicalAttack(MainEnemy, MainHero); // Call an AI attack using the two characters stats
            		MainHero.setHealth(newHealth);  // Set the Heroes health to the new value obtained by battle
        		}
        	}
        	
        	if (attackResponse == 2) // Eventually this might do something XD
        	{
            	System.out.println("Cowards run...");
        	}
        	
        	if (MainEnemy.getHealth() > 0) // The Enemy AI attacks if it still has health, Hero counter attacks if he has health
    		{
    			newHealth = AIAttack.physicalAttack(MainEnemy, MainHero);
        		MainHero.setHealth(newHealth); 
        		if (MainHero.getHealth() > 0)
        		{
        			newHealth = PhysicalAttack.physicalAttack(MainHero, MainEnemy);
            		MainEnemy.setHealth(newHealth); 
        		}
    		}  	
        	SwingUtilities.invokeLater(new Runnable() 
        	{
                public void run()
                {
                    ContentScreen.createAndShowGUI(MainHero, MainEnemy);
                }
        	});
    }
 }
}
