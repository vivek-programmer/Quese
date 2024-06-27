// package Quese;
// import java.util.*;

// public class LinkQueue {
//     // static class  Node{
//     //     int data ;
//     //     Node next;

//     //     public Node(int data) {
//     //         this.data=data;
//     //         this.next=null;
//     //     }
//     // }
//     // static class Queue{
//     //     static Node head=null;
//     //     static Node tail=null;
//     //     public static boolean Isempty(){
//     //         return head==null&&tail==null;
//     //     }
//     //     public static void add(int data){
//     //         Node newnode= new Node(data);
//     //         if(head==null){
//     //             head=tail=newnode;
//     //             return;
//     //         }
//     //         tail.next=newnode;
//     //         tail=newnode;
//     //     }
//     //     public static int remove(){
//     //         if(Isempty()){
//     //             System.out.println("queue is empty");
//     //             return -1;
//     //         }
//     //         int front =head.data;
//     //        if(tail==head){
//     //         tail=head=null;
//     //        } else{
//     //         head=head.next; 
//     //        }
//     //         return front;
//     //     }
//     //     public static int peek(){
//     //         if(Isempty()){
//     //             System.out.println("is empty");
//     //             return -1;
//     //         }
//     //         return head.data;
//     //     }
//     // }
//     public static void main(String[] args) {
//         // Queue q=new Queue();
//         // q.add(1);
//         // q.add(2);
//         // while(!q.Isempty()){
//         //     System.out.println(q.peek()+" ");
//         //     q.remove();
//             // Queue<Integer> q=new LinkedList<>();
//             Queue<Integer> q=new ArrayDeque<>();
//             q.add(1);
//             q.add(2);
//             while(!q.isEmpty()){
//                      System.out.println(q.peek()+" ");
//                    q.remove();
//         }
//     }}

