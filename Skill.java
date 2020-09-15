/*
 * created by Charlie Middleton
 */
public class Skill extends PlayerDecorator {
private Player player;

public Skill(Player player) {
	super(player.name,player.intellect,player.defense,player.attack,player.weapon,player.armor);
this.player = player;
}
public String toString() {
	return player.toString() + "\nGained a skill";
	
}
public double getPower() {
	return player.getPower()+2;
	
}
}

