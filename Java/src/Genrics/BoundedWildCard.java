package Genrics;


// understand well this concept 
class two {
	int x, y;

	public two(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class three extends two {

	int z;

	public three(int x, int y, int c) {
		super(x, y);
		this.z = c;
	}

}

class four extends three {

	int e;

	public four(int x, int y, int c, int e) {
		super(x, y, c);
		this.e = e;
	}

}

class Coords<T extends two> {
	T[] coords;

	public Coords(T[] obj) {
		this.coords = obj;
	}

}

public class BoundedWildCard {

	static void showxy(Coords<?> c) {
		System.out.println("Printing x and y");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x);
			System.out.println(c.coords[i].y);

		}
	}

	static void showxyz(Coords<? extends three> c) {
		System.out.println("printing xy z");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x);
			System.out.println(c.coords[i].y);
			System.out.println(c.coords[i].z);

		}
	}

	static void shoxyzz(Coords<? extends four> c) {
		System.out.println("pringting zyxsdf");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x);
			System.out.println(c.coords[i].y);
			System.out.println(c.coords[i].z);
			System.out.println(c.coords[i].e);
		}
	}

	public static void main(String[] args) {

		two tw[] = { new two(12, 56), new two(21, 32), new two(4, 3), new two(2, 5)

		};
		Coords<two> twoloc = new Coords<two>(tw);
		//showxy(twoloc);
//		showxyz(twoloc);

		four fours[] = { new four(4, 7, 8, 3), new four(14, 72, 3, 34), new four(44, 757, 88, 39),
				new four(43, 756, 87, 73), new four(45, 76, 8, 83), new four(48, 74, 88, 37),

		};

		Coords<four> fourlo= new Coords<four>(fours);
		shoxyzz(fourlo);
	}
}
