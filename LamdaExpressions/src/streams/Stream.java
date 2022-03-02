package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		//basic stream
//		List<Integer> number = new ArrayList<>();
//		Stream<Integer> numStream = number.stream();
		
		//list with data
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		numbers.stream()
//			.forEach(x -> System.out.println(x * 7));
		
		//map method
		List<Integer> mapNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> CubedNums = (List<Integer>) mapNumbers.stream()
				.map(x -> x * x * x)
				.collect(Collectors.toList());
		System.out.println(CubedNums);
		List<Integer> MathsExpressions = (List<Integer>) mapNumbers.stream()
				.map(x -> 4*x + 14)
				.collect(Collectors.toList());
		System.out.println(MathsExpressions);
		
		//filter method
		List<String> stringList = new ArrayList<>();
		
		stringList.add("Hello");
		stringList.add("Asalaamalaikum");
		stringList.add("Hola");
		stringList.add("Bonjour");
		stringList.add("Konnichiwa");
		stringList.add("Guten tag");
		stringList.add("Ciao");
		
		List<String> greetings = stringList.stream()
				.filter(s -> s.contains("a")).collect(Collectors.toList());
		System.out.println(greetings);
		
		//sorted method - numbers
		List<Integer> unordered = Arrays.asList(5,98,5,2,26,8,48,2,4,584);
		List<Integer> order = unordered.stream().sorted().collect(Collectors.toList());
		System.out.println(order);
		//String
		List<String> animals = Arrays.asList("Lion", "Tiger", "Shark", "Whale", "Snake", "Bear", "Crocodile", "Wolf");
		List<String> animalsOrdered = animals.stream().sorted().collect(Collectors.toList());
		List<String> animalsReverseOrdered = animals.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(animalsOrdered);
		System.out.println(animalsReverseOrdered);
		
		//reduce method
		List<Integer> reduced = Arrays.asList(5,98,5,2,26,8,48,2,4,584);
		int answer = reduced.stream().reduce((x, y) -> x * y).get();
		System.out.println(answer);
		
		List<Integer> Final = Arrays.asList(4,5,54,658,4,684,6,4,5,4631465,648,5);
		int ans = Final.stream().map(x -> x + x).reduce((x,y) -> x + y).get();
		System.out.println(ans);
		
	}

}
