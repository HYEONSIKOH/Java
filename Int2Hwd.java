import java.util.Scanner;

public class Int2Hwd {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int s;
		s = input.nextInt();
		
		switch(s) 
		{
		case 0:
			System.out.print("����");
			break;
			
		case 1 :
			System.out.print("�ϳ�");
			break;
			
		case 2 :
			System.out.print("��");
			break;
			
		case 3:
			System.out.print("��");
			break;
			
		default :
			System.out.print("�ٽ� �Է����ּ���");
			break;
		}
		
		}
}
