import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int year;
		System.out.print("년도를 입력하세요:");
		year = input.nextInt();
		
		boolean Leap = ( (year%4) == 0 );
		
		
		System.out.println(+year+"도는 윤년이 "+Leap+" 입니다.");
		
	}
}

