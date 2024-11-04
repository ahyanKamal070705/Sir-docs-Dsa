import java.util.*;

import java.util.HashMap;

// FIND THE MOST FREQUENT ELEMENT
public class q1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1, 1, 4, 5, 1, 2,5,5,5,5,5,5,5 };
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                int x = mp.get(arr[i]);
                x++;
                mp.put(arr[i], x);
            } else {
                mp.put(arr[i], 1);
            }
        }

        for (var key : mp.keySet()) {
            System.out.printf("the key is %d the count is %d \n", key, mp.get(key));
        }

        int max = 0;
        int ans =-1;
        for (int key : mp.keySet()) {
            int x = mp.get(key);
            if (x > max) {
                max = x;
                ans=key;
            }
        }

        System.out.print(ans);
    }
}
