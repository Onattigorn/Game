public class AIAttack 
{
	public static int physicalAttack(EnemyHero one, GoodHero two)
	 {
		
		boolean didItHit;
		boolean didItCrit;
		int afterBattleDamage;
		int newHealth = two.getHealth();
		
		didItHit = HitChance.willItHit(one.getAccuracy());
			
		if (didItHit == true)
		{
			afterBattleDamage = Battle.battle(one.getDamage(), two.getArmor());
			didItCrit = CritChance.willItCrit(one.getCrit());
			if (didItCrit == true)
			{
			System.out.println("Critical Strike!!!");
			System.out.println(one.getName() + " Dealt " + (afterBattleDamage*2) + " damage to " + two.getName());
			newHealth = two.getHealth() - (afterBattleDamage*2) + two.getArmor();
			return newHealth;
			}
				
			if (didItCrit == false) 
			{
				System.out.println(one.getName() + " Dealt " + afterBattleDamage + " damage to " + two.getName());
				newHealth = two.getHealth() - afterBattleDamage;

				return newHealth;
			}
		}
		
		System.out.println(one.getName() + " missed their attack :(");
		return newHealth;
	}
	
}
