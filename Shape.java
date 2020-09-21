package factorydesignpattern;
/**
 * All possible options for the shape of a cake
 * @author Tatem Pearson
 *
 */
public enum Shape {
	ROUND, SQUARE, SHEET, CUPCAKES, BUNT; 
	
	/**
	 * returns a Shape in lowercase
	 */
	public String toString() {
		return name().toLowerCase(); 
	}
}
