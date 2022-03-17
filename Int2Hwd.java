import java.util.Scanner;

public class Int2Hwd {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int s;
		s = input.nextInt();
		
		switch(s) 
		{
		case 0:
			System.out.print("없음");
			break;
			
		case 1 :
			System.out.print("하나");
			break;
			
		case 2 :
			System.out.print("둘");
			break;
			
		case 3:
			System.out.print("셋");
			break;
			
		default :
			System.out.print("다시 입력해주세요");
			break;
		}
		
		}
}
