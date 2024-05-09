package interfaces;


interface DefineInterface{
	/*
	 * it represent IS-A relationship
	 *  1) It is used to achive abstraction. 
	 *  2) By interface we can support the fuctionally of mulitple inhertance.
	 *   3) It can beused to achive loosly coupling.
	 */
	
	/*
	 * ------>In interface we can define
	 * ------>declare const fields 
	 * ------>declare methods that abstract by default
	 */
	
	/*
	 * -----> you can't instantiate variable and create an object
	 * -----> interface only one specifier is used public 
	 */	
	/* relationship between class and iterface 
	 * class      		interface					interface
	 * |					|							|
	 * |					|							|
	 * | extends 			| implements				| extends
	 * |					|							|
	 * |					|							|
	 * class			  class						interface
	 * 
	 * */
	void testing();
}

class ImplementTesting implements DefineInterface{

	@Override
	public void testing() {
		System.out.println("testing is completed .. ");
	}
	
}

public class SimpleInterface {

	public static void main(String[] args) {
//		ImplementTesting b = new ImplementTesting(); 
//		b.testing();
		
		DefineInterface a = new DefineInterface() {
			
			@Override
			public void testing() {
				System.out.println("testing .. using anonamus class ");
			}
		};
		a.testing(); 
	}
}
