import java.util.Scanner;

public class dp12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int dp[][] = new int[n + 1][3];

        // dp[1][2] = forward dp[1][1]= backward
        
        dp[1][2] = arr[1];
        dp[1][1] = Integer.MAX_VALUE;

        dp[2][2]=  arr[1];
        dp[2][1] = dp[1][2]+arr[2]+arr[3];
        
        int i = 3;
        //1 based indexing haii last ka ek element phle tak traverse hoga
        for( i= 3;i<n;i++){
            //
           dp[i][2]= Math.min( dp[i-2][2]+arr[i], dp[i-2][1]+arr[i]);

           // only one way to calculate it
           dp[i][1]= dp[i-1][2]+arr[i]+arr[i+1];

           System.out.println(dp[i][2] + " " + dp[i][1]);
             
        }
        //ek index phle tak stop
        //  System.out.println(i);
        dp[i][2]=  Math.min( dp[i-2][2]+arr[i], dp[i-2][1]+arr[i]);

        //last index ka aage koi element hi nai hai 
        dp[i][1] = Integer.MAX_VALUE;

        System.out.println(Math.min(dp[n][2],Math.min(dp[n-1][2],dp[n-1][1])));


    }
}