package Genrics;

import java.lang.Number;

// herein using the typecasting .. it is not recommanded
class Stats<T> {
	T[] nums;

	public Stats(T[] obj) {
		this.nums = obj;
	}

	public T[] getNums() {
		return nums;
	}

	public void setNums(T[] nums) {
		this.nums = nums;
	}

	public double avarage() {
		long start = System.currentTimeMillis();
		double sum = 0.0;

		for (int i = 0; i < nums.length; i++) {
			System.out.println(((Number) nums[i]).doubleValue());
			sum += ((Number) nums[i]).doubleValue();
		}
		System.out.println("time taken to run the function" + (System.currentTimeMillis() - start));
		return sum / nums.length;
	}

}

// it is recommanded ... 
class BoundedGen<T extends Number> {
	T[] obj;

	public BoundedGen(T[] obj) {
		this.obj = obj;
	}

	public T[] getObj() {
		return obj;
	}

	public void setObj(T[] obj) {
		this.obj = obj;
	}

	public double data() {
		long start = System.currentTimeMillis();
		double sum = 0.0;

		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].doubleValue());
			sum += obj[i].doubleValue();
		}
		System.out.println("time taken to run the Bounded Indexxx " + (System.currentTimeMillis() - start));
		return sum / obj.length;
	}
}

public class BoundedType {
	// Wanna see real time use and use in another class ... 
	public static void main(String[] args) {
		Integer[] datas = { 12, 57, 63, 4, 15, 51, 454, 4, 4544 };
		Stats<Integer> datasss = new Stats(datas);
		System.out.println(datasss.avarage());

	}
}
