package CompareIt;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int result = p1.getName().compareTo(p2.getName());
		if(result != 0) {
			return result;
		}
		if (p1.getId() < p2.getId()) {
			return -1;
		}
		if (p1.getId() > p2.getId()) {
			return 1;
		}
		return 0;
	}

}
