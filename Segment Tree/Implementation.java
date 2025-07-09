class Node {
    int data;
    int startInterval, endInterval;

    Node left, right;

    Node(int startInterval, int endInterval) {
        this.startInterval = startInterval;
        this.endInterval = endInterval;

    }
}

public class Implementation {
    static Node root;

    public static Node BuildTree(int[] arr, int start, int end) {
        Node node = new Node(start, end);

        if (start == end) {
            node.data = arr[start];
            return node;
        }

        int mid = (start + end) / 2;
        node.left = BuildTree(arr, start, mid);
        node.right = BuildTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;

        return node;

    }

    public static void display(Node root) {
        if (root == null)
            return;
        display(root.left);
        System.out.println("[" + root.startInterval + ", " + root.endInterval + "] = " + root.data);
        display(root.right);
    }

    public static void update(Node node, int index, int newValue) {
        if (node.startInterval == node.endInterval) {
            node.data = newValue;

        }
        int mid = (node.startInterval + node.endInterval) / 2;

        if (index <= mid) {
            update(node.left, index, newValue);
        } else {
            update(node.right, index, newValue);
        }

        node.data = node.left.data + node.right.data;

    }

    public static int rangeQuery(Node root, int startIdx, int endIdx) {

        if (root == null || endIdx < root.startInterval || startIdx > root.endInterval)
            return 0;

        if (startIdx <= root.startInterval && root.endInterval <= endIdx)
            return root.data;

        int leftSum = rangeQuery(root.left, startIdx, endIdx);
        int rightSum = rangeQuery(root.right, startIdx, endIdx);
        return leftSum + rightSum;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 3, -5, 4, 9, 7, 8 };
        root = BuildTree(arr, 0, arr.length - 1);

        System.out.println("Segment Tree In-Order Traversal:");
        display(root);

        System.out.println(" Ater updation   the result look like : ");
        

    }

}
