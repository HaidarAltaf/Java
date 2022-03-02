package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {
	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("Michael", "Dean", "James", "Chris");
		List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12);
		
		//Question 1 -> Given the following List of names, using a stream, have it print "Hello " in front of each name besides "James".
		stringList.forEach(names -> {if(!(names).equals("James")) 
			System.out.println("Hello " + names);
			else System.out.println(names);});
		
		System.out.println("=================================");
		
		//Question 2 -> have it reduce and print the product
		int answer = numbers.stream().reduce((x, y) -> x * y).get();
		System.out.println(answer);
		
		System.out.println("=================================");
		
		//Question 3 -> using numbers...
		//Find the max value.
		Integer max = (numbers.stream().sorted(Comparator.reverseOrder()).reduce((x,y) -> x).get());
		System.out.println(max);
		
		//Find the min value.
		Integer min = (numbers.stream().sorted().reduce((x,y) -> x).get());
		System.out.println(min);
		
		//Remove the odd numbers.
		List<Integer> even = (numbers.stream().filter(x -> x % 2 == 0)).collect(Collectors.toList());
		System.out.println(even);
		
		//Remove the even numbers.
		List<Integer> odd = (numbers.stream().filter(x -> x % 2 == 1)).collect(Collectors.toList());
		System.out.println(odd);
		
		//Find the sum of the list.
		int sum = numbers.stream().reduce((x, y) -> x + y).get();
		System.out.println(sum);
		
		//Square every number in the list then remove the even numbers and then find the min value.
		System.out.println(numbers.stream().map(x -> x * x).filter(x -> x % 2 != 0).min((a,b) -> Integer.compare(a, b)));		
	}
}
