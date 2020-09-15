/*
 * Created by Charlie Middleton
 */
public class Warrior extends Player{

	 Warrior(String name) {
		super(name,2,5,8,"sword","Breast Plate");
	}
	public String toString() {
		return "Warrior: "+super.toString();
	}
}
