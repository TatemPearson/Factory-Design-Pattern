package factorydesignpattern;
/**
 * A child class of Cake
 * @author Tatem Pearson
 *
 */
public class BirthdayCake extends Cake {
	/**
	 * Initializes the name, price, numLayers, shape, decorations, flavor and icing
	 * also creates the cake
	 */
	public BirthdayCake() {
		name = "Birthday Cake"; 
		price = 109.99; 
		numLayers = 1; 
		shape = Shape.SHEET;
		decorations.add("Sprinkles"); 
		decorations.add("Candy Flowers"); 
		decorations.add("Icing Writing");
		flavor = "Funfetti"; 
		icing = "Vanilla"; 
		
		createCake();
		getPrice();
	}

}
