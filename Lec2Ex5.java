import java.util.Scanner;

public class Lec2Ex5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.print("Number of cycle:");
		num = input.nextInt();
		
		double pi = 0;
		double a = 1;
		double b = 3;
		
		for(int i =1; i<num+1; i++) {
			pi+=4/a - 4/b;
			a+=4;
			b+=4;
		}
		
		System.out.println(num+"�� �ݺ��� Gregory-Leibniz ���Ѽ����� PI ���� "+pi+" �Դϴ�.");
		System.out.print("������ �ݺ��� ���� 3.141592....�� �����մϴ�.");
		
	}

}
