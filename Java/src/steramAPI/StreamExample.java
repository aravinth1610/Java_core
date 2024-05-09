package steramAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> datas = new ArrayList<>();
		datas.add(7);
		datas.add(18);
		datas.add(10);
		datas.add(24);
		datas.add(17);
		datas.add(5);
		datas.add(89);
		datas.add(75);

		Stream<Integer> mystream = datas.stream();

		Optional<Integer> minVal = mystream.min(Integer::compare);
		if (minVal.isPresent())
			System.out.println("min value is " + minVal.get());
		
		Stream<Integer> mystreammax = datas.stream();

		//mystream = datas.stream();
		Optional<Integer> max = mystreammax.max(Integer::compare);
		if (max.isPresent())
			System.out.println("max value is " + max.get());

	}
}
