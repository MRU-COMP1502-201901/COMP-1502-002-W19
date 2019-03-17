import java.util.HashMap;
import java.util.Map;

public class MainMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		Map<String, Integer> map = hashmap;

		System.out.println("Are these pointers to the same map");
		System.out.println(map == hashmap);

		System.out.println("Let's do map things");
		System.out.println(map);
		System.out.println("Put 1 at \"Jonathan\"");
		map.put("Jonathan", 1);
		System.out.println(map);
		System.out.println("Put 1 at \"Hudson\"");
		map.put("Hudson", 1);
		System.out.println(map);
		System.out.println("Map size");
		System.out.println(map.size());
		System.out.println("Update value at \"Jonathan\" to one more using get");
		int value = map.get("Jonathan");
		map.put("Jonathan", value + 1);
		System.out.println(map);
		System.out.println("Update value at \"Jonathan\" to one more using get");
		value = map.get("Jonathan");
		map.put("Jonathan", value + 1);
		System.out.println(map);
		System.out.println("Loop through keys");
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println("Loop through values");
		for (Integer value1 : map.values()) {
			System.out.println(value1);
		}
		System.out.println("Loop through keys and get value");
		for (String key : map.keySet()) {
			System.out.println(key + " stores " + map.get(key));
		}
		System.out.println("Remove key Hudson");
		map.remove("Hudson");
		System.out.println(map);
		System.out.println("Clear map");
		map.clear();
		System.out.println(map);
		System.out.println("Is Empty");
		System.out.println(map.isEmpty());
	}

}
