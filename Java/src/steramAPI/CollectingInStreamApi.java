package steramAPI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingInStreamApi {

	public static void main(String[] args) {

		List<NamePhoneEamil> mylist = new ArrayList<>();
		mylist.add(new NamePhoneEamil("leo", "99663332252", "leo@gmail.com"));
		mylist.add(new NamePhoneEamil("leo dass", "98663332252", "leodass@gmail.com"));
		mylist.add(new NamePhoneEamil("leo mathiw", "1235 255 2", "leomathive@gmail.com"));
		mylist.add(new NamePhoneEamil("lucky", "887023698", "lucky@gmail.com"));
		mylist.add(new NamePhoneEamil("joseph lucky", "962924172", "josephleo@gmail.com"));
		mylist.add(new NamePhoneEamil("linus joseph", "5682356", "linusleo@gmail.com"));
		mylist.add(new NamePhoneEamil("lucky leo lingadharan ", "99663332252", "luckylingadharanleo@gmail.com"));

		Stream<NamePhone> namephonedata = mylist.stream().map((a) -> new NamePhone(a.getName(), a.getPhone()));
		List<NamePhone> npList = namephonedata.collect(Collectors.toList());

		
		for (NamePhone a : npList) {
			System.out.println(a.getName() + "---->" + a.getPhone());
		}

		// by using linkedlist
		Stream<NamePhone> namephonedatas = mylist.stream().map((a) -> new NamePhone(a.getName(), a.getPhone()));

		LinkedList<NamePhone> linkedlistdatas = namephonedatas.collect(() -> new LinkedList<>(),
				(lists, element) -> lists.add(element), (listA, listB) -> listA.addAll(listB));

		linkedlistdatas.forEach((a) -> System.out.println("linked list" + a.getName() + "---" + a.getPhone()));

		// by using linked list method Refrence

		Stream<NamePhone> namephoneLMR = mylist.stream().map((a) -> new NamePhone(a.getName(), a.getPhone()));

		LinkedList<NamePhone> linkedlistMR = namephoneLMR.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);

		linkedlistMR.forEach((a) -> System.out.println(a.getName() + "datass added linkedl ist" + a.getPhone()));
		// by using hashset

		Stream<NamePhone> namephonedataset = mylist.stream().map((a) -> new NamePhone(a.getName(), a.getPhone()));

		HashSet<NamePhone> npset = namephonedataset.collect(HashSet::new, HashSet::add, HashSet::addAll);

		npset.forEach((a) -> System.out.println("Hash set data" + a.getName() + "---->>" + a.getPhone()));
	}
}

class NamePhone {
	private String name;
	private String phone;

	public NamePhone(String name, String phone) {
		this.name = name;
		this.phone = phone;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

class NamePhoneEamil {
	private String name;
	private String phone;
	private String Email;

	public NamePhoneEamil(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.Email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}