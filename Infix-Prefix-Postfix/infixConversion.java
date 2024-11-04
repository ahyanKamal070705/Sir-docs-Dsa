import java.util.Stack;

public class infixConversion {


      
    public static void main(String[] args) {

        String str = "9-(5+3)*4/6";
        Stack <Integer> val = new Stack<>();
        Stack <Character> operator = new Stack<>();

        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
          
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else if(operator.size()==0 || ch=='(' || operator.peek()=='('){
                operator.push(ch);
            }

             else if(ch==')')
             {
               while(operator.peek()!= '('){
                int val2 = val.pop();
                int val1 = val.pop();
               //  work
               if(operator.peek()=='+') val.push(val1+val2);
               if(operator.peek()=='-') val.push(val1-val2);
               if(operator.peek()=='*') val.push(val1*val2);
               if(operator.peek()=='/') val.push(val1/val2);
                operator.pop();
               }

               operator.pop();  // '(' removing this       

            }
             else{

            // checking priority 

            if(ch =='+' || ch =='-'){
                
                //if this is the case then any element present in the top will have priority greater than aur equal to + & -
                 int val2 = val.pop();
                 int val1 = val.pop();
                //  work
                if(operator.peek()=='+') val.push(val1+val2);
                if(operator.peek()=='-') val.push(val1-val2);
                if(operator.peek()=='*') val.push(val1*val2);
                if(operator.peek()=='/') val.push(val1/val2);
                 operator.pop();

                //  push
                operator.push(ch);

            }

            if(ch=='*' || ch=='/'){
             
            // check the topmost element have same priority or not ---if yess do work --if no straight away push
            
            if(operator.peek()=='*' || operator.peek()=='/'){

                // work don1
                int val2 = val.pop();
                int val1 = val.pop();
                if(operator.peek()=='+') val.push(val1+val2);
                if(operator.peek()=='-') val.push(val1-val2);
                if(operator.peek()=='*') val.push(val1*val2);
                if(operator.peek()=='/') val.push(val1/val2);
                operator.pop();

               //  push
               operator.push(ch);

            }
            else{
               // when peek element priority is less
                operator.push(ch);

            }

            }
            }
      } 
    //   after ending of whole loop some elements are left to be done
     while(val.size()>1){
        int val2 = val.pop();
        int val1 = val.pop();
        if(operator.peek()=='+') val.push(val1+val2);
        if(operator.peek()=='-') val.push(val1-val2);
        if(operator.peek()=='*') val.push(val1*val2);
        if(operator.peek()=='/') val.push(val1/val2);
        operator.pop();
     }
    
     System.out.println(val.peek());

    }
}
