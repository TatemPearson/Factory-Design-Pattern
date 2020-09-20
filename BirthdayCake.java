package factorydesignpattern;

public class BirthdayCake extends Cake {
	
	public BirthdayCake() {
		name = "Birthday Cake"; 
		price = 109.99; 
		numLayers = 1; 
		shape = Shape.SHEET;
		decorations.add("Sprinkles"); 
		decorations.add("Candy Flowers"); 
		decorations.add("Icind Writing");
		flavor = "Funfetti"; 
		icing = "Vanilla"; 
	}

}
