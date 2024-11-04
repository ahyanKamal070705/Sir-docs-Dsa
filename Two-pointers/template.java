import java.util.HashMap;
import java.util.*;

public class template {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4 };
        int k = 2;

        HashMap<Integer, Integer> mp = new HashMap<>();

        int i = 0;
        int j = 0;
        int count = 0;

        while (j < arr.length) {

            mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);

            int size = mp.size();

            while (size > k) {
                mp.put(arr[i], mp.get(arr[i]) - 1);

                if (mp.get(arr[i]) == 0) {
                    mp.remove(arr[i]);
                }

                i++;
                size = mp.size();

            }
            count += (j - i) + 1;
            j++;

        }

        System.out.println(count);

    }
}
