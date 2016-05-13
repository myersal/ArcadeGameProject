import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * The class that uses dynamite .
 *
 * @author myersal.
 *         Created Feb 19, 2015.
 */

@SuppressWarnings("serial")
public class Dynamite extends AbstractOccupiedSpace {

	private int x;
	private int y;
	
	/**
	 * 
	 * Creates the dynamite object at the specified location.
	 *
	 * @param x
	 * 		the x coordinate of the dynamite
	 * @param y
	 * 		the y coordinate of the dynamite
	 */

	public Dynamite(int x, int y) {
		super(x, y);
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * draws the image on the given graphics object.
	 *
	 * @param g
	 * 		the graphics object to be drawn on
	 */

	public void drawOn(Graphics2D g) {
		BufferedImage img = null;
		try {
			img = ImageIO
					.read(new File(
							"C:/EclipseWorkspaces/csse220/ArcadeGameProject/src/dynamite.jpg"));
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
	 * Makes the dynamite explode when called.
	 *
	 * @param level
	 * 		the level the dynamite is exploding on
	 * @param jOfPlayer
	 * 		the y coordinate of the player
	 * @param iOfPlayer
	 * 		the x coordinate of the player
	 */

	public static void dynamiteExplode(int[][] level, int jOfPlayer,
			int iOfPlayer) {
		if (level.length > jOfPlayer + 1 && level[jOfPlayer + 1][iOfPlayer] != 2
				&& level[jOfPlayer + 1][iOfPlayer] != 10) {
			level[jOfPlayer + 1][iOfPlayer] = 0;
		}
		if (level.length > jOfPlayer + 1 && level[jOfPlayer].length > iOfPlayer + 1
				&& level[jOfPlayer + 1][iOfPlayer + 1] != 2
				&& level[jOfPlayer + 1][iOfPlayer + 1] != 10) {
			level[jOfPlayer + 1][iOfPlayer + 1] = 0;
		}
		if (level[jOfPlayer].length > iOfPlayer + 1
				&& level[jOfPlayer][iOfPlayer + 1] != 2
				&& level[jOfPlayer][iOfPlayer + 1] != 10) {
			level[jOfPlayer][iOfPlayer + 1] = 0;
		}
		if (0 < jOfPlayer && level[jOfPlayer].length > iOfPlayer + 1
				&& level[jOfPlayer - 1][iOfPlayer + 1] != 2
				&& level[jOfPlayer - 1][iOfPlayer + 1] != 10) {
			level[jOfPlayer - 1][iOfPlayer + 1] = 0;
		}
		if (0 < jOfPlayer && level[jOfPlayer - 1][iOfPlayer] != 2
				&& level[jOfPlayer - 1][iOfPlayer] != 10) {
			level[jOfPlayer - 1][iOfPlayer] = 0;
		}
		if (0 < jOfPlayer && 0 < iOfPlayer
				&& level[jOfPlayer - 1][iOfPlayer - 1] != 2
				&& level[jOfPlayer - 1][iOfPlayer - 1] != 10) {
			level[jOfPlayer - 1][iOfPlayer - 1] = 0;
		}
		if (0 < iOfPlayer && level[jOfPlayer][iOfPlayer - 1] != 2
				&& level[jOfPlayer][iOfPlayer - 1] != 10) {
			level[jOfPlayer][iOfPlayer - 1] = 0;
		}
		if (level.length > jOfPlayer + 1 && 0 < iOfPlayer
				&& level[jOfPlayer + 1][iOfPlayer - 1] != 2
				&& level[jOfPlayer + 1][iOfPlayer - 1] != 10) {
			level[jOfPlayer + 1][iOfPlayer - 1] = 0;
		}
	}

}