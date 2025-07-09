package LinkedList;

class Node{
    int data;
    Node head;
    Node next;

    public Node(int data){
        this.data = data;
        this.head = null;
        this.next = null;
    }
}


class Implementation {
    static Node head =  null;

    public static Node  InsertAtBegin(Node head, int x){
        if(head == null){
            return new Node(x);
        }

        Node temp = new Node(x);
        temp.next = head;
         return temp;

    }




    public static int SearchElement(Node head, int target){

        Node curr = head;
        int position = 1;

        while(curr != null){
            if(curr.data == target){
                return position ;
            }
            position++;
            curr = curr.next;
        }


        return  -1;

    }



    public static void Traversal(Node head){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }


    public static void main(String[] args){
        

      Node head = new Node(10);
      head = InsertAtBegin(head,20);
      head = InsertAtBegin(head,50);
      head = InsertAtBegin(head,40);


        Traversal(head);
        // int ans = SearchElement(head,2);
        // System.out.println(ans);



    }

    
}
