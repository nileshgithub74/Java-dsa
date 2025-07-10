package BST;

class Node {
    int key;
    Node right, left;

    Node(int key) {
        this.key = key;
        this.left = this.right = null;
    }
}

public class BSTImplementation {

    static Node root = null;

    static void insert(int key) {
        root = insertUtil(root, key);
    }

static Node insertUtil(Node root, int key){

    if(root == null ){
        root = new Node(key);
        return root;
}

 if(key < root.key){
   root.left =   insertUtil(root.left, key);
 }
 else if( key > root.key){
   root.right =  insertUtil(root.right, key);
 }

 return root;


    

}

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(5);

    }

}
