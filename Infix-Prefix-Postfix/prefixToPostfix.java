import java.util.*;

public class prefixToPostfix{
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
         String str ="-9/*+5346";
        for(int i =str.length()-1; i>=0 ; i--){
            char x = str.charAt(i);
            int ascii = (int)x;

            if(ascii>=48 && ascii<=57){
                String s = ""+x;
                val.push(s);
            } 
            else{
                String val1 = val.pop();
                String val2 = val.pop();
               
                val.push(val1+val2+x);
            }

             
        }

        System.out.println(val.peek());
    }
}