import java.util.Scanner;
public class rangeUpdateSD23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {0,0,0,0,0,0,0,0,0,0,0};
        int Q = sc.nextInt();

        for(int i = 0;i<Q;i++){
           System.out.println("Enter l:");
           int l = sc.nextInt();
           System.out.println("Enter r:");
           int r = sc.nextInt();

            arr[l]=arr[l]+1;
             if(r+1<=arr.length){
              arr[r+1]=arr[r+1]-1;
             }
        }
         
    
        for(int i = 1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



         
    }
}
