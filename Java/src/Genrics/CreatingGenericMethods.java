package Genrics;

public class CreatingGenericMethods {

	static <T extends Comparable<T>, V extends T> boolean isIn(T x , V[] y) {
		
		for(int i=0; i<y.length;i++) 
			if(x.equals(y[i])) return true; 
		
		return false; 
	}
	
	public static void main(String[] args) {
		Integer nums[] = {1,23,2,5,48,58,6,5,5};
		if(isIn(2, nums)) {
			System.out.println("is in numbers");
		}
		String names[] = {"abc","def","ghi","jkl"};
		if(isIn("abc", names)) {
			System.out.println("is present in the array");
		}
	}
}
