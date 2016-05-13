import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;



/**
 * 
 * A space that is occupied with dirt and has a set width and height.
 *
 * @author myersal. Created Feb 6, 2015.
 */

@SuppressWarnings("serial")
public class Dirt extends AbstractOccupiedSpace {
	private static final int BLOCK_WIDTH = 600 / 15;
	private static final int BLOCK_HEIGHT = 400 / 10;

	/**
	 * 
	 * Creates a dirt space.
	 *
	 * @param x
	 * @param y
	 */

	public Dirt(int x, int y) {
		super(x, y);
	}

	/**
	 * 
	 * Draws a dirt space that currently has 4 layers of different colors.
	 *
	 * @param g
	 */

	protected void drawOn(Graphics2D g) {
		Rectangle2D.Double layer1 = new Rectangle2D.Double(super.xLoc,
				super.yLoc, BLOCK_WIDTH, BLOCK_HEIGHT / 4);
		g.setColor(new Color(90, 50, 30));
		g.fill(layer1);

		Rectangle2D.Double layer2 = new Rectangle2D.Double(super.xLoc,
				super.yLoc + BLOCK_HEIGHT / 4, BLOCK_WIDTH, BLOCK_HEIGHT / 4);
		g.setColor(new Color(155, 100, 75));
		g.fill(layer2);

		Rectangle2D.Double layer3 = new Rectangle2D.Double(super.xLoc,
				super.yLoc + BLOCK_HEIGHT / 2, BLOCK_WIDTH, BLOCK_HEIGHT / 4);
		g.setColor(new Color(100, 50, 30));
		g.fill(layer3);

		Rectangle2D.Double layer4 = new Rectangle2D.Double(super.xLoc,
				super.yLoc + (3 * BLOCK_HEIGHT) / 4, BLOCK_WIDTH,
				BLOCK_HEIGHT / 4);
		g.setColor(new Color(150, 100, 80));
		g.fill(layer4);
//		BufferedImage img = null;
//		try {
//			img = ImageIO
//					.read(new File(
//							"C:/EclipseWorkspaces/csse220/ArcadeGameProject/src/dirt1.jpg"));
//		} catch (IOException exception) {
//
//			exception.printStackTrace();
//		}
//
//		g.translate(super.xLoc, super.yLoc);
//
//		g.drawImage(img, 0, 0, BLOCK_WIDTH, BLOCK_HEIGHT, 0, 0, img.getWidth(),
//				img.getHeight(), null);
//
//		g.translate(-super.xLoc, -super.yLoc);
	}
}
