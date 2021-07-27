package week7_conway_game_of_life;

public class TimCell extends AbstractCell {
	
	public TimCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}
	
	// only alive if no other neighbors are alive
	public boolean willBeAliveInNextGeneration() {
		int nc = neighborCount();
		
		return nc == 0;
	}
	
	public AbstractCell cellForNextGeneration() {
		TimCell next = new TimCell(getRow(), getColumn(), world);
		
		next.setIsAlive(willBeAliveInNextGeneration());
		
		return next;
	}
	
	public int neighborCount() {
		int count = 0;
		
		int row = getRow();
		int column = getColumn();
		
		for (int dr = -1; dr <= 1; dr++) {
			for (int dc = -1; dc <= 1; dc++) {
				if (world.isAlive(row + dr, column + dc) && !(dr == 0 && dc == 0)) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public char displayCharacter() {
		return getIsAlive() ? 'T' : '.';
	} 

}
