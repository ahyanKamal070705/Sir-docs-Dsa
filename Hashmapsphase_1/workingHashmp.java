import java.util.*;

public class workingHashmp {
    public static void main(String[] args) {

        Map<String, Integer> mp = new HashMap<>();

        // 1. add elements
        mp.put("Ahyan", 21);
        mp.put("Yash", 16);
        mp.put("lav", 27);
        mp.put("rishika", 100);

        // 2. getting value of key from hashmap
        System.out.println(mp.get("Ahyan")); // 21
        System.out.println(mp.get("thor")); // null if doesnt exist

        // 3. updating the value of key
        mp.put("Ahyan", 202); // Ahyan value will be overridden
        // System.out.println(mp);

        // 4. removing pair from the hashmap

        // if exist it remove it and print the value of key
        int x = mp.remove("lav");
        System.out.println(x);

        // if doesnot exist return null
        mp.remove("captain");

        // 5. CHECK IF THE KEY EXIST IN THE MAP
        System.out.println(mp.containsKey("ahyan"));
        System.out.println(mp.containsKey("captain america"));

        // 6. PUT ONLY IF DOESNT EXIST
        mp.putIfAbsent("striver", 1000); // will enter

        // 7. GETTING ALL THE KEY
        System.out.println(mp.keySet());

        // 8. GETTING ALL THE VALUES
        System.out.println(mp.values());

        // 9. GET ALL THE ENTRIES
        System.out.println(mp.entrySet());

        //10. TRAVERSING IN ALL THE ENTRIES
        
         
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }


    }
}
