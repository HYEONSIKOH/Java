import java.util.Scanner;

public class Lec3Ex2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("���� ������ �Է��ϼ���:");
		num = input.nextInt();
		
		System.out.println(num+"�� ����� ������ �����ϴ�.");
		for(int i=0; i<num+1; i++)
			if(num%i==0)
				System.out.print(i+" ");

	}

}
