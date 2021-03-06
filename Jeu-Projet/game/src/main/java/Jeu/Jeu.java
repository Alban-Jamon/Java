package Jeu;


import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import champions.Archer;
import champions.Champion;

import champions.Knight;
import champions.Wizard;



public class Jeu {
	
	static Scanner sc = new Scanner(System.in);
	private List<Champion> champions= new ArrayList<Champion>();
	
	
	//function to play a game
	public void launch() {
		String carriageReturn = System.getProperty("line.separator");
		
		System.out.println("Welcome young Developer!"+ carriageReturn + "This game will be a true bloodshed for your champions" + carriageReturn+
				"And for your developer eyes!" + carriageReturn + "..."+carriageReturn);
		createChamps();
		battle();
		
	}
	
	
	//First step : function for Create Champions and speak with user!
	
	private void createChamps() {
		String carriageReturn = System.getProperty("line.separator");
		
		
		System.out.println("So young fool ...  Do you want Summon some Champion for a Brawl ? (Y/N) ");
		char test = sc.next().charAt(0);
		
		if(test=='N')
		{
			System.out.println("Once upon a time a brave developer who launched this game ... " +carriageReturn+ 
					"But his mom / partner called him for dinner ... "+carriageReturn+
					"so finally mom / partner always wins battles !  "+ carriageReturn +
					" This story is YOUR Story!"+carriageReturn+""
					+ " Shame on you ! After all this hours that i spent on this project !");
			System.exit(0);
		}
		if (test=='Y')
		{
			selectChamp();			
		}
		else {
			System.out.println("Did you come back to the Tavern , son ?"+carriageReturn+
					"Maybe you should stop to drink and choose one of this two choices ! ");
		}
	
		System.out.println("Well done Son!"+carriageReturn+"You summon "+Champion.getCount()+ " Champion(s)");
		System.out.println(champions);
		
	}
	
	
	public void selectChamp()
	{		
		String carriageReturn = System.getProperty("line.separator");
		char test = 'Y';
		Champion tempChamp;

		
		while(test=='Y')
		{
			System.out.println("You are a good person Bob!" +carriageReturn+
					"What kind of champion do you would summon adventurer?"+ carriageReturn+
					"1 - Knight"+ carriageReturn+
					"2 - Archer"+carriageReturn+
					"3 - Wizard"+carriageReturn+
					"Choose your number ");
			int valueChamp = sc.nextInt();
			switch(valueChamp) {
			case 1:
				tempChamp= new Knight();
				break;
			
			case 2:
				tempChamp= new Archer();
				break;
				
			case 3:
				tempChamp= new Wizard();
				break;
				
			default:
				System.out.println("Be focus Bob!"+carriageReturn+
						"Please choose a number for summon the corresponding champion!"+carriageReturn+
						"like 1 for summon this beautifull Knight ;* ");
				continue;
			}
			
			champions.add(tempChamp);
			
			System.out.println("Hey Psssssst you !     0_0"+carriageReturn+" Do you want summon one other Champ? (Y/N) ");
			test = sc.next().charAt(0);		
		}
	}
	
	
	// Second Step : FIGHHHHTTT
	
	/* 
	 * on retourne le perso 
	 * on attaque le perso  ------------ON EST ICI  ---------------------
	 */
	public void battle()
	{
	
		String carriageReturn = System.getProperty("line.separator");
		
		while(champions.size()>1)
		{
			for(Champion currentChamp : champions)
			{
				currentChamp.setProtect(false);
				System.out.println("The "+currentChamp.getClass().getSimpleName()+ " with id: " +
						currentChamp.getId() + " has "+ currentChamp.getHp()+ " HP and do "+
						currentChamp.getDamage()+ "Dommage points");
				System.out.println("What do you want to do BOB with this "+ currentChamp.getClass().getSimpleName()+" ?   0_0 "+carriageReturn+
						"1 - Attack" + carriageReturn+
						"2 - Protect your backside");
				if(currentChamp.getClass().getSimpleName().equals("Wizard"))
				{
					System.out.println("3 - Heal");
				}
				
				int skill= sc.nextInt();
				System.out.println(skill);
				switch (skill) {
				case 1:
					Champion target = chooseEnemy(currentChamp);
					currentChamp.attack(target);
					if(target.getHp()<=0)
					{
						champions.remove(target);
					}
					
					break;
					
				case 2:
					currentChamp.setProtect(true);
					System.out.println("the "+currentChamp.getClass().getSimpleName()+ " protect carefully his precious! ");
					break;
					
				case 3:
					if(currentChamp.getClass().getSimpleName().equals("Wizard"))
					{
						currentChamp.heal();
						break;
					}

					
				default:
					System.out.println("Did you found some liquor on the road, son ? "+carriageReturn+
							"Please be nice in front of your computer !"+carriageReturn+
							"Your computer and me , will be so proud if you could choose one number in this set of numbers"+carriageReturn+
							"Good Boy / girl / (put your gender here) !");
					break;
				}
			}
		}
		System.out.println(champions.get(0).getClass().getSimpleName()+ " with id "+ champions.get(0).getId()+ " win the batttle");
		System.out.println("Happy End");
	}
	
	//display Enemies and return 1 to attack
	
	public void displayEnemies(Champion attacking)
	{
		for(Champion current: this.champions)
		{
			if(!current.equals(attacking))
			{
			System.out.println(current.getId() +" - "+current.getClass().getSimpleName()+
					 " has "+ current.getHp()+ " HP and do "+
					current.getDamage()+ "Dommage points");
			}
			
		}
		
	}

	public Champion chooseEnemy(Champion attacking )
	{
		
		while(true)
		{
			System.out.println("Please choose one to smash his as... asymmetrical face ! Not sure about this one... 0_0 ");
			displayEnemies(attacking);
			
			int enemy=sc.nextInt();	
			for (Champion current : champions) {
				if(current.getId()==enemy & !current.equals(attacking))
				{
					return current;
				}
			}
			System.out.println("Listen sponge Bob ! If you don't wanna have square pant CHOOSE SOMEONE with his number!");
			System.out.println("Or I'll put your own Weapon into your ...you know ... asymmetrical face! ");
		}			
	}
	
	
	
	
	

	public static void main(String[] args) {
		Jeu game =new Jeu();
		game.launch();
		sc.close();
	}

}
