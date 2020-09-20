package factorydesignpattern;

import java.util.ArrayList; 
public class Cake {
	protected String name; 
	protected double price;
	protected int numLayers;
	protected Shape shape; 
	protected ArrayList<String> decorations; 
	protected String flavor; 
	protected String icing; 
	
	public Cake() {
		decorations = new ArrayList<String>(); 
	}
	
	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
	}
	
	private void createLayers() {  
		System.out.println(" "); 
	}
	
	private void frostCake() {
		System.out.println("Frost cake with "  + icing + " icing"); 
	}
	
	private void addDecorations() {
		for(String decor: decorations) {
			System.out.println("adding " + decor);
		}
	}
	
	public double getPrice() {
		return price; 
	}

}
