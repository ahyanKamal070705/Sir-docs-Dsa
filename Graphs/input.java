import java.util.*;
public class input {
    public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Nodes");
        int n = sc.nextInt();
        System.out.println("Enter edges");
        int m =sc.nextInt();
        
        // create an array of arraylist
        ArrayList<Integer>[] g = new ArrayList[n+1];
        
        //initialise array list
         for(int i =1;i<=n;i++){
           g[i]= new ArrayList<>();
         }

         for(int i =1;i<=m;i++){
            int x =sc.nextInt();
            int y =sc.nextInt();

            g[x].add(y);
            g[y].add(x);
         }




    }
}
