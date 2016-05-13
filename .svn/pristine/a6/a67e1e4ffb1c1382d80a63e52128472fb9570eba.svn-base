import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * Sets aside the space as empty and draws it
 */

@SuppressWarnings("serial")
public class EmptySpace extends AbstractSpace {
	private static final int BLOCK_WIDTH = 600 / 15;
	private static final int BLOCK_HEIGHT = 400 / 10;

	/**
	 * 
	 * Creates the empty space.
	 *
	 * @param x
	 * @param y
	 */

	public EmptySpace(int x, int y) {
		super(x, y);
	}

	/**
	 * 
	 * Draws the empty space as white.
	 *
	 * @param g
	 */

	protected void drawOn(Graphics2D g) {
		Rectangle2D.Double space = new Rectangle2D.Double(super.xLoc,
				super.yLoc, BLOCK_WIDTH, BLOCK_HEIGHT);
		g.setColor(Color.white);
		g.fill(space);
	}

}
