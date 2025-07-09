class TreeNode {
    TreeNode left, right;
    int key;

    public TreeNode(int key) {
        this.key = key;
        this.right = null;

    }
}

class TreeImplementation {
    TreeNode root = null;

    public static void Traverse(TreeNode root) {
        TreeNode curr = root;
        if (curr != null) {
            System.out.println(root.key);
            Traverse(root.left);
            Traverse(root.right);

        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.right = new TreeNode(40);
        root.right.right = new TreeNode(50);

        Traverse(root);

    }

}


// Inoder - left, , root, right;
// preorder - root, left, right;
// postorder - left, right,root