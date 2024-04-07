package org.example.easy.trees;

//08.04.2024
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/627/
//THE IDEA IS WE CREATE ANOTHER METHOD TO CHECK IF THAT TWO TREE NODE IS MIRROR WITH EACH OTHER AND IT CONTINUES RECURSIVELY. IF THERE IS DIFFERENCE THAN OUR FUNCTION IMMEDIATELY RETURNS FALSE.
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(n)

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root){
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
