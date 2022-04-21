package MID_TEST;

import java.util.*;

public class midterm01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 가로를 입력하시오: ");
		float a = sc.nextInt();
		System.out.print("사각형의 세로를 입력하시오: ");
		float b = sc.nextInt();
		
		System.out.println("사각형의 넓이는 "+a*b+"입니다");
		System.out.println("사각형의 둘레는 "+2*(a+b)+"입니다.");
	}
}
