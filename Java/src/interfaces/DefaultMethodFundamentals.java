package interfaces;

interface testing {
	int getNumber();

	default String getString() {
		return "hello it is default";
	}
}

class myTestingImpl implements testing{

	@Override
	public int getNumber() {
		return 100;
	}
	
}

public class DefaultMethodFundamentals {

	public static void main(String[] args) {
		myTestingImpl test = new  myTestingImpl(); 
		System.out.println(test.getNumber()); 
		System.out.println(test.getString());
	}
}
