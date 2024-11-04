public class SD22GoogleGirlHack {
    public static void main(String[] args) {
        int arr[]= {0,5,7,9};
        int k = 2;

        int b [] = new int [20];

        for(int i =1;i<arr.length;i++){
            int l = arr[i]-k;
            int r = arr[i]+k;

            b[l] = b[l]+1;
            if(r+1<b.length){
                b[r+1] = b[r+1]-1;
            }
            
        }
        int ans =-1;
        for(int i = 1;i<b.length;i++){
            b[i]=b[i]+b[i-1];
            ans = Math.max(ans,b[i]);
        }
        System.out.println(ans);

        
    }
}
