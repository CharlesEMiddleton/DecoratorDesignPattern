
public class WeaponUpgrade extends PlayerDecorator {
Player player;
public WeaponUpgrade(Player player) {
	super(player.name,player.intellect,player.defense+5,player.attack,player.weapon,player.armor);

	this.player=player;
}
public double getPower() {
	return player.getPower() ;
}
public String toString() {
	return player.toString()+ "\n Upgraded Weapon";
	
}
}
