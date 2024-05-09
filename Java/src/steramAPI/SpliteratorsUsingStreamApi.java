package steramAPI;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class SpliteratorsUsingStreamApi {

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		for (int i = 2; i <= 50000; i++) {
			Random ran = new Random();
			data.add(ran.nextInt(i));
		}

		long start = System.currentTimeMillis();
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		System.out.println("time for loop" + (System.currentTimeMillis() - start));

		long streamStart = System.currentTimeMillis();
		data.stream().forEach((datas) -> System.out.println(datas));
		System.out.println("time for stream" + (System.currentTimeMillis() - streamStart));

	}
}
