package factorydesignpattern;

public class Bakery {

	public Cake orderCake(String type) {
		Cake cake; 
		
		if(type == "carrot cake") {
			createCake("carrot cake"); 
		} else if(type == "black forest cake") {
			createCake("black forest cake");
		} else if(type == "birthday cake") {
			createCake("birthday cake"); 
		} else {
			createCake("carrot cake"); 
		}
	
		return cake; 
	}
	
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
