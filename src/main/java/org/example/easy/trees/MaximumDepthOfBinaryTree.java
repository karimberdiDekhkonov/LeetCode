package org.example.easy.trees;


//02.04.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/555/
//SPACE COMPLEXITY: O(n)
//TIME COMPLEXITY: O(log n) or O(n)
//IDEA IS RECURSIVELY GO TO THE LEFT AND RIGHT SUBTREES AND PLUS ONE. IF ROOT IS NULL RETURN ZERO WHICH IS END OF OUR FUNCTION

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root){
        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
