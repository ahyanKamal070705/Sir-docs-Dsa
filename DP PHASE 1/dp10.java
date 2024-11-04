import java.util.Scanner;
public class dp10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        int x = sc.nextInt();
        int z = sc.nextInt();
        int b = sc.nextInt();

        int dp[] = new int[n + 1];

        dp[1] = 0;

        for (int i = 2; i < dp.length; i++) {
            int v1 = dp[i - 1] + y;

            int v2 = i % 7 == 0 ? dp[i / 7] + y : Integer.MAX_VALUE;
            int v3 = i % 5 == 0 ? dp[i / 5] + z : Integer.MAX_VALUE;
            int v4 = i % 3 == 0 ? dp[i / 3] + b : Integer.MAX_VALUE;
           
            dp[i]= Math.min(v1,Math.min (v2,Math.min(v3, v4)));
            
        }
        System.out.println(dp[n]);
    }
}
