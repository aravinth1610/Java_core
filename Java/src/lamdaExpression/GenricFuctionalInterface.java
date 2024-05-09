package lamdaExpression;

interface SomeFun<T> {
	T fun(T t);
}

public class GenricFuctionalInterface {

	public static void main(String[] args) {

		SomeFun<String> data;
		data = (n) -> {
			String finalData = "";

			for (int i = n.length() - 1; i >= 0; i--) {
				finalData = finalData + n.charAt(i);
			}

			return finalData;
		};

		System.out.println(data.fun("leo"));

		SomeFun<Integer> IntegerData;

		IntegerData = (n) -> {
			int factorialData = 1;
			for (int i = 1; i <= n; i++)
				factorialData *= i;

			return factorialData;
		};

		System.out.println("factorial data ->" + IntegerData.fun(10));

	}
}
