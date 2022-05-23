package ch02;

public class HelloExam {//클래스의 이름은 반드시 대문자로 시작, 메소드의 이름은 반드시 소문자로시작, 변수이름도 소문자로 시작
	//int 는 리턴타입
	public static int sum(int n,int m) {
		return n + m; //return은 결과값을 호출한 쪽으로 반환한다.
	}
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i,10);//매개변수는 데이터 타입과 선언한 갯수을 맞춰주어야한다.
		a = '?';//단문자는 작은 따옴표
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		
	}

}
