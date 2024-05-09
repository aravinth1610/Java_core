package lamdaExpression;

interface NumericFun {
	int testing(int data);
}

public class BlockLamdaExpression {
	public static void main(String[] args) {
		NumericFun lamda = (n) -> {
			int data = 1;

			for (int i = 1; i <= n; i++)
				data = data * i;

			return data;
		};
		
		
		System.out.println(lamda.testing(3));
		System.out.println(lamda.testing(5));
		System.out.println(lamda.testing(10));


	}
}
