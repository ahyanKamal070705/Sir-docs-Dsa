public class OddEvensereis_3 {

    static int sumOfSereis(int n){
        if(n==0){
            return 0;
        }
       int ans;
       if(n%2==0){
         ans = sumOfSereis(n-1)-n;
         
       }
       else{
        ans = sumOfSereis(n-1)+n;
       }

       return ans;
    }
  public static void main(String[] args) {
    System.out.println( sumOfSereis(4));
  }
}
