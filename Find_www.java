import java.util.Scanner;

public class Find_www {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String Address = input.nextLine();
		String s = "www";
		String n = "quit";
		int num = s.compareTo(Address.substring(0,3));
		int a = n.compareTo(Address);	
		if(a==0) {
			System.out.print("�����մϴ�.");	
		}
		
		else if(num == 0) {
			System.out.print(Address+"�� www�� �����մϴ�.");
		}
			
		
		else {
			System.out.print(Address+"�� www�� �������� �ʽ��ϴ�.");
			
		}
			
		
		
	}
}
