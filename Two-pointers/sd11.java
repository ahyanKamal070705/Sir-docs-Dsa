// public class sd11 {

//     public static void main(String[] args) {
//         int arr [] ={1,2,1,0,1,1,0};
//         int k = 4;
//           int sum =0;
//           int ans = Integer.MIN_VALUE;
//          for(int i =0 , j= 0;j<arr.length;j++){
//             sum+=arr[j];

//            if(sum<=k){
//             ans = Math.max(j-i+1,ans);
//            }else{
//             //shrink window tab-tak when sum greater  than k
//             while(sum>k && i<=j){
//                 sum-=arr[i];
//                 i++;
//               }
//            }
             

//          }
//          System.out.println(ans);
//     }
    
// }

// NUMBER OF SUB-ARRAY WHOSE SUM IS LESS THAN EQUAL TO K

public class sd11 {

    public static void main(String[] args) {
        int arr [] ={1,2,1,0,1,1,0};
        int k = 2;
          int sum =0;
          int ans = 0;;
         for(int i =0 , j= 0;j<arr.length;j++){
            sum+=arr[j];

           
   /////           //shrink window tab-tak when sum greater  than k
                 // dono mein se ek conidtion false loop break;
            while(sum>k && i<=j){
                sum-=arr[i];
                i++;
              }

              //if we will not calculate in the end then j++ ho jayega usse shrink krke jo aaya hai miss ho jayega
           
              ans+=(j-i+1);
             

         }
         System.out.println(ans);
    }
    
}



