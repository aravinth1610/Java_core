package steramAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorsAndStreams {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(56);
		list.add(89);
		list.add(23);
		list.add(895);

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);

		Iterator<Map.Entry<String, Integer>> itrhm = hm.entrySet().iterator();
		while (itrhm.hasNext()) {
			Map.Entry<String, Integer> entry = itrhm.next();
			System.out.println(entry.getKey() + "---->" + entry.getValue());
			// hm.put("four", 4); if remove the comment it cause the concurrent execption..
		}

		// what is fail safe and fail fast in itreator ;

		// fail fail ---->
//		it doesnt copy the collection 
//		it fast 
//		it consume less memory 
//		HashMap, ArrayList, Vector, HashSet, etc	
//		It does not allow modification during iteration.	
//		It throws a ConcurrentModificationException in modifying the object during the iteration process.	

		Iterator<Integer> itrfailfail = list.iterator();
		while (itrfailfail.hasNext()) {
			System.out.println(itrfailfail.next());
		//	list.add(65); /* if remove the comment it cause the concurrent execption.. */
		}

		// fail safe ---->
//		It does not throw Exception.
//		A copy or clone object is created during the iteration process.
//		It requires more memory during the process.
//		It allows modification during the iteration process.
//		It is slightly slower than Fail Fast.
//		CopyOnWriteArrayList, ConcurrentHashMap, etc.

//		for array we use copyonwriteArraylist 

		CopyOnWriteArrayList<Integer> data = new CopyOnWriteArrayList<>();
		data.addAll(list);

		Iterator<Integer> itrca = data.iterator();
		while (itrca.hasNext()) {
			System.out.println(itrca.next());
			data.add(123555);
		}

		// for map and hashmap use the fail safe ...

		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();
		chm.putAll(hm);

		Iterator<Map.Entry<String, Integer>> chmitr = chm.entrySet().iterator();

		while (chmitr.hasNext()) {
			Map.Entry<String, Integer> entry = chmitr.next();
			System.out.println(entry.getKey() + "value is " + entry.getValue());
			hm.put("hello ", 123);
		}

	}
}
