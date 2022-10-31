import java.util.Scanner;
import java.math.BigInteger;

class B10826 {
  public static void main(String[] args) {
    BigInteger[] dp = new BigInteger[10001];
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    dp[1] = new BigInteger("1");
    dp[0] = new BigInteger("0");

    for(int i = 2; i<=num; i++) dp[i] = dp[i-1].add(dp[i - 2]);

    System.out.println(dp[num]);
  }
}