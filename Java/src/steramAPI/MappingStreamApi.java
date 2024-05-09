package steramAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingStreamApi {

	// transformation of element is Map in stream for
	// example there data from database contains name, email, telephone, address
	// information might only name and email to another stream.
	// <R> Stream<R> map(Function<? super T, ? extends R> mapFunc)
	// R specifies the type of element , T is element of new stream

	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		list.add(7.0);
		list.add(9.0);
		list.add(22.23);
		list.add(890.3);
		list.add(90.3);
		Stream<Double> modifiedStream = list.stream().map((a) -> Math.sqrt(a));
		modifiedStream.forEach(System.out::println);
		// in the java.util.stream we have
		// collector
		// collectors
		// IntStream
		// DoubleStream
		// LongStream
		// StreamSupport
		// BaseStream
		// Stream

		// stream API also provides methods that support flat maps. These are flatMap(
		// ),
		// flatMapToInt( ), flatMapToLong( ), and flatMapToDouble( ). The flat map
		// methods are designed to handle situations in which each element in the
		// original
		// stream is mapped to more than one element in the resulting stream.

		IntStream cstm = list.stream().mapToInt((a) -> (int) Math.ceil(a));
		cstm.forEach((n) -> {
			System.out.println("data is" + n);
		});

	}
}
