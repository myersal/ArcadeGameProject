public abstract class AbstractEnemy extends AbstractMover {

	protected LocalEnvironment world;
	
	/**
	 * Constructs an abstract enemy. 
	 *
	 * @param w
	 * 		the world for which the enemy is in
	 * @param x
	 * 		the x coordinate of the enemy
	 * @param y
	 * 		the y coordinate of the enemy
	 */

	public AbstractEnemy(LocalEnvironment w, int x, int y) {
		super(x, y);
		this.world = w;
	}

	public abstract void move();

	/**
	 * 
	 * Kills this enemy.
	 *
	 */
	public void die() {
		this.world.getLevel()[super.yLoc][super.xLoc] = 0;
		this.world.repaint();
	}

	public abstract int getType();
}
