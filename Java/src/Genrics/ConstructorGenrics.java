package Genrics;

class GenConstructor {
	private double val;

	// number is an abstract class where it is implement
	public <T extends Number> GenConstructor(T obj) {
		val = obj.doubleValue();
	}
	
	void showVal() {
		 System.out.println("value is "+val);
	}
}

// write own class to extends a simple double conversion; 

public class ConstructorGenrics {

	public static void main(String[] args) {
		
		GenConstructor cons = new GenConstructor(45);
		cons.showVal();
	}
}
