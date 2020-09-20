package factorydesignpattern;

public class CarrotCake extends Cake{
	
	public CarrotCake() {
		name = "Carrot Cake"; 
		price = 54.99; 
		numLayers = 2; 
		shape = Shape.ROUND;
		decorations.add("Walnuts"); 
		flavor = "carrot"; 
		icing = "Cream Cheese"; 
	}

}
