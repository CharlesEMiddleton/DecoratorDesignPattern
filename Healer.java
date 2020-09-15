/*
 * Created By Charlie Middleton
 */
public class Healer extends Player {

	Healer(String name) {
		super(name,8,3,2,"Staff","Robe" );
	}
	public String toString() {
		return "Healer: " + super.toString();
		
	}

}
