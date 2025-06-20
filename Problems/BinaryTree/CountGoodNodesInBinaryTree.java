package BinaryTree;

/*
Given a binary tree root, a node X in the tree is named good if
in the path from root to X there are no nodes with a value greater than X.

Return the number of good nodes in the binary tree
 */

public class CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int max) {
        if (node == null) return 0;

        int count = 0;
        if (node.val >= max) count = 1;

        max = Math.max(max, node.val);
        count += dfs(node.left, max);
        count += dfs(node.right, max);

        return count;
    }
}
