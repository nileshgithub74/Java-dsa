import java.util.Queue;
import java.util.LinkedList;

class Node {
    int key;
    Node left, right;

    Node(int key) {
        this.key = key;
        this.left = this.right = null;
    }
}

public class LevelOrderTraversal {

    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                System.out.println(curr.key);

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(70);
        root.right.right.right = new Node(80);

        bfs(root);

    }

}
