import java.util.*;
public class sdAmazonOAQ_21 {
    public static void main(String[] args) {
        String str ="abdadccacd";
        String ptr = "edac";

        HashMap <Character , Integer > map = new HashMap<>();

        for(int i = 0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        
        int i =0;
        int count =0;
        int ans =0;
        while(true){
            char x = ptr.charAt(i);
            if(map.containsKey(x)==false) break;
            if(map.get(x)==0){
             break;
            }
            else {
               map.put(x,map.get(x)-1);
               count++;
               i++;
            }
            if(count==ptr.length()){
                count =0;
                ans++;
                i=0;
            }
             

        }

        System.out.println(ans);

    }
}
