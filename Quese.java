package Quese;

public class Quese {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int font;
        Queue(int n) {
            arr=new int[n];
            size=n;  
            rear=-1;
            font=-1;
        }
        public static boolean Isempty(){
             return rear==-1&&font==-1;
            }
        public static boolean  Isfull(){
            return (rear+1)%size==font;
        }    
        public static void add(int data){
            if(Isfull()){
                System.out.println("Queue is already full");
                return;
            }
            if(font==-1){
                font=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }    
        public static int remove(){
            if(Isempty()){
                System.out.println("empty queue");
                return -1;   
            }
            int result=arr[font];
            
            if(font==rear){
                font=rear=-1;
            }
            else { 
                font =(font+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(Isempty()){
                System.out.println("is empty");
                return -1;
            }
            return arr[font];
        }

    }
    public static void main(String[] args) {
        Queue q =new Queue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.Isempty()){
            System.out.println(q.peek());
            q.remove();
        }
     
    }
}
