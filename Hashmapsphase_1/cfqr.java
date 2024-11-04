
import java.util.Scanner;

public class cfqr {
  public static void main(String[] args) {
    //TAKING INPUTS 
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int arr[] = new int[N];

    for(int i =0;i<arr.length;i++){
        arr[i]= sc.nextInt();
    }

     int Q =sc.nextInt();
     
     int inputArr[][] = new int[Q][2];

     for(int i =0;i<Q;i++){
        for(int j =0;j<2;j++){
          inputArr[i][j]=sc.nextInt();
        }
     }

     sc.close();

     //SOLUTION

     //we'll create prefix array 
     //why not map? map only store unique element int the question its not given element is unique
       int prefixArray[] = new int[N];
          
       prefixArray[0]= arr[0];
       for(int i =1;i<prefixArray.length;i++){
           prefixArray[i]=prefixArray[i-1]+arr[i];
       }

     for(int i =0;i<inputArr.length;i++){
        for(int j =0;j<inputArr[i].length;j++){
            int first = inputArr[i][j];
            j++;
            int second =  inputArr[i][j];
             
            //extract from prefixArray
            if(first==0){
                System.out.println(prefixArray[second]);
            }else{
                System.out.println(prefixArray[second]-prefixArray[first-1]);
            }

        }
        
     }


  }
}
