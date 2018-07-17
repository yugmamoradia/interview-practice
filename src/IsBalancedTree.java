
class IsBalancedTree {
    public static void main(String[] args) {
        //System.out.println(isBalancedTree());
    }

    public static int checkHeight(TreeNode root){
        if(root == null)
            return 0;
        int leftHeight = checkHeight(root.left); //Checking the height of left subtree in recursion until it reaches the leaf node
        if(leftHeight == -1)
            return -1;
        int rightHeight = checkHeight(root.right); //Checking the height of right subtree in recursion until it reaches the leaf node
        if(rightHeight == -1)
            return -1;
        int heightDiff = Math.abs(leftHeight - rightHeight); // Calculating the diff of both subtree at each level to determine that the diff is not more than 1

        if(heightDiff > 1)
            return -1;
        else
            return Math.max(leftHeight, rightHeight) +1; //returning the height of tree by taking the max of either subtree and adding 1
    }

    // First Entry point to the algorithm logic. Starts from the root and then calls the helper method checkHeight()
    public static boolean isBalancedTree(TreeNode root){
        if(checkHeight(root) == -1)
            return false;
        else
            return true;
    }
}
