import java.util.Scanner;

public class DaysInMonth {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("month�� �Է��ϼ���:"); 
		int month;
		month = input.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.print("31�� �Դϴ�.");
			break;
			
		case 2:
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print("31�� �Դϴ�.");
			break;
			
		default:
			System.out.print("1~12 �̳��� �Է����ּ���.");
			break;
		}
		
	}
}
