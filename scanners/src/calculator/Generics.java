package calculator;

public class Generics<T> {
	public T doSomething(T object) {
		return object;
	}
	public static void main(String[] args) {
		Generics <String> g = new Generics<String>();
		String str = new String();
		String newString = g.doSomething(str);
	}
	
}
