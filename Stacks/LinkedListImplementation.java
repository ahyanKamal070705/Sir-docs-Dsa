public class LinkedListImplementation {

    public static class Node{
        Node next;
        int val;

        public Node(int data){
            val=data;
        }
    }

    public static class Stack{
        Node head = null;
        int top = 0;
       


         void display(Node h){
            if(h==null) return;

            display(h.next);
            System.out.println(h.val);
         }
        void displayRev(){
            display(head);
        }

         int size(){
            return top;
         }

        void push(int data){
            Node temp = new Node(data);
            temp.next = head;
            head= temp;
            top++;
        }

        int peek(){
            return head.val;
        }

        int pop(){
            if(size()==0)  return -1;
            
            int x = head.val;
            head=head.next;
            top--;
            return x;
        }

    }
    public static void main(String[] args) {
    Stack st = new Stack();
    st.push(5);
    st.push(5);
    st.push(2);
    st.push(5);st.push(1);
     
    st.pop();
    // st.displayRev();
     System.out.println(st.size());









    } 
}
