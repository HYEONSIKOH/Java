//문제 3
public class Lec3Ex3 {

	public static void main(String args[]) {
		
		int count = 0; // 약수의 수
		
		for(int i=1; i<1001; i++) {
			for(int a=1; a<1001; a++) {
				if(i%a==0) // 약수의 수만큼 카운트가 증가한다.
					count++;
				
				if (count > 3) // 만약 약수의 수가 3개 이상이면 계산 불필요하기 
					break;  // 떄문에 for문을 종료한다.
			}
			if(count == 2) // 약수의 수가 2개이면 출력한다.
				System.out.print(i+" ");
			
			count = 0;
		}
	}
}
