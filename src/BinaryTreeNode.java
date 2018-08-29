import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * The tree used in the below example functions is as follows
 *
 *          _40_
 *        /     \
 *      35      50
 *     /  \    /  \
 *   10   37  47  70
 *
 *   Expected and coded solution yields output as below
 *   Level order : [[40], [35, 50], [10, 37, 47, 70]]
 */



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

        c.left = c.right = d.left = d.right = null;
        e.left = e.right = f.left = f.right = null;

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

        System.out.println("Second Largest element in tree: " +secondLargest(root));

        System.out.println("Is Binary search tree? : "+isBST(root));
        System.out.println("Level order : "+levelOrder(root));

    }

    public static int secondLargest(TreeNode node){
        if(node == null)
            return -1;
        if(node.right == null && node.left.left == null && node.left.right == null)
            return node.left.data;
        else if((node.right.left == null && node.right.right == null))
            return node.data;
        else{
            return secondLargest(node.right);
        }
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

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        //Use a queue to list elements: each row
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();    //Limit the size, since the queue is increasing
            for (int i = 0; i < size; i++) {
                TreeNode levelNode = queue.poll();
                list.add(levelNode.data);   //Add all the values from this current level
                if (levelNode.left != null) {
                    queue.add(levelNode.left);
                }
                if (levelNode.right != null) {
                    queue.add(levelNode.right);
                }
            }
            result.add(list);
        }   // end of while

        return result;
    }
}
