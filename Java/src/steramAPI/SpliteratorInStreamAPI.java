package steramAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorInStreamAPI {

	// spliterator offer alternative to iterator
	// here I am using only main function are tryAdvance() , forEachRemaining()
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("lucky");
		list.add("leo");
		list.add("linus joseph");
		list.add("joseph lucky");
		list.add("elon musk");
		list.add("mark zuckerberg");

		Stream<String> stm = list.stream();
		Spliterator<String> sptitr = stm.spliterator();
		while (sptitr.tryAdvance((n) -> System.out.println("data is    " + n)))
			;

		Spliterator<String> streamcheck = list.stream().spliterator();
		streamcheck.forEachRemaining((n) -> System.out.println(n));

		Spliterator<String> sp1 = list.spliterator();

		Spliterator<String> sp2 = list.spliterator().trySplit();

		sp1.forEachRemaining((n) -> System.out.println("not try split"+n));
		sp2.forEachRemaining((n) -> System.out.println("try split"+n));

	}

}
