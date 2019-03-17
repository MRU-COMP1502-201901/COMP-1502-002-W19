import java.util.*;

public class MainList {

	public static void main(String[] args) {
		ArrayList<Integer> list_int = new ArrayList<Integer>();
		List<Integer> list = list_int;
		Collection<Integer> collection = list;

		System.out.println("Are these pointers to the same list");
		System.out.println(list_int == list && list_int == collection);

		System.out.println("Let's do collection things");
		System.out.println(collection);
		System.out.println("Add 1");
		collection.add(1);
		System.out.println(collection);
		System.out.println("Does list contain 1");
		System.out.println(collection.contains(1));
		System.out.println("Does list contain 2");
		System.out.println(collection.contains(2));
		System.out.println(collection);
		System.out.println("Remove 1");
		collection.remove(1);
		System.out.println(collection);
		System.out.println("Add 3, 2, 1");
		collection.add(3);
		collection.add(2);
		collection.add(1);
		System.out.println(collection);
		System.out.println("Size and is empty");
		System.out.println(collection.size());
		System.out.println(collection.isEmpty());
		System.out.println("Loop through collection");
		for (Integer i : collection) {
			System.out.println(i);
		}
		System.out.println("Clear");
		collection.clear();
		System.out.println(collection);
		System.out.println("Size and is empty");
		System.out.println(collection.size());
		System.out.println(collection.isEmpty());

		System.out.println("Let's do List things");
		System.out.println(list);
		System.out.println("Add 1 at index 0");
		list.add(0, 1);
		System.out.println(list);
		System.out.println("Add 2 at index 0");
		list.add(0, 2);
		System.out.println(list);
		System.out.println("Get item at index 0");
		System.out.println(list.get(0));
		System.out.println("Get item at index 1");
		System.out.println(list.get(1));
		System.out.println(list);
		System.out.println("Remove item at index 0");
		list.remove(0);
		System.out.println(list);
		System.out.println("Remove item at index 0");
		list.remove(0);
		System.out.println(list);
		System.out.println("Add 3, 2, 1");
		collection.add(3);
		collection.add(2);
		collection.add(1);
		System.out.println(list);
		System.out.println("indexOf 1");
		System.out.println(list.indexOf(1));
		System.out.println("indexOf 2");
		System.out.println(list.indexOf(2));
		System.out.println("indexOf 3");
		System.out.println(list.indexOf(3));
		System.out.println("Loop through list");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Loop through list backwards");
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		System.out.println("sort");
		Collections.sort(list);		
		System.out.println(list);
		System.out.println("Clear");
		list.clear();
		System.out.println(list);
		System.out.println("Size and is empty");
		System.out.println(list.size());
		System.out.println(list.isEmpty());

	}

}
