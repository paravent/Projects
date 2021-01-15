import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random; 


public class WelcomeToTheDungeon {

	public static void main(String[] args) {
		
		runMyGame(); 
	}

	
	static void runMyGame() {
		
		int boolCheck; 
		Player myPlayer = new Player(40, 0); 
		
		Monster Dragon = new Monster(10, "Dragon");
		Monster Goblin = new Monster(5, "Goblin");
		Monster Witch = new Monster(8, "Witch");
		Monster Skeleton = new Monster(2, "Skeleton");
		
		//Choose monster at random 

		ArrayList<Monster> monsters = new ArrayList<Monster>(); 
		addObject(monsters, 1, Dragon);
		addObject(monsters, 2, Witch);
		addObject(monsters, 3, Goblin);
		addObject(monsters, 4, Skeleton);
		
		ArrayList<Monster> dungeonMonsters = new ArrayList<Monster>(); 
		Random randint = new Random(); 
		Boolean stop = false; 
		Scanner inputs = new Scanner(System.in);
		while(!stop) {
			
			int randomNumber = randint.nextInt(monsters.size());
			dungeonMonsters.add(monsters.get(randomNumber));
			myPlayer.setScore(monsters.get(randomNumber).getStrength() + myPlayer.getScore());
			
			
			
			printMenuScreen(); 
			System.out.println("You're currently facing  " +  dungeonMonsters.size() + "  monsters, add 1 more");
			System.out.println("Enter '1' to Add a monster and '2' to continue as is.. if you dare");
			boolCheck = inputs.nextInt();
			
			if(boolCheck == 2) {
				stop = true; 

			}
 
		}

		while(myPlayer.getHealth() > 0 && dungeonMonsters.size() != 0) {
			
			System.out.println("Your opponent is... " + dungeonMonsters.get(0).getName());
			System.out.println("-------------------------------------------------------");
			int damageTaken = dungeonMonsters.get(0).getStrength(); 
			System.out.println("You take " + "---" + damageTaken + "---" + " Damage");
			System.out.println("-------------------------------------------------------");
			System.out.println("Leaving you with  - " + (myPlayer.getHealth() - damageTaken ) + " -- Health remaining");
			System.out.println("-------------------------------------------------------");
			myPlayer.setHealth(myPlayer.getHealth() - damageTaken);
			
			dungeonMonsters.remove(0);
			
		}
		
		if(myPlayer.getHealth() > 0) {
			System.out.println("-------------------------------------------------------");
			System.out.println("WINNER");
			System.out.println("Score --" + myPlayer.getScore());
		}
		else {
			System.out.println("Loser");
		}
		inputs.close();
		
	}
	
	static void printMenuScreen() {
		System.out.println(" _ __ ___   ___ _ __  _   _ \r\n" + 
				"| '_ ` _ \\ / _ \\ '_ \\| | | |\r\n" + 
				"| | | | | |  __/ | | | |_| |\r\n" + 
				"|_| |_| |_|\\___|_| |_|\\__,_|");
		
		System.out.println("Welcome to the dungeon...");
	}
	
	static void addObject(ArrayList<Monster> monsters, int x, Monster Monster) {
		
		for(int i=0; i<x; i++) {
			monsters.add(Monster); 
		}
	}

}







/*
// TODO Auto-generated method stub
ArrayList<String> monsterNames = new ArrayList<String>(Arrays.asList("Demon", "Goblin", "Skeleton" )); // Create an ArrayList object
int randomValue = ThreadLocalRandom.current().nextInt(1, 10);

ArrayList<Monster> monsters; 
monsters = new ArrayList<Monster>(); 


Player userPlayer = new Player(40, 0); //Create player instance

System.out.println("Its in here " + userPlayer.getHealth());




for(int i=0; i<ThreadLocalRandom.current().nextInt(1, 10); i++) {
	Monster.createMonsters(randomValue);
}



for(int i=0; i<monsters.size(); i++) {
	System.out.println("Monster is" + monsters.get(i));
}


printMenuScreen(); 

}

*/