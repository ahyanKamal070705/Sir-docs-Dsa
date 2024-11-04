import java.util.Scanner;
public class findSubsequences_1 {
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int n =str.length();
      System.out.println(n);
       
       for(int i =0;i<str.length();i++){
         for(int j=i+1;j<=str.length();j++){
            System.out.print(str.substring(i, j)+" ");
         }
       }
  }
}
