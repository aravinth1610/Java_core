package interfaces;

interface a {
	void methoda();

	void methodb();
}

interface b extends a {
	void methodc();
}

class implementClass implements b {

	@Override
	public void methoda() {
		System.out.println("method one");
	}

	@Override
	public void methodb() {
		System.out.println("method two");

	}

	@Override
	public void methodc() {
		System.out.println("method three");

	}

}

public class ExtendedInterface {

	public static void main(String[] args) {
		implementClass a = new implementClass();
		a.methoda();
		a.methodb();
		a.methodc();
		
		b imp = new b() {
			
			@Override
			public void methodb() {
				System.out.println("method 1");
				
			}
			
			@Override
			public void methoda() {
				System.out.println("method 2");
				
			}
			
			@Override
			public void methodc() {
				System.out.println("method three");
				
			}
		};
		
		imp.methoda();
	}
}
