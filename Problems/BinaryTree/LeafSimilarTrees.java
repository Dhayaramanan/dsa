package BinaryTree;

import java.util.ArrayList;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> root1Leaves = new ArrayList<>();
        ArrayList<Integer> root2Leaves = new ArrayList<>();

        collectLeaves(root1, root1Leaves);
        collectLeaves(root2, root2Leaves);

        return root1Leaves.equals(root2Leaves);
    }

    public void collectLeaves(TreeNode node, ArrayList<Integer> leaves) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return;
        }
        collectLeaves(node.left, leaves);
        collectLeaves(node.right, leaves);
    }
}
