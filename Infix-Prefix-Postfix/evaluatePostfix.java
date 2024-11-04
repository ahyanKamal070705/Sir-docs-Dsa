 
import java.util.*;
public class evaluatePostfix {
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        String str = "95-34*6/+";

        for(int i =0;i<str.length();i++){
            char x = str.charAt(i);
             int ascii = (int)x;

             if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
             }
             else{
            
                int val2 = val.pop();
                int val1 = val.pop();

                
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
