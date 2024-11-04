import java.util.Scanner;

public class DP9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];

        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }

        int dp[][] = new int[n+1][3];

        if (arr[1] % 2 == 0) {
            // even ka count
            dp[1][2] = 1;
        } else {
            // odd ka count
            dp[1][1] = 0;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // if the index is even

                dp[i][2] = dp[i - 1][2] + dp[i - 2][2];
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
            } else {
                // if the index is odd
                dp[i][2] = dp[i - 1][1] + dp[i - 2][1];

                dp[i][1] = dp[i - 1][2] + dp[i - 2][2];

            }
        }

        System.out.println(dp[n][1] + " " + dp[n][2]);

    }
}
