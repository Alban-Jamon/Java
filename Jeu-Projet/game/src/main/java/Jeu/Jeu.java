package Jeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import champions.Champion;


public class Jeu {
	
	private List<Champion> champions= new ArrayList<Champion>();
	
	public void launch() {
		String carriageReturn = System.getProperty("line.separator");
		
		System.out.println("Welcome young Developer!"+ carriageReturn + "This game will be a true bloodshed for your champions" + carriageReturn+
				"And for your developer eyes!" + carriageReturn + "..."+carriageReturn);
		createChamps();
		
	}

	private void createChamps() {
		String carriageReturn = System.getProperty("line.separator");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("So young fool ...  Do you want Summon some Champion for a Brawl ? (Y/N) ");
		char test = sc.next().charAt(0);
		
		if (test=='O')
		{
			//do something
		}
		if(test=='N')
		{
			System.out.println("Once upon a time a brave developer who launched this game ... " +carriageReturn+ "But his mom / partner called him for dinner ... "+
					carriageReturn+ "so finally mom / partner always wins this battle !  "+ carriageReturn + " This story is YOUR Story! Shame on you ! After all this hours that i spent on this project !"
		);
		}
		
	}

	public static void main(String[] args) {
		Jeu game =new Jeu();
		game.launch();

	}

}