package week7_conway_game_of_life;

public class NeverAliveCell extends AbstractCell {
	
	public NeverAliveCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}
	
	public  AbstractCell cellForNextGeneration() {
		return this;
	}
	
	public boolean willBeAliveInNextGeneration() {
		return false;
	}

	public char displayCharacter() {
		return 'X';
	}
	
	public boolean getIsAlive() {
		return false;
	}
}