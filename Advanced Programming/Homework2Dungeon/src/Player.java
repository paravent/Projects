
public class Player {

	private int health; 
	private int score; 
	
	public Player(int health, int score) {
		
		this.health = health; 
		this.score = score; 
		
	}
	
	public int getHealth() {
		return health; 
	}
	public void setHealth(int newHealthValue) {
		this.health = newHealthValue; 
	}
	
	public int getScore() {
		return score; 
	}
	public void setScore(int newScoreValue) {
		this.score = newScoreValue; 
	}
	
	
}
