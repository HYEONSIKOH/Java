//���� 3
public class Lec3Ex3 {

	public static void main(String args[]) {
		
		int count = 0; // ����� ��
		
		for(int i=1; i<1001; i++) {
			for(int a=1; a<1001; a++) {
				if(i%a==0) // ����� ����ŭ ī��Ʈ�� �����Ѵ�.
					count++;
				
				if (count > 3) // ���� ����� ���� 3�� �̻��̸� ��� ���ʿ��ϱ� 
					break;  // ������ for���� �����Ѵ�.
			}
			if(count == 2) // ����� ���� 2���̸� ����Ѵ�.
				System.out.print(i+" ");
			
			count = 0;
		}
	}
}
