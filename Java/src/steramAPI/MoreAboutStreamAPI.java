package steramAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MoreAboutStreamAPI {
	public static void main(String[] args) {

		// anymatch , allmatch , noneMatch , of , count ;
		// filter , flatmap , findfirst , peek 
		// portion -> protionby , grouping , infintestream -> iterate , generate
		List<Integer> disct = Arrays.asList(1, 2, 2, 33, 33, 44, 5, 8, 5, 2);
		Stream<Integer> dats = disct.stream().distinct();
		Long count = dats.count();
//		dats.forEach(System.out::println);
		System.out.println(count);

		Stream<String> data = Stream.of("hello how are you ");
		data.forEach(System.out::println);
	}
}
