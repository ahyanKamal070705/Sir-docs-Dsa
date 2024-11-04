// public class sd17_googleOA {
//     public static void main(String[] args) {
//         int arr[] = {2,3,5,5,8,5,6,5,6,7,8};
//         int g =5;
//         int k =2;
//         int count =0;
//         int ans = -1;
//         for(int i =0 ,j =0; j<arr.length;j++){
//             if(arr[j]==g){
//                 count++;
//             }
//             while(count>k && i<=j){
//                 if(arr[i]==g){
//                     count--;
//                 }
//                 i++;
//             } 

//             ans =Math.max(ans,j-i+1);

//         }
//         System.out.println(ans);
//     }
// }

//...........................................................................................................                        

// actual google sde question 
// now here we have to keep the track of 3 numbers previously was one
// g1 occuring <= k1 times , g2 occuring <= k2 times and g3 occuring <= k3 times.

 // same code but 3 ka track rakhna hai


 public class sd17_googleOA {
    public static void main(String[] args) {
        int arr[] = {5,5,5,5,5,5};    // 1, 2, 3, 1, 2, 3, 5, 5, 8, 5, 6, 5
        int g1 =5;
        int k1 =4;

        int g2 =6;
        int k2 =2;

        int g3 =3;
        int k3 =2;

        int count1 =0;
        int count2 =0;
        int count3 =0;

        int ans = -1;
        for(int i =0 ,j =0; j<arr.length;j++){
            if(arr[j]==g1){
                count1++;
            }
            if(arr[j]==g2){
                count2++;
            }
            if(arr[j]==g3){
                count3++;
            }


            while((count1>k1|| count2>k2 || count3>k3) && i<=j){


                if(arr[i]==g1){
                    count1--;
                }
                if(arr[i]==g2){
                    count2--;
                }
                if(arr[i]==g3){
                    count3--;
                }

                i++;
            } 

            ans =Math.max(ans,j-i+1);

        }
        System.out.println(ans);
    }
}





