package ch02;

import java.util.Scanner;
//ctrl shift o 키를 누르면 위처럼 임포트된다

public class ScannerEx {

	public static void main(String[] args) {
		//키보드로부터 사용자 입력 프로그램
		Scanner in = new Scanner(System.in);//스캐너 캑체 키보드로부터 값을 입력 받게 해주는 객체
		System.out.println("첫번쨰 정수값?");
		int x = in.nextInt();//정수값을 입력 받도록하는 메소드인 nextInt()
		System.out.println("두번쨰 정수값?");
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.\n", x, y, x * y);
	}

}
