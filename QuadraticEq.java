import java.util.Scanner;

public class QuadraticEq {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		float b;
		float c;
		
		System.out.print("b�� c�� �Է��ϼ���:");
		b = input.nextFloat();
		c = input.nextFloat();
		
		Float fRoots_first = (float)((-b+Math.sqrt(b*b-4*c))/2);
		Float fRoots_second = (float)((-b-Math.sqrt(b*b-4*c))/2);
		
		System.out.print("ù���� ���� "+fRoots_first+" �ι�° ���� "+fRoots_second+" �Դϴ�.");
	}

}
