import java.awt.Graphics2D;

/**
 * 
 * Creates a space in the window and says it is occupied.
 *
 * @author myersal. Created Feb 6, 2015.
 */
@SuppressWarnings("serial")
public abstract class AbstractOccupiedSpace extends AbstractSpace {

	/**
	 * 
	 * Creates the abstract space.
	 *
	 * @param x
	 * @param y
	 */

	public AbstractOccupiedSpace(int x, int y) {
		super(x, y);
	}
	protected abstract void drawOn(Graphics2D g);

}
