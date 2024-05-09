package lamdaExpression;

interface MyInterfaceM<T> {
	Myclasstest<T> func(T n);
}

class Myclasstest<T> {

	private T getT;

	public Myclasstest(T v) {
		this.getT = v;
	}

	public Myclasstest() {
		getT = null;
	}

	T getval() {
		return getT;
	}
}

public class ConstructorReferenceWithGenerics {

	public static void main(String[] args) {
		MyInterfaceM<Integer> check = Myclasstest<Integer>::new;
		Myclasstest<Integer> test = check.func(63563);
		System.out.println(test.getval());
		MyInterfaceM<String> strcheck = Myclasstest<String>::new;
		Myclasstest<String> testingdata = strcheck.func("fun pandrom");
		System.out.println(testingdata.getval());

	}
}
