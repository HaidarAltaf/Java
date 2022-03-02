package HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaps {
	public static void main(String[] args) {
		Map<String, String> worldFoods = new HashMap<>();

		// add - must have unique key or only prints last value, values can be
		// duplicated.
//		worldFoods.put("key", "value");
		worldFoods.put("Italy", "Pizza");
		worldFoods.put("Japan", "Ramen");
		worldFoods.put("Germany", "Beer");
		worldFoods.put("China", "Thousand year egg");
		worldFoods.put("America", "Diabetes");

		System.out.println(worldFoods.get("Italy")); // will print because its a key
		System.out.println(worldFoods.get("Pizza")); // returns null because its not the key

		// just so it looks better
		System.out.println("\n================================");

		// remove, clear, size
//		System.out.println(worldFoods.size());
//		worldFoods.remove("Germany"); //removes single
//		worldFoods.clear(); // remove all

		// printing keyset
		for (String i : worldFoods.keySet()) {
			System.out.println(i);
		}

		System.out.println("\n================================");

		// printing values
		for (String i : worldFoods.values()) {
			System.out.println(i);
		}

		System.out.println("\n================================");

		// printing the entryset
		for (Entry<String, String> i : worldFoods.entrySet()) {
			System.out.println(i);
		}
		System.out.println("\n================================");

		System.out.println(worldFoods);
	}
}
