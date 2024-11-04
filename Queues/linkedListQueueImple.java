//SIMPLE LINKED LIST BANANA HAI HEAD AND TAIL POINTERS KE SAATH

public   class linkedListQueueImple {
    
    public  static class Node{
        int val;
        Node next;

       public Node(int data){
           val = data;
        }
    }

    public  static class linkedListQueue{
        Node head = null;
        Node tail = null;
        int size =0;

        void add(int data){
            Node temp = new Node(data);

            if(size==0){
              head=temp;
              tail=temp;
            }else{
                tail.next = temp;
                tail=temp;
            }
            
            size++; 
        }

        int remove(){

             int x ;
            if(size==0){
                System.out.println("NOTHING TO REMOVE");
                return -1;
            }else{
                 x= head.val;
                head= head.next;
            }
            size--;
            return x;
        }

        int peek(){
            if(size==0){
                System.out.println("NOTHING TO display");
                return -1;
            }
            return head.val;
        }

        void display(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
    }


    public static void main(String[] args) {
       linkedListQueue qu = new linkedListQueue();

       qu.add(0);
       qu.add(4);
       qu.add(3);
       qu.add(1);
       qu.display();
        System.out.println(qu.peek());
        qu.remove();
        qu.display();
        



    }
}
