package org.example.easy.trees;


//14.04.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/631/
//APPROACH IS RECURSIVELY CONSTRUCTING OUR TREE NODE BY DIVIDING THE SORTED ARRAY INTO TWO HALVES AND SELECTING THE MIDDLE ELEMENT AS A ROOT OF SUBTREE
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(n)

public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length-1);
    }

    private TreeNode createBST(int[] nums, int left, int right){
        if(left > right){
            return null;
        }


        int middle = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[middle]);

        root.left = createBST(nums, left, middle - 1);
        root.right = createBST(nums, middle + 1, right);

        return root;
    }
}
