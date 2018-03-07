/*****************************************************
 *  Authors: Melinda Frandsen
 *  		 Jason Carter
 *  A09 Final Project
 *****************************************************/
package castlevaniaClue;

import java.util.Random;

/**
 * creates game generated selection of guilty elements and checks player's guesses
 * @author Jason Carter
 *
 */
public class Guess {
	private WeaponType[] weapons = { WeaponType.CANDLESTICK, WeaponType.KNIFE, WeaponType.LEADPIPE, WeaponType.REVOLVER,
			WeaponType.ROPE, WeaponType.WRENCH };
	private SuspectName[] suspects = { SuspectName.GREEN, SuspectName.MUSTARD, SuspectName.PEACOCK, SuspectName.PLUM,
			SuspectName.SCARLET, SuspectName.WHITE };
	private LocationName[] locations = { LocationName.BALLROOM, LocationName.BILLIARD_ROOM, LocationName.CONSERVATORY,
			LocationName.DINING_ROOM, LocationName.HALL, LocationName.KITCHEN, LocationName.LIBRARY,
			LocationName.LOUNGE, LocationName.STUDY };
	private WeaponType guiltyWeapon;
	private SuspectName guiltySuspect;
	private LocationName guiltyLocation;

	// creating random variable
	Random rand = new Random();

	/**
	 * constructor creates winning guess to be accessible by other classes.
	 * @param weapons  - a weapon is was used to commit the murder
	 * @param suspects  - a suspect is a person of interest in the murder
	 * @param locations  - a location is a possible crime scene area
	 */
	public Guess() {
		this.guiltyWeapon = randomWeapon();
		this.guiltySuspect = randomSuspect();
		this.guiltyLocation = randomLocation();
	}

	/**
	 * this method obtains the weapon that was used.
	 * @return the guiltyWeapon
	 */
	public WeaponType getGuiltyWeapon() {
		return guiltyWeapon;
	}

	/**
	 * this method obtains the name of the suspect that is guilty
	 * @return the guiltySuspect
	 */
	public SuspectName getGuiltySuspect() {
		return guiltySuspect;
	}

	/**
	 * this method obtains the location of the crime scene
	 * @return the guiltyLocation
	 */
	public LocationName getGuiltyLocation() {
		return guiltyLocation;
	}

	/**
	 * generates and returns the computer generated guilty location
	 * @return locations[guiltyLocation]
	 */
	private LocationName randomLocation() {
		int guiltyLocation = rand.nextInt(locations.length);
		return locations[guiltyLocation];
	}

	/**
	 * generates and returns the computer generated guilty suspect
	 * @return suspects[guiltySuspect]
	 */
	private SuspectName randomSuspect() {
		int guiltySuspect = rand.nextInt(suspects.length);
		return suspects[guiltySuspect];
	}

	/**
	 * generates and returns the computer generated guilty weapon
	 * @return weapons[guiltyWeapon]
	 */
	private WeaponType randomWeapon() {
		int guiltyWeapon = rand.nextInt(weapons.length);
		return weapons[guiltyWeapon];
	}

	/**
	 * this method compares the players guess to the computer
	 * generated guilty elements
	 * @param s  - s is player suspect guess
	 * @param w  - w is player weapon guess
	 * @param l  - l is player location guess
	 * @return val  - val is boolean array of 3 elements
	 */
	public boolean[] evaluate(SuspectName s, WeaponType w, LocationName l) {
		boolean[] val = new boolean[3];
		val[0] = this.guiltySuspect == s;
		val[1] = this.guiltyWeapon == w;
		val[2] = this.guiltyLocation == l;
		return val;
	}
}
