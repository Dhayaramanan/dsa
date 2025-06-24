package BinaryTree;

public class LongestZigZagPathInABinaryTree {
    int maxZigZag = 0;
    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        dfs(root.left, 1, true);
        dfs(root.right, 1, false);

        return maxZigZag;
    }

    private void dfs(TreeNode node, int length, boolean isLeft) {
        if (node == null) return;

        maxZigZag = Math.max(maxZigZag, length);

        if (isLeft) {
            dfs(node.right, length+1, false);
            dfs(node.left, 1, true);
        } else {
            dfs(node.left, length+1, true);
            dfs(node.right, 1, false);
        }
    }
}
