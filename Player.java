/*
 * Created by Charlie Middleton
 */
/**
 * this is the base player class that has values all types of players have.
 * @author Charlie Middleton
 *
 */
public abstract class Player {
	/**
	 * Instance variables
	 */
protected String name;
protected int intellect;
protected int defense;
protected int attack;
protected String weapon;
protected String armor;
/**
 * parameter constructor
 * @param name
 * @param intellect
 * @param defense
 * @param attack
 * @param weapon
 * @param armor
 */
 Player(String name, int intellect, int defense, int attack, String weapon, String armor) {
	this.name = name;
	this.intellect=intellect;
	this.defense=defense;
	this.attack=attack;
	this.weapon=weapon;
	this.armor=armor;
}
 /**
	 * to string method to print values
	 */

public String toString() {
	return name +"\nCarries a  "+ weapon+ " and wears a "+armor;
}
/**
 * This method gets the value of power for each character 
 * @return
 */
public double getPower() {
	double power;
 return power = ((attack * 3) + defense + (intellect / 2));
}
}
