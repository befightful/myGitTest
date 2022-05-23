package ch02;

import java.util.Scanner;

public class RectangelTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int h, w;
		double area;
		
		System.out.println("직사각형의 가로 길이를 입력하세요 : ");
		w = in.nextInt();
		System.out.println("직사각형의 세로 길이를 입력하세요");
		h = in.nextInt();
		area = w * h;
		System.out.println("직사각형의 넓이는 " + area + "입니다.");
		
	}

}
