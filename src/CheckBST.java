
public class CheckBST {
    public static void main(String[] args) {

    }

    public boolean checkBST(TreeNode root){
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        // We need to create a helper function because with just root as parameter we cannot determine if its a BST
    }

    public boolean checkBST(TreeNode node, int min, int max){
        if(node == null) //base case
            return false;
        if(node.data <= min || node.data > max){ //base case
            return false;
        }
        if(!checkBST(node.left, min, node.data) || (!checkBST(node.right, node.data, max)))
            //Checking in recursion if left and right subtree are BST by determining that it follows left as minimum,
            //root as less than max but greater than min, right as max
            return false;
        else
            return true;
    }
}
