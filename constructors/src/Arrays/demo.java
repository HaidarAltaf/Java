package Arrays;

import java.util.ArrayList;
import java.util.List;

public class demo {
	public static void main(String[] args) {
	//CAN LIST A LIST
	List<List> test = new ArrayList<>();
	List<Integer> nums = new ArrayList<>();
	List<String> string = new ArrayList<>();
	
	
	//adding to a list
	nums.add(3); 
	nums.add(9);
	nums.add(831);
	
	string.add("DOOM");
	string.add("IS");
	string.add("ETERNAL");
	
	test.add(nums);
	test.add(string);
	
	//getting from a list
	System.out.println(test);
	
	//setting index to a list
	nums.set(2,20);
	System.out.println(nums);
	
	//removing from a list
	nums.remove(2);
	System.out.println(nums);
	
	//size of list
	System.out.println(nums.size());
	
	//clearing list
	nums.clear();
	System.out.println(nums);
	
	//iterating through list (for loop)
	for(int i = 0; i < string.size(); i++) {
		System.out.println(string.get(i));
	}
	
	//iterating through list (foreach loop)
	for(String i : string) {
		System.out.println(i);
	}
	
	}
	
}
