package lamdaExpression;

interface StringFuncs {
	String func(String n);
}

class myStringOps {
	static String strReverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--)
			result += str.charAt(i);
		return result;
	}
}

public class MethodReference {

	static String StringOps(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "Get lost!";
		String outStr;

		outStr = StringOps(myStringOps::strReverse, inStr);
		System.out.println("final output is--->" + outStr);
	}
}
