package lamdaExpression;

interface Mynumber {
	// when we trying it use lamda expression only one function prototype in the
	// interface ..
	Double getmynumber();
}

interface CheckIsEven {
	Boolean getisEven(int n);
}

public class SimpleInterface {
	public static void main(String[] args) {

		Mynumber mynum;

		// In Mynumber interface void function ... in the fucntion is void so () no need
		// to pass the perameter;
		mynum = () -> 2.32;
		System.out.println("my number is " + mynum.getmynumber());

		// In checkisEven interface pass the int value ...
		CheckIsEven isEven = (n) -> n % 2 == 0;
		System.out.println(isEven.getisEven(21) ? "is even" : "is false");
	}
}
