/*
 * Created By charlie middleton
 */
public abstract class PlayerDecorator extends Player {
PlayerDecorator(String name, int intellect, int defense, int attack, String weapon, String armor) {
		super(name, intellect, defense, attack, weapon, armor);

		this.power = ((attack *3)+defense+(intellect/2));
}
public double power;
	
public double getPower() {
	return power;
}
public abstract String toString();

}
