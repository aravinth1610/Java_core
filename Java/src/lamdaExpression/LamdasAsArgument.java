package lamdaExpression;

interface StringFunc {
	String func(String n);
}

public class LamdasAsArgument {

	public static void main(String[] args) {

		String data = outData((n)->{
			String finalData ="";
			for(int i=n.length()-1; i>=0 ; i--)
				finalData = finalData + n.charAt(i);		
			return finalData; 
		} , "madam");
		System.out.println(data);
	}

	static String outData(StringFunc strfun, String data) {
		return strfun.func(data);
	}
}
