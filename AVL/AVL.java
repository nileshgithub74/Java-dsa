// class Node {
//     int data, height;
//     Node right, left;

//     Node(int data) {
//         this.data = data;
//         this.height = 1;
//         this.left = this.right = null;
//     }
// }

// public class AVL {

//     static Node root;

//     public static int getHeight(Node root) {
//         if (root == null) return 0;
//         return root.height;
//     }

//     public static int getbalance(Node root) {
//         if (root == null) return 0;
//         return getHeight(root.left) - getHeight(root.right);
//     }

//     public static Node LeftRotate(Node x) {
//         Node y = x.right;
//         Node t2 = y.left;

//         y.left = x;
//         x.right = t2;

//         x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
//         y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;

//         return y;
//     }

//     public static Node RightRotate(Node y) {
//         Node x = y.left;
//         Node t2 = x.right;

//         x.right = y;
//         y.left = t2;

//         y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
//         x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;

//         return x;
//     }

//     public static Node insert(Node root, int key) {
//         if (root == null) return new Node(key);

//         if (key < root.data)
//             root.left = insert(root.left, key);
//         else if (key > root.data)
//             root.right = insert(root.right, key);
//         else
//             return root;

//         root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
//         int balance = getbalance(root); 

//         if (balance > 1 && key < root.left.data)
//             return RightRotate(root);

//         if (balance < -1 && key > root.right.data)
//             return LeftRotate(root);

//         if (balance > 1 && key > root.left.data) {
//             root.left = LeftRotate(root.left);
//             return RightRotate(root);
//         }

//         if (balance < -1 && key < root.right.data) {
//             root.right = RightRotate(root.right);
//             return LeftRotate(root);
//         }

//         return root;
//     }

//     public static Node minValueNode(Node node) {
//         Node current = node;
//         while (current.left != null)
//             current = current.left;
//         return current;
//     }

//     public static Node delete(Node root, int key) {
//         if (root == null) return root;
//         if (key < root.data)
//             root.left = delete(root.left, key);
//         else if (key > root.data)
//             root.right = delete(root.right, key);
     

//         if (root == null) return root;

//         root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;

//         int balance = getbalance(root);

        

//         return root;
//     }

//     public static void insertKey(int key) {
//         root = insert(root, key);
//     }

//     public static void deleteKey(int key) {
//         root = delete(root, key);
//     }

//     public static void preOrder(Node root) {
//         if (root != null) {
//             System.out.print(root.data + " ");
//             preOrder(root.left);
//             preOrder(root.right);
//         }
//     }

//     public static void main(String[] args) {
//         insertKey(10);
//         insertKey(20);
//         insertKey(30);
//         insertKey(40);
//         insertKey(50);
//         insertKey(25);

//         System.out.println("Preorder Traversal before deletion:");
//         preOrder(root);

//         deleteKey(20);
//         System.out.println("\nPreorder Traversal after deleting 20:");
//         preOrder(root);
//     }
// }
