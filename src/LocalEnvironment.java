import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * 
 * @author goebelag
 * 
 *         creates the game board
 *
 */
@SuppressWarnings("serial")
public class LocalEnvironment extends JComponent {
	// background color of local enviroment
	public static final Color backgroundColor = new Color(155, 100, 75);
	// the player
	public Player player;
	// the starting level
	private int[][] startLevel;
	private int emeraldCount;
	private Graphics2D g3;
	protected Bullet bullet;
	public static final int NUMBER_OF_GOLD_BAGS = 7;
	protected ArrayList<GoldBag> goldBagList = new ArrayList<GoldBag>();
	protected static boolean firstDraw = true;
	protected static int GoldBagCounter = -1;
	


	/**
	 * 
	 * @param frame
	 *            - the frame
	 * @param level
	 *            - level to set to startLevel
	 */
	public LocalEnvironment(JFrame frame, int[][] level) {
		this.startLevel = level;
		this.emeraldCount = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				if (level[i][j] == 2) {
					this.emeraldCount++;
				}
			}
		}
	}
	
	/**
	 * returns the graphics objects
	 */

	public Graphics2D getGraphics() {
		return g3;
	}

	/**
	 * 
	 * @param newLevel
	 *            - newLevel to put to startLevel
	 */
	public void changeLevelTo(int[][] newLevel) {
		this.startLevel = newLevel;
		this.emeraldCount = 0;
		goldBagList.clear();
		GoldBagCounter = -1;
		firstDraw = true;
		this.goldBagList = new ArrayList<GoldBag>();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				if (newLevel[i][j] == 2) {
					this.emeraldCount++;
				}
			}
		}
	}

	/**
	 * 
	 * Returns the number of emeralds left in the level.
	 *
	 * @return returns the number of emeralds left.
	 */

	public int getEmeralds() {
		return this.emeraldCount;
	}

	/**
	 * 
	 * subtracts an emerald from the emerald count.
	 *
	 */

	public void subtractEmerald() {
		this.emeraldCount--;
	}

	/**
	 * 
	 * Returns the level that it currently is on.
	 *
	 * @return current level.
	 */

	public int[][] getLevel() {
		return startLevel;
	}

	/**
	 * 
	 * Ends the game.
	 *
	 */
	public static void endGame() {
		// add
	}

	/**
	 * draws the game board
	 * 
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g3 = (Graphics2D) g;

		// Rectangle2D background = new Rectangle2D.Double(0,0,600,400);
		// g2.setColor(backgroundColor);
		// g2.fill(background);
		//
		for (int i = 0; i < this.startLevel.length; i++) {
			for (int j = 0; j < this.startLevel[i].length; j++) {
				// 0 stands for empty space
				if (this.startLevel[i][j] == 0) {
					EmptySpace space = new EmptySpace(j, i);
					space.drawOn(g2);
				}
				// 1 stands for dirt space
				if (this.startLevel[i][j] == 1) {
					Dirt dirt = new Dirt(j, i);
					dirt.drawOn(g2);

				}
				// 2 stands for emerald space
				if (this.startLevel[i][j] == 2) {
					Emerald emerald = new Emerald(j, i);
					emerald.drawOn(g2);

				}
				// 3 stands for the player start
				if (this.startLevel[i][j] == 3) {
					Player playerTo = new Player(j, i);
					this.player = playerTo;
					playerTo.drawOn(g2);
				}
				// 4 stands for a hobbin location
				if (this.startLevel[i][j] == 4) {
					Hobbin hobbin = new Hobbin(this, j, i);
					hobbin.drawOn(g2);

				}
				// 5 stands for a nobbin location
				if (this.startLevel[i][j] == 5) {
					Nobbin nobbin = new Nobbin(this, j, i);
					nobbin.drawOn(g2);
				}
				// 6 stands for a bullet up.
				if (this.startLevel[i][j] == 6) {
					Bullet drawnbullet = new Bullet(j, i, this);
					drawnbullet.drawOn(g2);
					drawnbullet.setDirection("up");
					this.bullet = drawnbullet;
				}
				// 7 stands for a bullet down.
				if (this.startLevel[i][j] == 7) {
					Bullet drawnbullet = new Bullet(j, i, this);
					drawnbullet.drawOn(g2);
					drawnbullet.setDirection("down");
					this.bullet = drawnbullet;
				}
				// 8 stands for a bullet left.
				if (this.startLevel[i][j] == 8) {
					Bullet drawnbullet = new Bullet(j, i, this);
					drawnbullet.drawOn(g2);
					drawnbullet.setDirection("left");
					this.bullet = drawnbullet;
				}
				// 9 stands for a bullet right.
				if (this.startLevel[i][j] == 9) {
					Bullet drawnbullet = new Bullet(j, i, this);
					drawnbullet.drawOn(g2);
					drawnbullet.setDirection("right");
					this.bullet = drawnbullet;
				}
				
				// stands for a broken gold bag.
				if (this.startLevel[i][j] == 11){
					GoldCoin goldcoin = new GoldCoin(j,i,this);
					goldcoin.drawOn(g2);
					
				}
				
				// 10 stands for a gold space
				if (this.startLevel[i][j] == 10) {
					
					//GoldBag goldBag;
//					GoldBag goldbag = new GoldBag(j,i,this);
//					goldbag.drawOn(g2);
//					if (firstDraw) {
//						Main.gold.add(goldbag);
//					}
					
					if(firstDraw){
						GoldBag goldBag;
						GoldBagCounter++;
						goldBag = new GoldBag(j, i, this);
//						for(int k = 0; k < NUMBER_OF_GOLD_BAGS; k++){
//							if(this.goldBagList.get(k)==null){
//								this.goldBagList.add(goldBag);
//								goldBag.drawOn(g2);
//								break;
//							}
						this.goldBagList.add(goldBag);
						goldBag.drawOn(g2);
	//					break;
							
							
	//					}
						if(GoldBagCounter==6){
							GoldBagCounter = -1;
							firstDraw = false;
						}
						
						Main.gold = goldBagList;
					} else {
						GoldBagCounter++;
						try{
							getGoldBagAtYX(i,j).drawOn(g2);
						} catch (NullPointerException e) {
							//Do Nothing.
						}
//						goldBag = this.goldBagList[GoldBagCounter];
//						goldBag.drawOn(g2);
						if(GoldBagCounter==this.goldBagList.size())
							GoldBagCounter = -1;
					}
				}
				
				// stands for a broken gold bag.
				
				//dynamite
				if(this.startLevel[i][j] == 12) {
					Dynamite dynamite = new Dynamite(j,i);
					dynamite.drawOn(g2);
				}
			}
		}
	}

	/**
	 * 
	 * Returns the bullet.
	 *
	 * @return returns the bullet.
	 */

	public Bullet getBullet() {
		return this.bullet;
	}

	/**
	 * 
	 * clears the bullet from the map.
	 *
	 */
	public void clearBullet() {
		this.bullet = null;
	}
	
	/**
	 * 
	 * returns the the gold bag arraylist.
	 *
	 * @return
	 * 		the gold bag arraylist
	 */
	
	public ArrayList<GoldBag> getGoldBagList(){
		return this.goldBagList;
	}
	
	/**
	 * 
	 * sets the new goldBagList to the newList.
	 *
	 * @param newList
	 * 		the new goldBagList
	 */
	
	public void setGoldBagList(ArrayList<GoldBag> newList) {
		this.goldBagList = newList;
	}
	
	/**
	 * 
	 * sets the current index to null.
	 *
	 * @param index
	 * 		index to be set to null
	 */
	
	public void clearThisGoldBag(int index){
		this.goldBagList.set(index, null);
	}
	
	/**
	 * 
	 * gets the gold bag at the given coordinates.
	 *
	 * @param y
	 * 		the y coordinate that the bag should be
	 * @param x
	 * 		the x coordinate that the bag should be
	 * @return
	 * 		returns the given bag that has the x and y coordinates
	 */
	
	public GoldBag getGoldBagAtYX(int y, int x){
		for (int i = 0; i < this.goldBagList.size() ; i++){
			if(this.goldBagList.get(i).getX()==x && this.goldBagList.get(i).getY()==y)
				return this.goldBagList.get(i);
		}
		
		return null;
			
	}
	
	/**
	 * 
	 * sets the gold bag at the given coordinates to the given x and y coordinates.
	 *
	 * @param startY
	 * 		y coordinate that the bag should originally be
	 * @param startX
	 * 		x coordinate that the bag should originally be
	 * @param endY
	 * 		y coordinate that the bag should end up at
	 * @param endX
	 * 		x coordinate that the bag should end up at
	 */
	
	public void setGoldBagAtYX(int startY, int startX, int endY, int endX) {
		for (int i = 0; i < this.goldBagList.size() ; i++){
			if(this.goldBagList.get(i).getX()==startX && this.goldBagList.get(i).getY()==startY) {
				this.goldBagList.get(i).setGoldBag(endY, endX);
			}
		}
	}
}