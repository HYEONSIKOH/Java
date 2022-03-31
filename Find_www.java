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
			System.out.print("종료합니다.");	
		}
		
		else if(num == 0) {
			System.out.print(Address+"은 www로 시작합니다.");
		}
			
		
		else {
			System.out.print(Address+"은 www로 시작하지 않습니다.");
			
		}
			
		
		
	}
}
