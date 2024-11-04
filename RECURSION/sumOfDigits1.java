
public class sumOfDigits1 {

     static int sumKaro(int n){
        if(n>=0 && n<=9){
            return n;
        }

         int a = n%10;
         int ans = a+ sumKaro(n/10);
         return ans;
     }
    public static void main(String[] args) {
         System.out.println(sumKaro(541));
    }
}
