package org.example.easy.trees;

import java.util.ArrayList;
import java.util.List;

//11.04.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/628/
//WE CREATE A RESULT LIST IN THE CLASS THEN ADD LIST OF VALUES BY THE LEVEL NUMBER RECURSIVELY.
//TIME COMPLEXITY: O(n);
//SPACE COMPLEXITY: O(n);


public class BinaryTreeLevelOrderTraversal {
    List<List<Integer>> result;
    public List<List<Integer>> levelOrder(TreeNode root) {
        result = new ArrayList<>();
        traverse(root, 0);
        return result;
    }

    private void traverse(TreeNode node, int level){
        if(node == null) return;

        if(result.size() == level){
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.val);
        traverse(node.left, level+1);
        traverse(node.right, level+1);
    }
}
