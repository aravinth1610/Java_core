package lamdaExpression;

interface Myfunctochck<T> {
	int func(T[] vals, T v);
}

class MyarrayOps {
	static <T> int countMatching(T[] values, T v) {
		int count = 0;
		for (int i = 0; i < values.length; i++)
			if (values[i] == v)
				count++;

		return count;
	}
	
	static void print() {
		System.out.println("I'm Pringtin");
	}
}

public class MethodReferenceWithGenerics {
	static <T> int myop(Myfunctochck<T> fInt, T[] vals, T v) {
		return fInt.func(vals, v);
	}

	public static void main(String[] args) {
		Integer[] datas = { 1, 6, 3, 5, 89, 5, 4, 4, 4, 443, 5, 23, 5 };
		String[] datasString = { "one", "two", "three", "four", "five", "six", "seven", "one", "two", "two" };
		System.out.println(myop(MyarrayOps::<Integer>countMatching, datas, 4));
		System.out.println(myop(MyarrayOps::<String>countMatching, datasString, "one"));

	}
}
