



public class implementation {

     public static class Node{
         int data;
        Node next;

         public Node(int data){
            this.data = data;
         }
     }

     public static class ll{
         Node head = null;
         Node tail = null;
         int size = 0;

         void display(){
            Node temp = head;
           while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
           }
           System.out.println();
         }

         void insertAtEnd(int data){
             Node temp = new Node(data);
            if(head==null) {
                head = temp;
                
            }else{
                tail.next=temp;
            }

            tail=temp;
             
           size++;
         }
          
        //  no need iska size ka attribute bana diye haii


        //  int size(){
        //     Node temp =head;
        //     int count = 0;
        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;
        //        }
        //        return count;
        //  }

         void insertAtBeggining(int data){
            Node temp = new Node(data);
            if(head==null) {
                 
                tail=temp;
            }
             else{
                temp.next= head;
              
         } 
         head=temp;
         size++;
     }

     void insertAtAnyPosition(int data,int idx){
        Node t = head;
        Node temp= new Node(data);
        // handle two edge case n==0 && n==n
        if(idx==0){
           insertAtBeggining(data);
            return;
        }

        if(idx== size){
            
            insertAtEnd(data);
            return;
        }
        if(idx<0 || idx>size){
            System.out.println("invalid input");
            return;
        }

        for(int i=0 ; i<idx-1;i++){
            t=t.next;
        }
        temp.next = t.next;
        t.next=temp;
        size++;
         
         
     }

    //   get any element
    int getAt(int idx){
        Node temp = head;
        for(int i = 0; i<idx; i++){
          temp=temp.next;
        }
         return temp.data;
    } 

      void deleteAt(int idx){
          
      Node temp = head;
      if(idx==0)  {
        head=head.next;
        size--;
        return;
      };
      for(int i =0;i<idx-1;i++){
        temp=temp.next;
      }
       temp.next=temp.next.next;
       tail= temp;
       size--;


      }
    }
    public static void main(String[] args) {
        ll a = new ll();
        a.insertAtEnd(6);
        a.insertAtEnd(6);
        a.insertAtEnd(6);
         
        a.insertAtBeggining(3);
        
        
        a.insertAtAnyPosition(10, 2);
        
        a.insertAtAnyPosition(0, 0);

        // System.out.println(a.size);
        a.insertAtAnyPosition(10,6);
      
        
        a.display();
        a.deleteAt(6);
        a.display();
        System.out.println(a.tail.data);
        // System.out.println(a.tail.data);
        // System.out.println(a.getAt(1));
    }
}

