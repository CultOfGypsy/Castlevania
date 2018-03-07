/*****************************************************
 *  Author: Jason Carter
 *  A09 Final Project
 *****************************************************/
package castlevaniaClue;

import javax.swing.ImageIcon;

/**
 * represents the possible crime scenes involved in the game
 * @author Melinda Frandsen & Jason Carter
 *
 */
public enum LocationName {
	
	BALLROOM(1, (new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/caverns.jpg"))), "caverns"),
	BILLIARD_ROOM(2, (new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/middleCastle.jpg"))), "middle castle"),
	CONSERVATORY(3, (new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/clock.png"))), "clock tower"),
	DINING_ROOM(4, (new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/libraryCv.png"))), "library"),
	HALL(5, (new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/outerWalls.png"))), "outer walls"),
	KITCHEN(6,(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/laboratory.jpg"))), "laboratory"),
	LIBRARY(7, (new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/rotatingRoom.jpg"))), "rotating room"),
	LOUNGE(8, (new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/courtyard.jpg"))), "courtyard"),
	STUDY(9, (new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/draculasChamber.jpg"))), "Dracula's chamber");
	
	public int mapLocation;
	public ImageIcon image;
	public String name;
	
	/**
	 * constructor allows LocationName to be used in other classes
	 * @param mapLocation
	 * @param image
	 * @param name
	 */
	private LocationName(int mapLocation, ImageIcon image, String name) {
		this.mapLocation = mapLocation;
		this.image = image;
		this.name = name;
	}
	
}
