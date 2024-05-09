package Genrics;

// Generic class 
class Gen<T> { // T - type , It accept the any wapper class or class here 
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	// constructor helps to pas the data to the object 
	public Gen(T obj) {
		this.obj = obj;
	}

	// this method shows t which type of class or which wapper class T passed.
	void showData() {
		System.out.println(obj.getClass().getName()); 
	}
}

public class SimpleGenrics {

	public static void main(String[] args) {

		// In the diamond bracket pass the wapper class or any other pre defined 
		// class and in the gen constructor passing the data to reduce the run 
		// time exeption 
		Gen<Integer> data = new Gen(10);
		data.showData();
	}
}
