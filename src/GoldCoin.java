import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * Creates a pile of coins that can be picked up for points.
 *
 * @author myersal.
 *         Created Feb 19, 2015.
 */

@SuppressWarnings("serial")
public class GoldCoin extends AbstractOccupiedSpace {
	
	private LocalEnvironment world;
	
	/**
	 * 
	 * constructs the gold coin.
	 *
	 * @param x
	 * 		the x coordinate of the gold
	 * @param y
	 * 		the y coordinate of the gold
	 * @param world
	 * 		the world the gold should reside in
	 */

	public GoldCoin(int x, int y, LocalEnvironment world) {
		super(x, y);
		this.world = world;
	}
	
	/**
	 * 
	 * The draw method for the gold.
	 *
	 * @param g
	 * 		the graphics object on which the gold should be drawn.
	 */

	public void drawOn(Graphics2D g) {
		BufferedImage img = null;
		try {
			img = ImageIO
					.read(new File(
							"C:/EclipseWorkspaces/csse220/ArcadeGameProject/src/goldcoins.jpg"));
		} catch (IOException exception) {
			// TODO Auto-generated catch-block stub.
			exception.printStackTrace();
		}

		g.translate(super.xLoc, super.yLoc);

		g.drawImage(img, 0, 0, BLOCK_WIDTH, BLOCK_HEIGHT, 0, 0, img.getWidth(),
				img.getHeight(), null);

		g.translate(-super.xLoc, -super.yLoc);
		this.world.repaint();
	}

}
