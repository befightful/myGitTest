package ch02;

public class Box {
//가로=10.0 세로=5.0
	public static void main(String[] args) {
		
		double width;
		double hight;
		double area;
		double perimeter;
		width = 10.0;
		hight = 5.0;
		area = width * hight;
		perimeter = 2.0 * (width + hight);
		
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + perimeter);
	}

}
