import java.util.*;

public class sD9 {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 1, 7, 4, 0, 8 };
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int n = arr.length;
        int ans = 0;
        int sum = 0;

        while (j < n) {
            // j put hoga
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            sum += arr[j];
            if (j - i + 1 == k) {

                if (map.size() == k) {
                    ans = Math.max(ans, sum);
                }

                sum -= arr[i];
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;

            }
            j++;
        }
        System.out.println(ans);

    }
}