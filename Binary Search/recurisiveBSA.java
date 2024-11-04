
public class recurisiveBSA {

     static boolean bsa(int a[],int target, int start , int end){
        if(start > end) return false;

        int mid =(start+end)/2;
        if(a[mid]==target) {
            return true;
        }
        else if( target<a[mid]) {
           return  bsa(a,target,start,mid-1);
        }
        else{
           return bsa(a,target,mid+1,end);
        }
        

     }
    public static void main(String[] args) {
        int a[] = { 2,4,6,7,8,9,10,11,12,13};
        int n =a.length-1;
        System.out.println( bsa(a,10,0,n));
    }
}
