package Genrics;
import java.util.*;

import java.time.LocalTime;

interface InterfacesGenrics<T extends Comparable<T>> {

	T min();

	T max();
}

class Myclass<T extends Comparable<T>> implements InterfacesGenrics<T> {

	List<T> values;

	public Myclass(List<T> o) {
		values = o;
	}

	@Override
	public T min() {
		T v = values.get(0);
		for (int i = 0; i < values.size(); i++)
			if (values.get(i).compareTo(v) < 0)
				v = values.get(i);

		return v;
	}

	@Override
	public T max() {
		T v = values.get(0);
		for (int i = 0; i < values.size(); i++)
			if (values.get(i).compareTo(v) > 0)
				v = values.get(i);

		return v;
	}

}

public class InterfaceGenrics {

	public static void main(String[] args) {

		List<Integer> getvaluess = Arrays.asList(28, 75, 726, 472658, 12612, 6, 423);
		Myclass<Integer> getvalues = new Myclass<>(getvaluess);
		System.out.println(getvalues.min());
		System.out.println(getvalues.max());

		List<Character> getCharVales = Arrays.asList('a', 'b', 'c', 'd');
		Myclass<Character> getChar = new Myclass<>(getCharVales);
		System.out.println(getChar.min());
		System.out.println(getChar.max());
		
		
		List<LocalTime> getlocaltime  = new ArrayList<>(); 
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());
		getlocaltime.add(LocalTime.now());

		
		Myclass<LocalTime> times = new Myclass<>(getlocaltime);
		System.out.println(times.min());
		System.out.println(times.max());


	}
}
