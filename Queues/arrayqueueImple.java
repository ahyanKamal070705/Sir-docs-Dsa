 
public class arrayqueueImple {
    public  static class queuesArray{
        int front  =-1;
        int rear = -1;
        int arr[] =  new int [5];
        int size =0;

        void add(int x){
           if(rear==arr.length-1){
              System.out.println("Queue is full");
              return;
           }
          if(size==0 && front==-1){
            front++;
            rear++;
          }else{
              rear++;
          }

          arr[size]=x;
          size++;
        }

        int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            int x = arr[front];
            front++;
            size--;
            return x;
        }

        int peek(){
            
            return arr[front];
        }

         boolean isEmpty(){
           if(size==0) return true;
           return false;
        }

        void display(){
            if (size==0) {
                System.out.println("queue is empty");
                return; 
            } else{
                for(int i =front ; i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            
        

        }



   }
  public static void main(String[] args) {
       queuesArray qu = new queuesArray();

       qu.add(1);
       qu.add(2);
       qu.add(3);
       qu.add(4);
       qu.add(4);
       qu.display();
       qu.remove();
       qu.display(); 

  }
}
