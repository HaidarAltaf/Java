package hashSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();

		//adding to hash set
		hashSet.add("r");
		hashSet.add("egh");
		hashSet.add("eah");
		hashSet.add("etrahhae");
		hashSet.add("aethki");
		hashSet.add("r");	//this will overwrite the previous string with the same value
		hashSet.add("64ursyj");
	
		for (String i : hashSet) {
			System.out.println(i);
		}
		
		//isEmpty and size
		System.out.println(hashSet.isEmpty());
		System.out.println(hashSet.size());
		
		//remove
//		hashSet.remove("egh"); //removes single
		
		//clear
//		hashSet.clear(); // remove all
		
		//contains
		System.out.println(hashSet.contains("e"));
		
		///iterator
		Iterator<String> setIterator = hashSet.iterator();
		while(setIterator.hasNext() ) {
			String s = setIterator.next();
				if(s.equals("etrahhae")) {
					setIterator.remove();
			}
		}
		System.out.println(hashSet);
		
		
		
		
	}
}
