import java.util.Arrays;
 
public class Main {
 
    static boolean check(int[] A, int n, int[] B, int m) {
        int[] prefB = new int[m];
        Arrays.fill(prefB, -1);
        int[] sufB = new int[m];
        Arrays.fill(sufB, -1);
 
        int i = 0, j = 0, count = 0;
 
        // First pass to populate prefB
        while (i < m && j < n) {
            if (A[j] == B[i]) {
                prefB[i] = j;
                i++;
                j++;
                count++;
            } else {
                j++;
            }
        }
 
        i = m - 1;
        j = n - 1;
 
        // Second pass to populate sufB
        while (i >= 0 && j >= 0) {
            if (A[j] == B[i]) {
                sufB[i] = j;
                i--;
                j--;
            } else {
                j--;
            }
        }

        for(int k =0;k<m;k++){
            System.out.print(sufB[k]+" ");
        }
        System.out.println();
        for(int k =0;k<m;k++){
            System.out.print(prefB[k]+" ");
        }


 
        int good = 0;
 
        // Third pass to count 'good' elements
        for (i = 0; i < m; i++) {
            int l = (i > 0) ? prefB[i - 1] : -1;  // Handling edge case
            int r = (i < m - 1) ? sufB[i + 1] : n; // Handling edge case
            if (l < r) {
                good++;
            }
        }
 
        System.out.println(good);
 
        return true; // You can change this return value as per your requirement
    }
 
    public static void main(String[] args) {
        int[] A = {1,2,8,1,5,8,8,9,10};
        int n = A.length;
        int[] B = {1,8,15,9,10};
        int m = B.length;
 
        check(A, n, B, m);
    }
}