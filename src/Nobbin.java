import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * An enemy that cannot dig through dirt.
 *
 * @author myersal.
 *         Created Feb 19, 2015.
 */

public class Nobbin extends AbstractEnemy {
	private static final int BLOCK_WIDTH = 600 / 15;
	private static final int BLOCK_HEIGHT = 400 / 10;

	/**
	 * 
	 * Creates a Nobbin
	 *
	 * @param x
	 *            x coordinate of nobbin.
	 * @param y
	 *            y coordinate of nobbin.
	 */

	public Nobbin(LocalEnvironment w, int x, int y) {
		super(w, x, y);

	}

	/**
	 * 
	 * Draws the playable character on the environment.
	 *
	 * @param g
	 *            graphics object for the image to be drawn on.
	 */

	protected void drawOn(Graphics2D g) {
		BufferedImage img = null;
		try {
			img = ImageIO
					.read(new File(
							"C:/EclipseWorkspaces/csse220/ArcadeGameProject/src/nobbin1.jpg"));
		} catch (IOException exception) {

			exception.printStackTrace();
		}

		g.translate(super.xLoc * BLOCK_WIDTH, super.yLoc * BLOCK_HEIGHT);

		g.drawImage(img, 0, 0, BLOCK_WIDTH, BLOCK_HEIGHT, 0, 0, img.getWidth(),
				img.getHeight(), null);

		g.translate(-super.xLoc * BLOCK_WIDTH, -super.yLoc * BLOCK_HEIGHT);

	}

	/**
	 * complicated move method of the Nobbin.
	 */

	@Override
	public void move() {
		if (world.getLevel()[this.yLoc][this.xLoc] == 5) {
			int randomNum = (int) (Math.random() * 4);
			int xDistance = world.player.xLoc - this.xLoc;
			int yDistance = world.player.yLoc - this.yLoc;
			if (Math.abs(xDistance) > Math.abs(yDistance)) {
				if (xDistance > 0
						&& this.xLoc + 1 < world.getLevel()[this.yLoc].length
						&& (world.getLevel()[this.yLoc][this.xLoc + 1] == 0 || world
								.getLevel()[this.yLoc][this.xLoc + 1] == 3)) {
					world.getLevel()[this.yLoc][this.xLoc] = 0;
					this.xLoc++;
					world.getLevel()[this.yLoc][this.xLoc] = 5;
					if (world.player.xLoc == this.xLoc
							&& world.player.yLoc == this.yLoc) {
						world.player.die();
						world.getLevel()[8][5] = 3;
					}

					return;

				}
				if (xDistance < 0
						&& this.xLoc - 1 >= 0
						&& (world.getLevel()[this.yLoc][this.xLoc - 1] == 0 || world
								.getLevel()[this.yLoc][this.xLoc - 1] == 3)) {
					world.getLevel()[this.yLoc][this.xLoc] = 0;
					this.xLoc--;
					world.getLevel()[this.yLoc][this.xLoc] = 5;
					if (world.player.xLoc == this.xLoc
							&& world.player.yLoc == this.yLoc) {
						world.player.die();
						world.getLevel()[8][5] = 3;
					}

					return;
				}
			}
			if (Math.abs(xDistance) < Math.abs(yDistance)) {
				if (yDistance > 0
						&& this.yLoc + 1 < world.getLevel().length
						&& (world.getLevel()[this.yLoc + 1][this.xLoc] == 0 || world
								.getLevel()[this.yLoc + 1][this.xLoc] == 3)) {
					world.getLevel()[this.yLoc][this.xLoc] = 0;
					this.yLoc++;
					world.getLevel()[this.yLoc][this.xLoc] = 5;
					if (world.player.xLoc == this.xLoc
							&& world.player.yLoc == this.yLoc) {
						world.player.die();
						world.getLevel()[8][5] = 3;
					}

					return;

				}
				if (yDistance < 0
						&& this.yLoc - 1 >= 0
						&& (world.getLevel()[this.yLoc - 1][this.xLoc] == 0 || world
								.getLevel()[this.yLoc - 1][this.xLoc] == 3)) {
					world.getLevel()[this.yLoc][this.xLoc] = 0;
					this.yLoc--;
					world.getLevel()[this.yLoc][this.xLoc] = 5;
					if (world.player.xLoc == this.xLoc
							&& world.player.yLoc == this.yLoc) {
						world.player.die();
						world.getLevel()[8][5] = 3;
					}

					return;
				}
			}
			if (yDistance < 0
					&& this.yLoc - 1 >= 0
					&& (world.getLevel()[this.yLoc - 1][this.xLoc] == 0 || world
							.getLevel()[this.yLoc - 1][this.xLoc] == 3)) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.yLoc--;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}
			if (xDistance > 0
					&& this.xLoc + 1 < world.getLevel()[this.yLoc].length
					&& (world.getLevel()[this.yLoc][this.xLoc + 1] == 0 || world
							.getLevel()[this.yLoc][this.xLoc + 1] == 3)) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.xLoc++;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}
			if (yDistance > 0
					&& this.yLoc + 1 < world.getLevel().length
					&& (world.getLevel()[this.yLoc + 1][this.xLoc] == 0 || world
							.getLevel()[this.yLoc + 1][this.xLoc] == 3)) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.yLoc++;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}
			if (xDistance < 0
					&& this.xLoc - 1 >= 0
					&& (world.getLevel()[this.yLoc][this.xLoc - 1] == 0 || world
							.getLevel()[this.yLoc][this.xLoc - 1] == 3)) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.xLoc--;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}
			if (this.yLoc - 1 >= 0
					&& world.getLevel()[this.yLoc - 1][this.xLoc] == 0
					&& randomNum == 0) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.yLoc--;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}
			if (this.xLoc + 1 < world.getLevel()[this.yLoc].length
					&& world.getLevel()[this.yLoc][this.xLoc + 1] == 0
					&& randomNum == 1) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.xLoc++;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}
			if (this.yLoc + 1 < world.getLevel().length
					&& world.getLevel()[this.yLoc + 1][this.xLoc] == 0
					&& randomNum == 2) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.yLoc++;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}
			if (this.xLoc - 1 >= 0
					&& world.getLevel()[this.yLoc][this.xLoc - 1] == 0
					&& randomNum == 3) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.xLoc--;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}
			if (this.yLoc - 1 >= 0
					&& world.getLevel()[this.yLoc - 1][this.xLoc] == 0) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.yLoc--;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}
			if (this.xLoc + 1 < world.getLevel()[this.yLoc].length
					&& world.getLevel()[this.yLoc][this.xLoc + 1] == 0) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.xLoc++;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}
			if (this.yLoc + 1 < world.getLevel().length
					&& world.getLevel()[this.yLoc + 1][this.xLoc] == 0) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.yLoc++;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}
			if (this.xLoc - 1 >= 0
					&& world.getLevel()[this.yLoc][this.xLoc - 1] == 0) {
				world.getLevel()[this.yLoc][this.xLoc] = 0;
				this.xLoc--;
				world.getLevel()[this.yLoc][this.xLoc] = 5;
				if (world.player.xLoc == this.xLoc
						&& world.player.yLoc == this.yLoc) {
					world.player.die();
					world.getLevel()[8][5] = 3;
				}

				return;
			}

		}

	}
	
	/**
	 * returns the number for the level map for a nobbin
	 */

	@Override
	public int getType() {
		return 5;

	}

}
