package steramAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReductionStreamApis {
// mainly reduce is used to arithmetic operations 
//	It is important to understand that the accumulator operation must satisfy
//	three constraints. It must be
//	• Stateless
//	• Non-interfering
//	• Associative

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		// two ways we can achive the reduce opration one is by optional
		Optional<Integer> optionalVal = list.stream().reduce((a, b) -> a * b);
		if (optionalVal.isPresent())
			System.out.println("value is " + optionalVal.get());
		// another way is by passing 2 parameter in the reduce function
		// if change the first argument it multiple the product result
		int product = list.stream().reduce(3, (a, b) -> a * b);
		System.out.println("value is " + product);

		int sum = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		// we can also write even product also parallel stream gives the wrong result
		// check that ...

		int evenproduct = list.stream().reduce(1, (a, b) -> {
			if (b % 2 == 0) {
				return a * b;
			} else {
				return a;
			}
		});

		int evenproducts = list.parallelStream().reduce(1, (a, b) -> {
			if (b % 2 == 0)
				return a * b;
			else
				return a;
		});
		System.out.println("normal stream " + evenproduct + "is steram product" + evenproducts);
		// int the below operation first perform the 2 peramert and then perform the
		// result of 3 rd permeter ..
		double accumulator = list.stream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
		System.out.println(accumulator);

		Stream<Integer> data = list.stream();
		data.sequential().forEach(System.out::println);
		System.out.println("=====================================");
		Stream<Integer> datas = list.parallelStream();
		//datas.forEach(System.out::println);
		// it also print sequential order...
	//	datas.sequential().forEach(System.out::println);
		datas.forEachOrdered(System.out::println);

	}
}
