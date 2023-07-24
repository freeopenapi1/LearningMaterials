package kr.co.himedia.templatemethod02;

public class Player {

	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void setLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	
}



















