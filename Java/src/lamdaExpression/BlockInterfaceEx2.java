package lamdaExpression;

interface StringEx {
	StringBuilder reverse(String data);
}

public class BlockInterfaceEx2 {

	public static void main(String[] args) {
		StringEx reverse;
		reverse = (n) -> {
			StringBuilder data = new StringBuilder();
			for (int i = n.length()-1; i >= 0; i--) {
				data.append(n.charAt(i));
			}
			return data;
		};

		System.out.println(reverse.reverse("Lucky"));
	}
}
