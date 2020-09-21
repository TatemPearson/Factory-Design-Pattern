package factorydesignpattern;
/**
 * The factory class which handles the creation of a Cake
 * @author Tatem Pearson
 *
 */
public class Bakery {
	/**
	 * A factory statement
	 * The ordering of a Cake 
	 * @param type The type of cake being ordered
	 * @return the ordered cake
	 */
	public Cake orderCake(String type) {
		Cake cake; 
		
		if(type == "carrot cake") {
			cake = createCake("carrot cake"); 
		} else if(type == "black forest cake") {
			cake = createCake("black forest cake");
		} else if(type == "birthday cake") {
			cake = createCake("birthday cake"); 
		} else {
			cake = createCake("carrot cake"); 
		}
	
		return cake; 
	}
	
	/**
	 * A factory statement
	 * The creation of a Cake Object as an instance of one of its child classes
	 * @param type The type of cake being created
	 * @return the created cake 
	 */
	private Cake createCake(String type) {
		Cake cake;
		
		if(type == "carrot cake") {
			cake = new CarrotCake(); 
		} else if(type == "black forest cake") {
			cake = new BlackForestCake();
		} else if(type == "birthday cake") {
			cake = new BirthdayCake(); 
		} else {
			cake = new CarrotCake(); 
		}
		
		return cake; 
	}
	
	
}
