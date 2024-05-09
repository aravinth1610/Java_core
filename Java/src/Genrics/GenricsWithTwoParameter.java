package Genrics;

class Gens<T, V> {

	T objT;
	V objV;

	public Gens(T objT, V objV) {
		this.objT = objT;
		this.objV = objV;
	}

	public T getObjT() {
		return objT;
	}

	public void setObjT(T objT) {
		this.objT = objT;
	}

	public V getObjV() {
		return objV;
	}

	public void setObjV(V objV) {
		this.objV = objV;
	}
	void showData() {
		System.out.println(objT.getClass().getName());
		System.out.println(objV.getClass().getName());

	}
}

public class GenricsWithTwoParameter {

	public static void main(String[] args) {
		Gens<Integer, String> data = new Gens<Integer, String>(10, "F--- it oof");
		System.out.println(data.getObjV());
		data.showData();
	}
}
