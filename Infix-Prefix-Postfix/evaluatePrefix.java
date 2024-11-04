 
import java.util.*;
public class evaluatePrefix{
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        String str = "-9/*+5346";

        for(int i =str.length()-1;i>=0;i--){
            char x = str.charAt(i);
             int ascii = (int)x;

             if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
             }
             else{
            
                 // upar wala pop value 1 hoga as hmlog ulta chalre hai
                int val1 = val.pop();
                int val2 = val.pop();

                
               //  work
               if(x=='+') val.push(val1+val2);
               if(x=='-') val.push(val1-val2);
               if(x=='*') val.push(val1*val2);
               if(x=='/') val.push(val1/val2);

             }
        }
        System.out.println(val.peek());
    }
    
}
