package factorydesignpattern;
/**
 * A child of Cake
 * @author Tatem Pearson
 *
 */
public class BlackForestCake extends Cake {
	/**
	 * Initializes the name, price, numLayers, shape, decorations, flavor and icing
	 * also created the cake
	 */
	public BlackForestCake() {
		name = "Black Forest Cake"; 
		price = 47.99; 
		numLayers = 3; 
		shape = Shape.ROUND;
		decorations.add("Cherries");
		decorations.add("Chocolate Flakes"); 
		decorations.add("Whipped Cream"); 
		flavor = "Black Forest"; 
		icing = "Whipped Cream"; 
		
		createCake();
		getPrice();
	}

}
