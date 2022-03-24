
public class ArrayTest3 {
	public static void main(String args[]) {
		int s[] = new int[10];
		
		s[0] = 1;
		s[1] = 1;
		
		for(int i = 2; i<s.length; i++)
			s[i] = s[i-1] + s[i-2];
		
		for(int n=0; n<s.length; n++)
			System.out.println("s["+n+"] = "+s[n]);
	}
	
}
