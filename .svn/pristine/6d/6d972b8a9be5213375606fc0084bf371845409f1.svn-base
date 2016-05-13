/**
 * 
 * A class that allows and object given to it to move.
 *
 * @author myersal. Created Feb 6, 2015.
 */

public abstract class AbstractMover {

	protected int xLoc;
	protected int yLoc;
	protected boolean paused;

	/**
	 * 
	 * Creates the abstract mover and sets the mover to not paused.
	 *
	 * @param x
	 * @param y
	 */
	public AbstractMover(int x, int y) {
		this.xLoc = x;
		this.yLoc = y;
		this.paused = false;

	}

	/**
	 * 
	 * returns whether the mover is paused or not.
	 *
	 * @return
	 */

	public boolean isPaused() {
		return this.paused;
	}

	/**
	 * 
	 * Changes a paused mover to unpaused and vice versa.
	 *
	 */

	public void updatePause() {
		if (this.paused) {
			this.paused = false;
		} else {
			this.paused = true;
		}

	}

}
