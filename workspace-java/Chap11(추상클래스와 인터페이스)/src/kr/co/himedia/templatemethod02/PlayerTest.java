package kr.co.himedia.templatemethod02;

public class PlayerTest {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		PlayerLevel pLevel = new IntermediateLevel();
		player.setLevel(pLevel);
		player.play(2);
		
		PlayerLevel ppLevel = new AdvancedLevel();
		player.setLevel(ppLevel);
		player.play(3);
		
	}
}
