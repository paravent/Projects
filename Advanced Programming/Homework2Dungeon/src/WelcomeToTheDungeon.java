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
			if(dungeonMonsters.get(0).getName() == "Dragon") {
				dragonASCII(); 
			}
			if(dungeonMonsters.get(0).getName() == "Goblin") {
				goblinASCII(); 
			}
			if(dungeonMonsters.get(0).getName() == "Witch") {
				witchASCII(); 
			}
			if(dungeonMonsters.get(0).getName() == "Skeleton") {
				skeletonASCII(); 
			}
			System.out.println("-------------------------------------------------------");
			try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);} //Wait 1 seconds
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
			System.out.println("-------------------------------------------------------");
			System.out.println("Loser");
		}
		inputs.close();
		
	}
	
	static void printMenuScreen() {
		
		System.out.println("Welcome to the dungeon...");
	}
	
	static void addObject(ArrayList<Monster> monsters, int x, Monster Monster) {
		
		for(int i=0; i<x; i++) {
			monsters.add(Monster); 
		}
	}
	
	static void dragonASCII() {
		
		System.out.println("                  ^\\    ^                  \r\n" + 
				"                      / \\\\  / \\                 \r\n" + 
				"                     /.  \\\\/   \\      |\\___/|   \r\n" + 
				"  *----*           / / |  \\\\    \\  __/  O  O\\   \r\n" + 
				"  |   /          /  /  |   \\\\    \\_\\/  \\     \\     \r\n" + 
				" / /\\/         /   /   |    \\\\   _\\/    '@___@      \r\n" + 
				"/  /         /    /    |     \\\\ _\\/       |U\r\n" + 
				"|  |       /     /     |      \\\\\\/        |\r\n" + 
				"\\  |     /_     /      |       \\\\  )   \\ _|_\r\n" + 
				"\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\r\n" + 
				"~    ~.           .-~-.|.-*      _        {-,\r\n" + 
				" \\      ~-. _ .-~                 \\      /\\'\r\n" + 
				"  \\                   }            {   .*\r\n" + 
				"   ~.                 '-/        /.-~----.\r\n" + 
				"     ~- _             /        >..----.\\\\\\\r\n" + 
				"         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");
	}
	
	static void goblinASCII() {
		
		System.out.println(" ,      ,\r\n" + 
				"            /(.-\"\"-.)\\\r\n" + 
				"        |\\  \\/      \\/  /|\r\n" + 
				"        | \\ / =.  .= \\ / |\r\n" + 
				"        \\( \\   o\\/o   / )/\r\n" + 
				"         \\_, '-/  \\-' ,_/\r\n" + 
				"           /   \\__/   \\\r\n" + 
				"           \\ \\__/\\__/ /\r\n" + 
				"         ___\\ \\|--|/ /___\r\n" + 
				"       /`    \\      /    `\\\r\n" + 
				"     /       '----'       \\");
	}
	
	static void witchASCII() {
		
		System.out.println("    __#^\r\n" + 
				"                       _####\"\r\n" + 
				"                ]######_*##\"\r\n" + 
				"                /#######_#            _____\r\n" + 
				"               **#\" \"\"####_         _########_ ___\r\n" + 
				"               \"\"##___########*#___################__,\r\n" + 
				"  ..._            #\"\" \"###############\"    \"########\"\r\n" + 
				"  ^**#__-=.._     *_    \"##\r\n" + 
				"      \"\"\"*####\"#**^\"____  \"#_\r\n" + 
				"             \"##***#\"\"\"~   I#\r\n" + 
				"               #__#*_____._##_-<.__     ___\r\n" + 
				"                *###########\"\"^**#C__-=#\"\"~#__  __##       -\r\n" + 
				"                  \"\"\"#,_\"##c       \"\"\"*########\"\"\"*##c         _\r\n" + 
				"                       #_###           \"^^\"^####*_ {##   *\r\n" + 
				"                      *#^                     \"#_####            \"\r\n" + 
				"                      \"                        ###*#  _ =    -\r\n" + 
				"                                                      ~      .   `");
	}
	
	static void skeletonASCII() {
		
		System.out.println("      _.--\"\"-._\r\n" + 
				"  .                         .\"         \".\r\n" + 
				" / \\    ,^.         /(     Y             |      )\\\r\n" + 
				"/   `---. |--'\\    (  \\__..'--   -   -- -'\"\"-.-'  )\r\n" + 
				"|        :|    `>   '.     l_..-------.._l      .'\r\n" + 
				"|      __l;__ .'      \"-.__.||_.-'v'-._||`\"----\"\r\n" + 
				" \\  .-' | |  `              l._       _.'\r\n" + 
				"  \\/    | |                   l`^^'^^'j\r\n" + 
				"        | |                _   \\_____/     _\r\n" + 
				"        j |               l `--__)-'(__.--' |\r\n" + 
				"        | |               | /`---``-----'\"1 |  ,-----.\r\n" + 
				"        | |               )/  `--' '---'   \\'-'  ___  `-.\r\n" + 
				"        | |              //  `-'  '`----'  /  ,-'   I`.  \\\r\n" + 
				"      _ L |_            //  `-.-.'`-----' /  /  |   |  `. \\\r\n" + 
				"     '._' / \\         _/(   `/   )- ---' ;  /__.J   L.__.\\ :\r\n" + 
				"      `._;/7(-.......'  /        ) (     |  |            | |\r\n" + 
				"      `._;l _'--------_/        )-'/     :  |___.    _._./ ;\r\n" + 
				"        | |                 .__ )-'\\  __  \\  \\  I   1   / /\r\n" + 
				"        `-'                /   `-\\-(-'   \\ \\  `.|   | ,' /\r\n" + 
				"                           \\__  `-'    __/  `-. `---'',-'\r\n" + 
				"                              )-._.-- (        `-----'\r\n" + 
				"                             )(  l\\ o ('..-.\r\n" + 
				"                       _..--' _'-' '--'.-. |\r\n" + 
				"                __,,-'' _,,-''            \\ \\\r\n" + 
				"               f'. _,,-'                   \\ \\\r\n" + 
				"              ()--  |                       \\ \\\r\n" + 
				"                \\.  |                       /  \\\r\n" + 
				"                  \\ \\                      |._  |\r\n" + 
				"                   \\ \\                     |  ()|\r\n" + 
				"                    \\ \\                     \\  /\r\n" + 
				"                     ) `-.                   | |\r\n" + 
				"                    // .__)                  | |\r\n" + 
				"                 _.//7'                      | |\r\n" + 
				"               '---'                         j_| `\r\n" + 
				"                                            (| |\r\n" + 
				"                                             |  \\\r\n" + 
				"                                             |lllj\r\n" + 
				"                                             ||||");
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