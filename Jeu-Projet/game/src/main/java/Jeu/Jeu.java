package Jeu;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import champions.Archer;
import champions.Champion;

import champions.Knight;
import champions.Wizard;



public class Jeu {
	
	private List<Champion> champions= new ArrayList<Champion>();
	
	
	//function to play a game
	public void launch() {
		String carriageReturn = System.getProperty("line.separator");
		
		System.out.println("Welcome young Developer!"+ carriageReturn + "This game will be a true bloodshed for your champions" + carriageReturn+
				"And for your developer eyes!" + carriageReturn + "..."+carriageReturn);
		createChamps();
		
	}
	
	
	//First step : function for Create Champions and speak with user!
	
	private void createChamps() {
		String carriageReturn = System.getProperty("line.separator");
		Scanner sc = new Scanner(System.in);
		
		
		
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
		
		sc.close();
		System.out.println("Well done Son!"+carriageReturn+"You summon "+Champion.getCount()+ " Champion(s)");
		System.out.println(champions);
		
	}
	
	
	public void selectChamp()
	{		
		String carriageReturn = System.getProperty("line.separator");
		char test = 'Y';
		Champion tempChamp;
		Scanner scChamp = new Scanner(System.in);
		
		while(test=='Y')
		{
			System.out.println("You are a good person Bob!" +carriageReturn+
					"What kind of champion do you would summon adventurer?"+ carriageReturn+
					"1 - Knight"+ carriageReturn+
					"2 - Archer"+carriageReturn+
					"3 - Wizard"+carriageReturn+
					"Choose your number ");
			int valueChamp = scChamp.nextInt();
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
				System.out.println("Be focus Timoty!"+carriageReturn+
						"Please choose a number for summon the corresponding champion!"+carriageReturn+
						"like 1 for summon this beautifull Knight ;* ");
				continue;
			}
			
			champions.add(tempChamp);
			
			System.out.println("Hey Psssssst you !     0_0"+carriageReturn+" Do you want summon one other Champ? (Y/N) ");
			test = scChamp.next().charAt(0);		
		}
		scChamp.close();
	}
	
	
	// Second Step : FIGHHHHTTT
	
	/* 
	 * Fonction fight
	 * while nb pers> 1
	 * 
	 * Foreach personnage 
	 * Alors on demande ce qu'on veut faire 
	 * On fight 
	 * et si personnage die alors on depush de la list 
	 * 
	 */
	

	
	
	
	
	

	public static void main(String[] args) {
		Jeu game =new Jeu();
		game.launch();

	}

}
