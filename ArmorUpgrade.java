
public class ArmorUpgrade extends PlayerDecorator{
private Player player;

ArmorUpgrade (Player player){
	super(player.name, player.intellect, player.defense+3, player.attack,player.weapon,player.armor);
	this.player = player;
}
public String toString() {
	return player.toString() + "\nUpgraded Armor";
}
public double getPower() {
	return super.getPower();
}
}
