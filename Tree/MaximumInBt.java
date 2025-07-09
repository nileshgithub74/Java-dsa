import java.util.*;

class Node {
    int key;
    Node left, right;

    Node(int key) {
        this.key = key;
        this.left = this.right = null;
    }

}

public class MaximumInBt {

    public static int MaxValue(Node root) {
        if (root == null) {
            return 0;
        }

        int left = MaxValue(root.left);
        int right = MaxValue(root.right);

        return Math.max(root.key, Math.max(left, right));

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(30);
        root.right = new Node(40);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(70);
        root.right.right.right = new Node(80);


        int res = MaxValue(root);
        System.out.println("Maximum value : "+ res);

    }

}
