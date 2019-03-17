import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		HashSet<Integer> hashset_int = new HashSet<Integer>();
		Set<Integer> set = hashset_int;
		Collection<Integer> collection = set;

		System.out.println("Are these pointers to the same set");
		System.out.println(hashset_int == set && hashset_int == collection);

		System.out.println("Let's do set things");
		System.out.println(set);
		System.out.println("Add 1");
		set.add(1);
		System.out.println(set);
		System.out.println("Add 2");
		set.add(2);
		System.out.println(set);
		System.out.println("Add 1 again");
		set.add(1);
		System.out.println(set);
		System.out.println("Add 2 again");
		set.add(2);
		System.out.println(set);
	}

}
