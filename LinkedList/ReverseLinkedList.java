// package LinkedList;

// import java.util.Stack;

// class Node{
//     int data;
//     Node next;

//     public Node(int data){
//         this.data = data;
//         this.next = null; 
//     }
// }

// public class ReverseLinkedList {
//     Node  head = null;

//     public static void PrintLinkedList(Node head){
//         Node curr  = head;
//         while(curr != null){
//             System.out.print(curr.data+" ");
//             curr = curr.next;
//         }
//     }

//     public static Node  ReverseList(Node head){
//         Node curr = head;
//         Node prev = null;

//         while(curr != null){
//             Node newNode = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = newNode;
//         }
//         return prev;

    
//     }


    
//     public static Node ReverseUsingStack(Node  head){
//         Stack<Node> st = new Stack<>();

//         Node curr = head;
//         while( curr != null){
//             st.push(curr);
//             curr  = curr.next;
//         }

//         Node newHead =  st.pop();
//         Node temp = newHead;
//         while(!st.isEmpty()){
//             temp.next = st.pop();
//             temp = temp.next;

//         }

//         temp.next = null;
//         return newHead;


//     }
//     public static void main(String[] args){

//         Node head = new Node(10);
//         Node a = new Node(20);
//         Node b = new Node(30);
//         Node c = new Node(40);
//         head.next = a;
//         a.next = b;
//         b.next =c ;
//         c.next = null;

//         PrintLinkedList(head);
//         System.out.println();

//     //     System.out.println("Printing the List in the reversed Order : ");

//     //    Node reverseHead =  ReverseUsingStack(head);

//     //    PrintLinkedList(reverseHead);

//        Node revNode = ReverseList(head);
//        PrintLinkedList(revNode);

        
       

//     }
    
// }
