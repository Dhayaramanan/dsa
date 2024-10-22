package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class KthLargestSumInABinaryTree {

    public static long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> levelSums = sumOfLevels(root);
        return findKthLargestSum(levelSums, k);
    }

    public static ArrayList<Long> sumOfLevels(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        ArrayList<Long> levelSums = new ArrayList<>();

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            long levelSum = 0;

            for (int i = 0; i < levelSize; ++i) {
                TreeNode currentNode = queue.poll();
                levelSum += currentNode.val;

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            levelSums.add(levelSum);
        }

        return levelSums;
    }

    public static long findKthLargestSum(ArrayList<Long> levelSums, int k) {
        if (levelSums.size() < k) return -1;

        levelSums.sort(Collections.reverseOrder());

        return levelSums.get(k-1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(kthLargestLevelSum(root, 2));
    }
}
