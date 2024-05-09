package lamdaExpression;

interface DoubleNumbericArrayFunction {
	double func(double[] data) throws EmptyArrayExpections;
}

class EmptyArrayExpections extends Exception {
	private static final long serialVersionUID = 1L;

	public EmptyArrayExpections() {
		super("Array Empty");

	}
}

public class LamdaExceptions {

	public static void main(String[] args) throws EmptyArrayExpections {

		double[] data = { 1.2, 5.6, 89.36, 895.235, 56.32 };

		DoubleNumbericArrayFunction avg = (n) -> {
			double finalData = 0.0;

			if (n.length == 0)
				throw new EmptyArrayExpections();

			for (int i = 0; i < n.length; i++)
				finalData += n[i];

			return finalData / n.length;
		};
		System.out.println(avg.func(data));
		System.out.println(avg.func(new double[0]));

	}
}
