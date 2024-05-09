package interfaces;

interface Alpha {
	default String reset(String a) {
		ad();// we can add this method in normal defalut mehtod
		System.out.println("Alpha's reset method");
		return a;
	}

	static void testing() {
		ad();// incase it is a static method we can method in static funtion definition
		// not static means it shows error(Cannot make a static reference to the
		// non-static method ad() from the type Alpha)
		System.out.println("it workdign ");
	}

	private static void ad() {
		System.out.println("oneeee");
	}
}

interface Beta extends Alpha {
	default String reset() {
		String a = Alpha.super.reset("gekki =");
		System.out.println("Beta's reset method");
		return a;
	}
}

class MyClass implements Alpha, Beta {

}

public class CheckError {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.reset();
		Alpha.testing();

	}
}
