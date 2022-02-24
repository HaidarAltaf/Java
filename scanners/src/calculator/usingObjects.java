package calculator;

public class usingObjects {
	
	public Object doSomething(Object obj) {
		return obj;
	}
	public static void main(String[] args) {
		usingObjects obj = new usingObjects();
		String str = new String();
		String newString = (String) obj.doSomething(str);
	}
}
