package ch02;

public class NameUnicode {

	public static void main(String[] args) {
		char one = '\uAE40';
		char two = '\uD658';
		char three = '\uC9C4';
		
		System.out.println(one + " " + two + " " + three);
		System.out.println("char형(\'\uAE40\') : " + one);
		System.out.println("char형(\'\uD658\') : " + two);
		System.out.println("char형(\'\uC9C4\') : " + three);
	}

}
