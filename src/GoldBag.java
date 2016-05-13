import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * A gold bag class to be manipulated by main.
 *
 * @author myersal. Created Feb 12, 2015.
 */
@SuppressWarnings("serial")
public class GoldBag extends AbstractOccupiedSpace {

	private static final int BLOCK_WIDTH = 600 / 15;
	private static final int BLOCK_HEIGHT = 400 / 10;
	private boolean brokenGold;
	private LocalEnvironment world;
	private int dropHeight = 0;
	private int x;
	private int y;
	private static int numberOfGoldBagsCreated = -1;
	private int ident;

	/**
	 * 
	 * Constructs the gold.
	 *
	 * @param x
	 *            x coordinate of gold.
	 * @param y
	 *            y coordinate of gold.
	 */

	public GoldBag(int x, int y, LocalEnvironment world) {
		super(x, y);
		this.brokenGold = false;
		this.world = world;
		this.x = x;
		this.y = y;
		GoldBag.numberOfGoldBagsCreated++;
		this.ident = GoldBag.numberOfGoldBagsCreated;

	}

	/**
	 * 
	 * Draws the Gold on the given world.
	 *
	 * @param g
	 *            graphics object that the gold should be drawn on.
	 */

	protected void drawOn(Graphics2D g) {

		BufferedImage img = null;
		try {
			img = ImageIO
					.read(new File(
							"C:/EclipseWorkspaces/csse220/ArcadeGameProject/src/goldBag.jpg"));
		} catch (IOException exception) {
			// TODO Auto-generated catch-block stub.
			exception.printStackTrace();
		}

		g.translate(this.x * BLOCK_WIDTH, this.y * BLOCK_HEIGHT);

		g.drawImage(img, 0, 0, BLOCK_WIDTH, BLOCK_HEIGHT, 0, 0, img.getWidth(),
				img.getHeight(), null);

		g.translate(-this.x * BLOCK_WIDTH, -this.y * BLOCK_HEIGHT);
	}

	/**
	 * 
	 * Moves the gold object when there is an empty space under the gold and the
	 * bag is not broken.
	 *
	 */

	protected void move() {

		int[][] level = this.world.getLevel();

		try {
			if (!brokenGold && canMove()) {

				this.dropHeight++;
				this.world.getLevel()[this.y][this.x] = 0;
				this.y++;
				super.yLoc = this.y * super.BLOCK_HEIGHT;
				if (this.world.getLevel()[this.y][this.x] == 3) {
					this.world.player.die();
					level[8][5] = 3;
				}

				this.world.getLevel()[this.y][this.x] = 10;
				// System.out.println("moved");
				this.world.repaint();

			} else {

				if (this.dropHeight > 1) {
					this.brokenGold = true;
					level[this.y][this.x] = 11;
				
				}
				this.dropHeight = 0;
				// System.out.println("no move");
				this.world.repaint();
			}
		} catch (IndexOutOfBoundsException e) {
			// do nothing?
			System.out.println("OOB Exception");
		}

	}

	/**
	 * 
	 * Returns the drop height of the gold bag.
	 *
	 * @return
	 * 		the dropheight
	 */

	protected int getDropHeight() {
		return this.dropHeight;
	}
	
	/**
	 * 
	 * returns whether or not the bag can drop down.
	 *
	 * @return
	 * 		returns whether the bag can drop.
	 */

	protected boolean canMove() {
		int[][] level = this.world.getLevel();
		if (this.y + 1 < level.length && level[this.y + 1][this.x] != 1 && level[this.y + 1][this.x] != 2
				&& this.y < level.length) {
			return true;
		}

		return false;
	}
	
	/**
	 * 
	 * Returns whether the gold is broken or not.
	 *
	 * @return
	 * 		returns the brokenGold
	 */

	public boolean getIsBroken() {
		return brokenGold;
	}
	
	/**
	 * returns the x coordinate for the goldbag
	 */

	public int getX() {
		return this.x;
	}
	
	/**
	 * returns the y coordinate of the bag.
	 */
	
	public int getY()
	{
		return this.y;
	}
	
	/**
	 * 
	 * returns the identity of the bag.
	 *
	 * @return
	 * 		returns the identity of the bag.
	 */

	public int getIdent(){
		return this.ident;
	}
	
	/**
	 * 
	 * sets the x and y coordinate of the gold.
	 *
	 * @param y
	 * 		the new y coordinate of the gold.
	 * @param x
	 * 		the new x coordinate of the gold.
	 */
	
	public void setGoldBag(int y, int x) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * sets the x coordinate of the bag.
	 *
	 * @param x
	 * 		the new x coordinate of the bag.
	 */

	public void setX(int x) {
		this.x = x;
		
	}
	
	/**
	 * 
	 * sets the y coordinate of the bag.
	 *
	 * @param y
	 * 		the new y coordinate of the bag.
	 */
	
	public void setY(int y) {
		this.x = y;
		
	}	
}
