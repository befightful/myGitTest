package ch02;

public class Interpret {

	public static void main(String[] args) {
		int a;
		int b;
		int tot;
		
		a = 1;
		b = 2;
		tot = a + b;//반드시 지역변수는 초기화가 되어야만 계산이된다
		//순차적 인터프리트 방식이기 때문에 이런현상이 나타난다.
		System.out.println(tot);
	}

}
