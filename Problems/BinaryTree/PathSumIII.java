package BinaryTree;

/*
Given the root of a binary tree and an integer targetSum,
return the number of paths where the sum of the values along the path equals targetSum.

The path does not need to start or end at the root or a leaf,
but it must go downwards (i.e., traveling only from parent nodes to child nodes).
 */

public class PathSumIII {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        // starting path from every node to get every possible path
        int countFromRoot = countPathFromNode(root, targetSum);
        int countLeft = pathSum(root.left, targetSum);
        int countRight = pathSum(root.right, targetSum);

        return countFromRoot + countLeft + countRight;
    }
    private int countPathFromNode(TreeNode node, long target) {
        if (node == null) return 0;

        int count = 0;
        if (node.val == target) count++;

        count += countPathFromNode(node.left, target - node.val);
        count += countPathFromNode(node.right, target - node.val);

        return count;
    }
}
