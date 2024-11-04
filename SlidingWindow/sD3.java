// import java.util.*;
// public class sD3 {
//     public static void main(String[] args) {
//         String str = "0505050";
//         int k =2;

//         HashMap<Integer,Integer> map = new HashMap<>();
//         map.put(0,1);
//         int count =0;
//         int sum=0;
//         for(int i =0;i<str.length();i++){
//              if(str.charAt(i)=='5'){
//                 count++;
//              }
//               //agr map mein vo value nahi hai jo minus krke aaya haii toh sum mein 0 add  kr do
//              sum+=map.getOrDefault(count-k,0);
//              map.put(count,map.getOrDefault(count,0)+1);
//         }

//         System.out.println(sum);
//     }
// }

//MEESHO OA BRUTE FORCE 
import java.util.*;

public class sD3 {
    public static void main(String[] args) {
        String str = "0505050";
        int k = 2;

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
             for(int j =i;j<str.length();j++){
                
             }

        }

        System.out.println(sum);
    }
}
