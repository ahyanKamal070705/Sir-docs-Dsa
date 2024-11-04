public class LinearSearch_5 {

      static boolean linearSearching(int arr[],int i,int x){
        //  base case woh hoga agr kuch na mile aur end index tak pohuch jaye
          if(i==arr.length) return false;

            if(arr[i]==x) return true;

            return linearSearching(arr, i+1, x);
         
            
      }
    public static void main(String[] args) {
         int arr []= {1,2,5,7,6,4,2,4,7};
          System.out.println(  linearSearching(arr, 0,25));
    }
}
