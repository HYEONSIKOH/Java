import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int year;
		System.out.print("�⵵�� �Է��ϼ���:");
		year = input.nextInt();
		
		boolean Leap = ( (year%4) == 0 );
		
		
		System.out.println(+year+"���� ������ "+Leap+" �Դϴ�.");
		
	}
}

