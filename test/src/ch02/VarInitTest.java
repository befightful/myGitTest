package ch02;

public class VarInitTest {
	public static void main(String[] args) {
		int index = 20;
		//지역변수는 반드시 초기화(갑을 할당, 저장)되어있어야한다.
		index = index + 1;
		System.out.println("index : " + index);
	}

}
