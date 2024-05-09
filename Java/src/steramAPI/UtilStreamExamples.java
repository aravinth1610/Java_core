package steramAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UtilStreamExamples {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(1);
		list.add(124);
		list.add(125);
		list.add(125);
		list.add(125);
		list.add(123);
		list.add(1224);

//	 here min and max use the comparator ... n and m compare
//	 itself and return the min and max value.
		int min = list.stream().min((n, m) -> n > m ? 1 : -1).get();
		System.out.println(min);
		int max = list.stream().min((n, m) -> n < m ? 1 : -1).get();
		System.out.println(max);

//		Stream generate is used to generate the value 

		long start = System.currentTimeMillis();
		Stream<String> streamData = Stream.generate(() -> "element").limit(100);
		streamData.forEach(System.out::println);
		System.out.println("end time " + (System.currentTimeMillis() - start));

//		Stream itreate method
		Stream<Integer> intData = Stream.iterate(20, n -> n + 2).limit(21);
		intData.forEach(System.out::println);

	}
}
