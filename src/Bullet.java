import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Bullet extends AbstractMover {
	protected String direction = "right";
	private static final int BLOCK_WIDTH = 600 / 15;
	private static final int BLOCK_HEIGHT = 400 / 10;
	LocalEnvironment world;
	
	/**
	 * 
	 * Creates the bullet.
	 *
	 * @param x
	 * 		the x coordinate of the bullet
	 * @param y
	 * 		the y coordinate of the bullet
	 * @param world
	 * 		the world in which the bullet resides
	 */

	public Bullet(int x, int y, LocalEnvironment world) {
		super(x, y);
		this.world = world;
	}
	
	/**
	 * 
	 * The method to draw the bulet.
	 *
	 * @param g
	 * 		the graphics object on which to draw on
	 */

	protected void drawOn(Graphics2D g) {
		Rectangle2D.Double space = new Rectangle2D.Double(super.xLoc
				* BLOCK_WIDTH, super.yLoc * BLOCK_HEIGHT, BLOCK_WIDTH,
				BLOCK_HEIGHT);
		g.setColor(Color.white);
		g.fill(space);

		Rectangle2D.Double projectile = new Rectangle2D.Double(super.xLoc
				* BLOCK_WIDTH + BLOCK_WIDTH / 4, super.yLoc * BLOCK_HEIGHT
				+ BLOCK_HEIGHT / 4, BLOCK_WIDTH / 4, BLOCK_HEIGHT / 4);
		g.setColor(Color.RED);
		g.fill(projectile);
	}
	
	/**
	 * 
	 * The method to move the bullet.
	 *
	 */

	public void move() {

		int[][] level = this.world.getLevel();
		try {
			level[super.yLoc][super.xLoc] = 0;

			if (this.direction.equals("up")) {
				super.yLoc--;
				if (level[super.yLoc][super.xLoc] == 4
						|| level[super.yLoc][super.xLoc] == 5) {
					level[super.yLoc][super.xLoc] = 0;
					// level[super.yLoc+1][super.xLoc]=0;
					this.world.clearBullet();
				} else if (level[super.yLoc][super.xLoc] == 1
						|| level[super.yLoc][super.xLoc] == 2
						|| level[super.yLoc][super.xLoc] == 10
						|| level[super.yLoc][super.xLoc] == 11) {
					this.world.clearBullet();
				} else {
					level[super.yLoc][super.xLoc] = 6;
				}
			} else if (this.direction.equals("down")) {
				super.yLoc++;
				if (level[super.yLoc][super.xLoc] == 4
						|| level[super.yLoc][super.xLoc] == 5) {
					level[super.yLoc][super.xLoc] = 0;
					// level[super.yLoc-1][super.xLoc]=0;
					this.world.clearBullet();
				} else if (level[super.yLoc][super.xLoc] == 1
						|| level[super.yLoc][super.xLoc] == 2
						|| level[super.yLoc][super.xLoc] == 10
						|| level[super.yLoc][super.xLoc] == 11) {
					this.world.clearBullet();
				} else {
					level[super.yLoc][super.xLoc] = 7;
				}
			} else if (this.direction.equals("left")) {
				super.xLoc--;
				if (level[super.yLoc][super.xLoc] == 4
						|| level[super.yLoc][super.xLoc] == 5) {
					level[super.yLoc][super.xLoc] = 0;
					// level[super.yLoc+1][super.xLoc+1]=0;
					this.world.clearBullet();
				} else if (level[super.yLoc][super.xLoc] == 1
						|| level[super.yLoc][super.xLoc] == 2
						|| level[super.yLoc][super.xLoc] == 10
						|| level[super.yLoc][super.xLoc] == 11) {
					this.world.clearBullet();
				} else {
					level[super.yLoc][super.xLoc] = 8;
				}
			} else if (this.direction.equals("right")) {
				super.xLoc++;
				if (level[super.yLoc][super.xLoc] == 4
						|| level[super.yLoc][super.xLoc] == 5) {
					level[super.yLoc][super.xLoc] = 0;
					level[super.yLoc][super.xLoc - 1] = 0;
					this.world.clearBullet();
				} else if (level[super.yLoc][super.xLoc] == 1
						|| level[super.yLoc][super.xLoc] == 2
						|| level[super.yLoc][super.xLoc] == 10
						|| level[super.yLoc][super.xLoc] == 11) {
					this.world.clearBullet();
				} else {
					level[super.yLoc][super.xLoc] = 9;
				}
			}
			this.world.repaint();

		} catch (IndexOutOfBoundsException e) {
			// Do nothing
		}
	}
	
	/**
	 * 
	 * Sets the direction the bullet should move.
	 *
	 * @param direction
	 * 		direction for which the bullet should move.
	 */

	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	/**
	 * 
	 * Returns the direction the bullet should move.
	 *
	 * @return
	 * 		returns the direction the bullet should move.
	 */

	public String getDirection() {
		return this.direction;
	}

}
