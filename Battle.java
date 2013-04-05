
public class Battle 
{
	static int battleDamage;
	
	 public static int battle(int attackerDamage, int defenderArmor)
	 {
		 battleDamage = attackerDamage - defenderArmor;
		 
		 return battleDamage; 
	 }
}
