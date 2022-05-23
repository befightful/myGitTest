package ch02;

public class CharEx {
	//유니코드
	public static void main(String[] args) {
		char aValue = '\u0041';
		System.out.println("char형('\u0041'): " + aValue);
		char bValue = '\u0041';
		System.out.println("char형('\\u0041\'): " + aValue);
		//유니코드를 그대로 표현하고 싶다면 역슬레시로 묶어준다

	}

}
