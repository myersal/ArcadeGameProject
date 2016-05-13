import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * An item in the game that will give the player points and has a set width and
 * height.
 *
 * @author myersal. Created Feb 6, 2015.
 */
@SuppressWarnings("serial")
public class Emerald extends AbstractOccupiedSpace {
	private static final int BLOCK_WIDTH = 600 / 15;
	private static final int BLOCK_HEIGHT = 400 / 10;

	/**
	 * 
	 * Creates the emerald.
	 *
	 * @param x
	 * @param y
	 */

	public Emerald(int x, int y) {
		super(x, y);
	}

	/**
	 * 
	 * Draws the emerald first by putting the dirt as the background and then
	 * through 5 polygons and 1 rectangle. The 5 polygons are all triangles.
	 *
	 * @param g
	 */

	protected void drawOn(Graphics2D g) {
//		Rectangle2D.Double layer1 = new Rectangle2D.Double(super.xLoc,
//				super.yLoc, BLOCK_WIDTH, BLOCK_HEIGHT / 4);
//		g.setColor(new Color(90, 50, 30));
//		g.fill(layer1);
//
//		Rectangle2D.Double layer2 = new Rectangle2D.Double(super.xLoc,
//				super.yLoc + BLOCK_HEIGHT / 4, BLOCK_WIDTH, BLOCK_HEIGHT / 4);
//		g.setColor(new Color(155, 100, 75));
//		g.fill(layer2);
//
//		Rectangle2D.Double layer3 = new Rectangle2D.Double(super.xLoc,
//				super.yLoc + BLOCK_HEIGHT / 2, BLOCK_WIDTH, BLOCK_HEIGHT / 4);
//		g.setColor(new Color(100, 50, 30));
//		g.fill(layer3);
//
//		Rectangle2D.Double layer4 = new Rectangle2D.Double(super.xLoc,
//				super.yLoc + (3 * BLOCK_HEIGHT) / 4, BLOCK_WIDTH,
//				BLOCK_HEIGHT / 4);
//		g.setColor(new Color(150, 100, 80));
//		g.fill(layer4);
//
//		// starts to draw the emerald from now on
//		// the polygons were researched how to draw.
//
//		int x1Points[] = { super.xLoc + BLOCK_WIDTH / 3,
//				super.xLoc + BLOCK_WIDTH / 3, super.xLoc };
//		int y1Points[] = { super.yLoc + BLOCK_HEIGHT / 4,
//				super.yLoc + BLOCK_WIDTH / 2, super.yLoc + BLOCK_WIDTH / 2 };
//		GeneralPath polygon1 = new GeneralPath(GeneralPath.WIND_EVEN_ODD,
//				x1Points.length);
//		polygon1.moveTo(x1Points[0], y1Points[0]);
//
//		for (int index = 1; index < x1Points.length; index++) {
//			polygon1.lineTo(x1Points[index], y1Points[index]);
//		}
//		;
//		g.setColor(new Color(200, 255, 200));
//		polygon1.closePath();
//		g.fill(polygon1);
//
//		int x2Points[] = { super.xLoc + BLOCK_WIDTH / 2,
//				super.xLoc + BLOCK_WIDTH / 3, super.xLoc };
//		int y2Points[] = { super.yLoc + BLOCK_HEIGHT,
//				super.yLoc + BLOCK_WIDTH / 2, super.yLoc + BLOCK_WIDTH / 2 };
//		GeneralPath polygon2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD,
//				x2Points.length);
//		polygon2.moveTo(x2Points[0], y2Points[0]);
//
//		for (int index = 1; index < x2Points.length; index++) {
//			polygon2.lineTo(x2Points[index], y2Points[index]);
//		}
//		;
//		g.setColor(new Color(100, 205, 100));
//		polygon2.closePath();
//		g.fill(polygon2);
//
//		int x3Points[] = { super.xLoc + BLOCK_WIDTH / 2,
//				super.xLoc + BLOCK_WIDTH, super.xLoc + (2 * BLOCK_WIDTH) / 3 };
//		int y3Points[] = { super.yLoc + BLOCK_HEIGHT,
//				super.yLoc + BLOCK_WIDTH / 2, super.yLoc + BLOCK_WIDTH / 2 };
//		GeneralPath polygon3 = new GeneralPath(GeneralPath.WIND_EVEN_ODD,
//				x3Points.length);
//		polygon3.moveTo(x3Points[0], y3Points[0]);
//
//		for (int index = 1; index < x3Points.length; index++) {
//			polygon3.lineTo(x3Points[index], y3Points[index]);
//		}
//		;
//		g.setColor(new Color(0, 100, 0));
//		polygon3.closePath();
//		g.fill(polygon3);
//
//		int x4Points[] = { super.xLoc + BLOCK_WIDTH / 2,
//				super.xLoc + BLOCK_WIDTH / 3,
//				super.xLoc + (2 * BLOCK_WIDTH) / 3 };
//		int y4Points[] = { super.yLoc + BLOCK_HEIGHT,
//				super.yLoc + BLOCK_WIDTH / 2, super.yLoc + BLOCK_WIDTH / 2 };
//		GeneralPath polygon4 = new GeneralPath(GeneralPath.WIND_EVEN_ODD,
//				x4Points.length);
//		polygon4.moveTo(x4Points[0], y4Points[0]);
//
//		for (int index = 1; index < x4Points.length; index++) {
//			polygon4.lineTo(x4Points[index], y4Points[index]);
//		}
//		;
//		g.setColor(new Color(50, 205, 50));
//		polygon4.closePath();
//		g.fill(polygon4);
//
//		int x5Points[] = { super.xLoc + (2 * BLOCK_WIDTH) / 3,
//				super.xLoc + BLOCK_WIDTH, super.xLoc + (2 * BLOCK_WIDTH) / 3 };
//		int y5Points[] = { super.yLoc + BLOCK_HEIGHT / 4,
//				super.yLoc + BLOCK_WIDTH / 2, super.yLoc + BLOCK_WIDTH / 2 };
//		GeneralPath polygon5 = new GeneralPath(GeneralPath.WIND_EVEN_ODD,
//				x5Points.length);
//		polygon5.moveTo(x5Points[0], y5Points[0]);
//
//		for (int index = 1; index < x5Points.length; index++) {
//			polygon5.lineTo(x5Points[index], y5Points[index]);
//		}
//		;
//		g.setColor(new Color(50, 200, 50));
//		polygon5.closePath();
//		g.fill(polygon5);
//
//		Rectangle2D.Double topEmerald = new Rectangle2D.Double(super.xLoc
//				+ BLOCK_WIDTH / 3, super.yLoc + BLOCK_HEIGHT / 4,
//				BLOCK_WIDTH / 3, BLOCK_HEIGHT / 4);
//		g.setColor(new Color(100, 255, 100));
//		g.fill(topEmerald);
//
//	}
		
		//inserts the image from the internet instead of drawing an emerald.
		
		BufferedImage img = null;
		try {
			img = ImageIO
					.read(new File(
							"C:/EclipseWorkspaces/csse220/ArcadeGameProject/src/emerald.jpg"));
		} catch (IOException exception) {
			// TODO Auto-generated catch-block stub.
			exception.printStackTrace();
		}

		g.translate(super.xLoc, super.yLoc);

		g.drawImage(img, 0, 0, BLOCK_WIDTH, BLOCK_HEIGHT, 0, 0, img.getWidth(),
				img.getHeight(), null);

		g.translate(-super.xLoc, -super.yLoc);
	}
}
