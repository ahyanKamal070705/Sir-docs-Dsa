import java.util.*;

public class prefixToInfix{
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
                // phla pop val1 qki ulta traverse krre woh phle add hoga
                String val2 = val.pop();
                String val1 = val.pop();
                
                // val2 phle add hua hai qki ulta traverse krre hai
                val.push("("+val2+x+val1+")");
            }

             
        }

        System.out.println(val.peek());
    }
}
