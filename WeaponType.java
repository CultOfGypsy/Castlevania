/*****************************************************
 *  Author:	 Jason Carter
 *  Castlevania edition of Clue
 *****************************************************/
package castlevaniaClue;

import javax.swing.ImageIcon;

/**
 * represents the weapons involved at the scene of the crime
 * @author Jason Carter
 *
 */
public enum WeaponType {
	CANDLESTICK(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/axe.jpg")),"axe"),
	KNIFE(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/boomerang.png")),"boomerang"),
	LEADPIPE(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/chainWhip.png")),"chain whip"),
	REVOLVER(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/holyWater.png")),"holy water"),
	ROPE(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/morningStar.png")),"morning star"),
	WRENCH(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/vampireKiller.png")),"vampire killer");
	
	public ImageIcon image;
	public String name;

	/**
	 * constructor allows WeaponType to be used in other classes
	 * @param image
	 * @param name
	 */
	private WeaponType(ImageIcon image, String name) {
		this.image = image;
		this.name = name;
	}
	
}