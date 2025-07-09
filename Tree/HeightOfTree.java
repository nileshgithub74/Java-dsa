import java.util.*;


class Node{
    int key;
    Node left, right;

    public Node(int key){
        this.key = key;
        this.right = this.left = null;
    }
}

public class HeightOfTree {

    public static int height(Node root){
        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;

    }

    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right  = new Node(30);
        root.left.left = new Node(40);
        root.left.left.left = new Node(50);

       int result =  height(root);
       System.out.println( result);



         
    }

    
}
