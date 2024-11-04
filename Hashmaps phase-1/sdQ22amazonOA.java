import java.util.*;

public class sdQ22amazonOA {
    public static void main(String[] args) {
        int arr[] = { 2,2,2,2,1,1,1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int freq, div, rem;
        int count = 0;

        for (var key : map.keySet()) {
            freq = map.get(key);
            if (freq == 1) {
                System.out.println("-1");
                break;
            } else if (freq == 2) {
                count++;
            } else {
                if (freq % 3 == 0) {
                    count += freq / 3;
                } else {
                    div = freq / 3;
                    rem = freq % 3;
                    if (rem == 1) {
                        count += (div - 1) + 2;
                    } else {
                        count += div + 1;
                    }
                }
            }
        } System.out.println(count);
    }
}
