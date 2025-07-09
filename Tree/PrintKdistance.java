class Node {
    int key;
    Node left, right;

    Node(int key) {
        this.key = key;
        this.left = this.right = null;
    }

}

public class PrintKdistance {

    static void printKthdistance(Node root, int k) {
        if (root == null) {
           System.out.println("null");
            return ;
        }

        if (k == 0) {
            System.out.println(root.key);
        }

        else {
            printKthdistance(root.left, k - 1);
            printKthdistance(root.right, k - 1);
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(30);
        root.right = new Node(40);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(70);
        root.right.right.right = new Node(80);

        printKthdistance(root, 2);

    }
}