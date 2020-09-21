package factorydesignpattern;
/**
 * The parent class for all cakes in the bakery 
 * @author Tatem Pearson
 */
import java.util.ArrayList; 
public class Cake {
	protected String name; 
	protected double price;
	protected int numLayers;
	protected Shape shape; 
	protected ArrayList<String> decorations; 
	protected String flavor; 
	protected String icing; 
	
	/**
	 * Initializes the decorations ArrayList
	 */
	public Cake() {
		decorations = new ArrayList<String>(); 
	}
	
	/**
	 * Creates the cake with a combination of layers, icing, and decorations
	 */
	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
	}
	
	/**
	 * A factory statement
	 * Prints the correct statement based on how many layers are in the cake 
	 * takes the shape of the cake into account 
	 */
	private void createLayers() {  
		if(shape == shape.CUPCAKES) {
			System.out.println("Creating " + flavor + " cupcakes");
		} else if(shape == shape.BUNT) {
			System.out.println("Creating a " + flavor + " bunt cake"); 
		} else if((shape == shape.SHEET & numLayers == 1) || (shape == shape.ROUND & numLayers ==1)) {
			System.out.println("Creating a " + numLayers + " layer " + shape + " " + flavor + " cake");
		} else if((shape == shape.SHEET & numLayers > 1) || (shape == shape.ROUND & numLayers > 1)) {
			System.out.println("Creating a " + numLayers + " layered " + shape + " " + flavor + " cake");
		} else {
			System.out.println("Creating a " + numLayers + " layered " + shape + " " + flavor + "cake" ); 
		}
		
	}
	
	/**
	 * Frosts the cake with proper icing
	 */
	private void frostCake() {
		System.out.println("Frost cake with "  + icing + " icing"); 
	}
	
	/**
	 * Dislpays all of the decorations on a cake
	 */
	private void addDecorations() {
		for(String decor: decorations) {
			System.out.println("adding " + decor);
		}
	}
	
	/**
	 * @return a double which is the price of the cake
	 */
	public double getPrice() {
		System.out.println("Price: " + "$" + price); 
		return price; 
	}

}
