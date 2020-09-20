package factorydesignpattern;

public class BlackForestCake extends Cake {
	
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
	}

}
