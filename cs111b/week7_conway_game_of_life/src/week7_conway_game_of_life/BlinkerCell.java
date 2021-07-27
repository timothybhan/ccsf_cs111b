package week7_conway_game_of_life;

public class BlinkerCell extends AbstractCell{
	
	public BlinkerCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}
	
	public BlinkerCell cellForNextGeneration() {
		
		BlinkerCell next = new BlinkerCell(getRow(), getColumn(), world);
		
		next.setIsAlive(willBeAliveInNextGeneration());
		
		return next;
	}
	
	public boolean willBeAliveInNextGeneration() {
		// if the Cell is currently alive, then next generation will be not alive. same for vice-versa
		if (getIsAlive()) {
			return false;
		}
		else {
			return true;
		}
	}
	
}