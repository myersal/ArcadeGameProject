import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * A class that creates the playable character and lets the player manipulate
 * it.
 *
 * @author myersal. Created Feb 6, 2015.
 */ 

public class Player extends AbstractMover {
	private static final int BLOCK_WIDTH = 600 / 15;
	private static final int BLOCK_HEIGHT = 400 / 10;

	/**
	 * 
	 * Creates a player.
	 *
	 * @param x
	 *            x coordinate of the player.
	 * @param y
	 *            y coordinate of the player.
	 */

	public Player(int x, int y) {
		super(x, y);

	}

	/**
	 * 
	 * Draws the playable character on the environment.
	 *
	 * @param g
	 *            graphics object for the player to be drawn on.
	 */

	protected void drawOn(Graphics2D g) {

		BufferedImage img = null;
		try {
			img = ImageIO
					.read(new File(
							"C:/EclipseWorkspaces/csse220/ArcadeGameProject/src/miner2.png"));
		} catch (IOException exception) {
			// TODO Auto-generated catch-block stub.
			exception.printStackTrace();
		}

		g.translate(super.xLoc * BLOCK_WIDTH, super.yLoc * BLOCK_HEIGHT);

		g.drawImage(img, 0, 0, BLOCK_WIDTH, BLOCK_HEIGHT, 0, 0, img.getWidth(),
				img.getHeight(), null);

		g.translate(-super.xLoc * BLOCK_WIDTH, -super.yLoc * BLOCK_HEIGHT);

	}

	/**
	 * 
	 * Returns the Y location of the character.
	 *
	 * @return returns the y location of the character.
	 */

	public int getYLoc() {
		return this.yLoc;
	}

	/**
	 * 
	 * Returns the X location of the character.
	 *
	 * @return returns the x location of the character.
	 */

	public int getXLoc() {
		return this.xLoc;
	}

	/**
	 * 
	 * Kills the player when called and the player loses a life.
	 *
	 */

	public void die() {

		Main.loseLife();
		System.out.println("You lost a life.  Lives remaining: "
				+ Main.getLives());
		if (Main.getLives() < 0)
			Main.close();

	}
}
