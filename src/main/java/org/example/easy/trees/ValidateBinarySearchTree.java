package org.example.easy.trees;

//08.04.2024
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/625/
//IT IS PRETTY MUCH COMPLEX PROBLEM AND SOLUTION RIGHT HERE. THE IDEA IS WE RECURSIVELY CHECK EVERY TREE NODE IF IT IS VALID WE CONTINUE CHECKING IF NOT WE WILL RETURN FALSE.
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(n)

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root){
        boolean isValid = true;
        if (root == null) return isValid;

        if (root.left == null && root.right == null) return isValid;

        isValid = isValidHelper(root.left, root.val, Double.MIN_VALUE) &&
                isValidHelper(root.right, Double.MAX_VALUE, root.val);

        return isValid;
    }

    private boolean isValidHelper(TreeNode root, double max, double min){
        boolean isValid = true;

        if (root == null) return isValid;

        if (root.val < max && root.val > min){
            return isValidHelper(root.left, Math.min(max, root.val), min) &&
                    isValidHelper(root.right, max, Math.max(min, root.val));
        }else return !isValid;
    }

}
