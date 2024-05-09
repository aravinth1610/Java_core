package lamdaExpression;
//classname::new  

interface Myfunc {
	Myclass fun(int n);
}

class Myclass {
	private int val;

	public Myclass(int v) {
		val = v;
	}

	public Myclass() {
		this.val = 0;
	}

	int getVal() {
		return val;
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		Myfunc fun = Myclass::new;
		Myclass mc = fun.fun(100);
		System.out.println(mc.getVal());
	}
}
