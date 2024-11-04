
public class arrayImplementation {

    public static class Stack{
        int top = 0;
        int [] arr = new int[6];
     
        void push(int x){
            if(isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[top]=x;
            top++;
        }
        int peek(){
             if(top==0)return -1;
            return arr[top-1];
        }

        int pop(){
            if(top==0) return -1;
            int x = arr[top-1];
            arr[top-1]=0;
            top--;
            return x;
            
        }

        void display(){
            for(int i = 0;i<top;i++){
                 System.out.print(arr[i]+" ");
            }
        }

        int size(){
            return top;
        }
     
        boolean isEmpty(){
            if(top==0) return true;
            else return false;
        }

        boolean isFull(){
            if(top==arr.length) return true;
            else return false;
        }





    }
     public static void main(String[] args){
        Stack st = new Stack();
        st.push(10);
        st.push(2);
        st.push(1);
        st.push(14);
        st.display();
        st.pop();
        System.out.println();
        st.pop();
        st.pop();
         
        st.display();
       

     }
}
