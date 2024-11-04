import java.util.Stack;

public class infixToPrefix {


      
    public static void main(String[] args) {

        String str = "9-5+3*4/6";

        // Stack is made uf of string
        Stack <String> val = new Stack<>();
        Stack <Character> operator = new Stack<>();

        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
          
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57){
                String s = ""+ch;
                 val.push(s);
            }
            else if(operator.size()==0 || ch=='(' || operator.peek()=='('){
                operator.push(ch);
            }

             else if(ch==')')
             {
               while(operator.peek()!= '('){
                String val2 = val.pop();
                String val1 = val.pop();
                char op = operator.pop();

                val.push(op+val1+val2);

               }

               operator.pop();  // '(' removing this       

            }
             else{

            // checking priority 

            if(ch =='+' || ch =='-'){
                
                //if this is the case then any element present in the top will have priority greater than aur equal to + & -
                String val2 = val.pop();
                String val1 = val.pop();
                char op = operator.pop();

                val.push(op+val1+val2);

                //  push
                operator.push(ch);
               

            }

            if(ch=='*' || ch=='/'){
             
            // check the topmost element have same priority or not ---if yess do work --if no straight away push
            
            if(operator.peek()=='*' || operator.peek()=='/'){

                // work don1
                String val2 = val.pop();
                String val1 = val.pop();
                char op = operator.pop();

                val.push(op+val1+val2);

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
        String val2 = val.pop();
        String val1 = val.pop();
        char op = operator.pop();

        val.push(op+val1+val2);
     }
    
     System.out.println(val.peek());

    }
}
