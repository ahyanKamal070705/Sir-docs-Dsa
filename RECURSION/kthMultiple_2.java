public class kthMultiple_2 {

      static void multiple(int k , int n){
        if(n==0) return;
         multiple(k, n-1);
         System.out.println(k*n);
      }
    public static void main(String[] args) {
         multiple(12, 5);
    }
}
