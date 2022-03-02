package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {
		
	
	List<String> stringList = new ArrayList<>();
	
	stringList.add("Hello");
	stringList.add("Asalaamalaikum");
	stringList.add("Hola");
	stringList.add("Bonjour");
	stringList.add("Konnichiwa");
	stringList.add("Guten tag");
	stringList.add("Ciao");
	
	stringList.forEach(greetings -> System.out.println(greetings));
	
	//logic in list 
	stringList.forEach(greetings -> {if(!greetings.equalsIgnoreCase("Hello")) System.out.println(greetings);});
	
	
	
	
	}
}