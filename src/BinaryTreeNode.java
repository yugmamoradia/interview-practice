import apple.laf.JRSUIUtils;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
}

public class BinaryTreeNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        TreeNode a = new TreeNode();
        TreeNode b = new TreeNode();
        TreeNode c = new TreeNode();
        TreeNode d = new TreeNode();
        TreeNode e = new TreeNode();
        TreeNode f = new TreeNode();

        root.data = 40;
        root.left = a;
        root.right = b;

        a.data = 35;
        a.left = c;
        a.right = d;

        b.data = 50;
        b.left = e;
        b.right = f;

        c.data = 10;
        d.data = 37;
        e.data = 47;
        f.data = 70;

        c.left = c.right = d.left = d.right = e.left = e.right = f.left =  f.right = null;

        System.out.println("Inorder Tree Traversal");
        inorderTreeTraversal(root);
        System.out.println();
        System.out.println();

        System.out.println("Pre-order Tree Traversal");
        preorderTreeTraversal(root);
        System.out.println();
        System.out.println();

        System.out.println("Post-order Tree Traversal");
        postorderTreeTraversal(root);
        System.out.println();
        System.out.println();

        System.out.println("Is Binary search tree? : "+isBST(root));

    }

    public static void inorderTreeTraversal(TreeNode node){
        if(node == null){
            return;
        }
        inorderTreeTraversal(node.left);
        System.out.print(node.data);
        System.out.print("-");
        inorderTreeTraversal(node.right);
    }

    public static void preorderTreeTraversal(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.data);
        System.out.print("-");
        preorderTreeTraversal(node.left);
        preorderTreeTraversal(node.right);
    }

    public static void postorderTreeTraversal(TreeNode node){
        if(node == null){
            return;
        }
        postorderTreeTraversal(node.left);
        postorderTreeTraversal(node.right);
        System.out.print(node.data);
        System.out.print("-");

    }

    public static boolean isBST(TreeNode root){
        // Main method that calls a helper method to check if the tree is BST
        // As a starting value, for comparison, it sends a max and a min value from Integer.MIN and Integer.MAX
        return checkBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean checkBst(TreeNode node, int min, int max){
        if(node == null)
            return true;
        if(node.data <= min || node.data > max){
            return false;
        }
        if(!checkBst(node.left, min, node.data) || !checkBst(node.right, node.data, max)){
            return false;
        }
        return true;
    }
}
