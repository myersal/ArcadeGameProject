import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * 
 * Creates the infoComponent to display some graphics.
 *
 * @author myersal. Created Feb 19, 2015.
 */

@SuppressWarnings("serial")
public class InfoComponent extends JComponent {

	private static final int BLOCK_WIDTH = 600 / 15;
	private static final int BLOCK_HEIGHT = 400 / 10;

	private static int lives;
	private boolean canShoot;
	private boolean hasDynamite;

	/**
	 * 
	 * Creates the infoComponent to draw the lives counter and various other
	 * graphics
	 *
	 * @param frame
	 * 		the frame for the component to paint on
	 * @param lives
	 * 		inputs the number of lives the player gets
	 */

	public InfoComponent(JFrame frame, int lives) {
		InfoComponent.lives = lives;
		this.canShoot = true;
		this.hasDynamite = false;
	}
	
	/**
	 * draws the infoComponent
	 */

	@Override
	protected void paintComponent(Graphics g) {
		for (int i = 0; i < InfoComponent.lives; i++) {
			BufferedImage img = null;
			try {
				img = ImageIO
						.read(new File(
								"C:/EclipseWorkspaces/csse220/ArcadeGameProject/src/miner2.png"));
			} catch (IOException exception) {

				exception.printStackTrace();
			}

			g.translate(i * BLOCK_WIDTH, BLOCK_HEIGHT);

			g.drawImage(img, 0, 0, BLOCK_WIDTH, BLOCK_HEIGHT, 0, 0,
					img.getWidth(), img.getHeight(), null);

			g.translate(-i * BLOCK_WIDTH, -BLOCK_HEIGHT);
		}

		if (this.canShoot) {
			BufferedImage img = null;
			try {
				img = ImageIO
						.read(new File(
								"C:/EclipseWorkspaces/csse220/ArcadeGameProject/src/bullet.jpg"));
			} catch (IOException exception) {

				exception.printStackTrace();
			}

			g.translate(10 * BLOCK_WIDTH, BLOCK_HEIGHT);

			g.drawImage(img, 0, 0, BLOCK_WIDTH, BLOCK_HEIGHT, 0, 0,
					img.getWidth(), img.getHeight(), null);

			g.translate(-10 * BLOCK_WIDTH, -BLOCK_HEIGHT);
		}

		if (this.hasDynamite) {
			BufferedImage img = null;
			try {
				img = ImageIO
						.read(new File(
								"C:/EclipseWorkspaces/csse220/ArcadeGameProject/src/dynamite.jpg"));
			} catch (IOException exception) {

				exception.printStackTrace();
			}

			g.translate(12 * BLOCK_WIDTH, BLOCK_HEIGHT);

			g.drawImage(img, 0, 0, BLOCK_WIDTH, BLOCK_HEIGHT, 0, 0,
					img.getWidth(), img.getHeight(), null);

			g.translate(-12 * BLOCK_WIDTH, -BLOCK_HEIGHT);
		}
	}
	
	/**
	 * 
	 * updates the lives counter to display correctly.
	 *
	 */

	static void updateLives() {
		lives--;
	}
	
	/**
	 * 
	 * updates the boolean whether the player can shoot yet.
	 *
	 * @param tf
	 * 		true or false boolean
	 */

	void updateCanShoot(boolean tf) {
		this.canShoot = tf;
	}
	
	/**
	 * 
	 * updates the boolean whether the player has dynamite.
	 *
	 * @param tf
	 * 		true or false boolean
	 */

	void updatehasDynamite(boolean tf) {
		this.hasDynamite = tf;
	}

}
