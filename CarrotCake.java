package factorydesignpattern;
/**
 * A child of Cake
 * @author Tatem Pearson
 *
 */
public class CarrotCake extends Cake{
	/**
	 * Initializes the name, price, numLayers, shape, decorations, flavor and icing 
	 * also creates the cake 
	 */
	public CarrotCake() {
		name = "Carrot Cake"; 
		price = 54.99; 
		numLayers = 2; 
		shape = Shape.ROUND;
		decorations.add("Walnuts"); 
		flavor = "carrot"; 
		icing = "Cream Cheese"; 
		
		createCake(); 
		getPrice(); 
	}

}
