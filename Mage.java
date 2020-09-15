/*
 * Created by Charlie Middleton
 */
public class Mage extends Player {
	
Mage(String name) {
super(name, 7,4,3, "Staff", "Robe");
}
public String toString() {
	return"Mage: "+super.toString(); 
}
}
