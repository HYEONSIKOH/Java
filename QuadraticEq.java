import java.util.Scanner;

public class QuadraticEq {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		float b;
		float c;
		
		System.out.print("b와 c를 입력하세요:");
		b = input.nextFloat();
		c = input.nextFloat();
		
		Float fRoots_first = (float)((-b+Math.sqrt(b*b-4*c))/2);
		Float fRoots_second = (float)((-b-Math.sqrt(b*b-4*c))/2);
		
		System.out.print("첫번쨰 근은 "+fRoots_first+" 두번째 근은 "+fRoots_second+" 입니다.");
	}

}
