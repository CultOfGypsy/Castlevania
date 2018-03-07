/*****************************************************
 *  Authors: Melinda Frandsen
 *  		 Jason Carter
 *  A09 Final Project
 *****************************************************/
package castlevaniaClue;

import javax.swing.ImageIcon;

/**
 * represents the persons involved at the scene of the crime
 * @author Melinda Frandsen & Jason Carter
 *
 */
public enum SuspectName {
	GREEN(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/dracula.jpg")),"Dracula"),
	MUSTARD(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/frankenstein.png")),"Frankenstein's monster"),
	PEACOCK(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/grimReaper.png")),"The Grim Reaper"),
	PLUM(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/medusa2.png")),"Medusa"),
	SCARLET(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/orphicVipers.jpg")),"The Orphic Vipers"),
	WHITE(new ImageIcon(LocationName.class.getResource("/castlevaniaClue/Images/slogra.jpg")),"Slogra");
	
	public ImageIcon image;
	public String name;
	
	/**
	 * constructor allows SuspectName to be used in other classes 
	 * @param image
	 * @param name
	 */
	private SuspectName(ImageIcon image, String name) {
		this.image = image;
		this.name = name;
	}
	
}