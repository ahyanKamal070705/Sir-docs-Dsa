public class maxInArray_4{
      
    static int sumOfAll(int arr[], int idx){
        if(idx==arr.length-1){
           return arr[idx];
        }
         int recursiveAns = sumOfAll(arr, idx+1);
         return  recursiveAns+ arr[idx];

      }
     
      
    static int findMax(int arr[], int idx){
      if(idx==arr.length-1){
         return arr[idx];
      }
       int recursiveAns = findMax(arr, idx+1);
       return Math.max(arr[idx], recursiveAns);

       
    }
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6,7,8,9,10};
      System.out.println(  sumOfAll(arr, 0));
       System.out.println( findMax(arr, 0));
    }
}