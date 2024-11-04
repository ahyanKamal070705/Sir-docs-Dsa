import java.util.*;

public class postfixToPrefix{
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
         String str ="953+4*6/-";  
        for(int i =0; i<str.length() ; i++){
            char x = str.charAt(i);
            int ascii = (int)x;

            if(ascii>=48 && ascii<=57){
                String s = ""+x;
                val.push(s);
            } 
            else{
                String val2 = val.pop();
                String val1 = val.pop();
                
               
                val.push(x+val1+val2);
            }

             
        }

        System.out.println(val.peek());
    }
}

// -9/*+5346
