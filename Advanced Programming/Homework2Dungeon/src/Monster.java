
public class Monster {
	
	private int strength; 
	private String name; 
	
	public Monster(int strength, String name) {
		
		this.strength = strength; 
		this.name = name; 
		
	}
	
	public int getStrength() {
		return this.strength; 
	}
	
	
	public String getName() {
		return this.name; 
	}
	

	
}

	
	/*
	static ArrayList<String> monsterNames = new ArrayList<String>(Arrays.asList("Witch", "Goblin", "Skeleton", "Dragon" )); // Create an ArrayList object
	static ArrayList<String> monstersCreated = new ArrayList<String>();
	
	static int min = 1;
	static int max = 10;

	
	
	
	public Monster(ArrayList<String> monsterNames, int Health ) {
		
		this.monsterNames = monsterNames; 
//		this.Strength = Health; 
		
	}
	
	
	
	
	public static void createMonsters(int x) {
		int randomMonster = ThreadLocalRandom.current().nextInt(0, monsterNames.size()); //Random Health value for monster

		String monsterName = monsterNames.get(randomMonster);
		int monsterStrength = ThreadLocalRandom.current().nextInt(1, 10); 
		
		String monsterStatistics = (monsterName + monsterStrength); 
		System.out.println("- Monster name - " + monsterName  + " -  Monster Health - " + monsterStrength);
		monstersCreated.add(monsterStatistics); 
		
		
	}
		
*/

