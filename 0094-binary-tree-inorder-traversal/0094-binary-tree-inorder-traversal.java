import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return; // Base case: if the node is null, return
        }
        inorderHelper(node.left, result); // Visit left subtree
        result.add(node.val); // Process current node
        inorderHelper(node.right, result); // Visit right subtree
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        System.out.println(solution.inorderTraversal(root1)); // Output: [1, 3, 2]

        // Example 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.right = new TreeNode(8);
        root2.right.right.left = new TreeNode(6);
        root2.right.right.right = new TreeNode(7);
        root2.right.right.right.right = new TreeNode(9);
        System.out.println(solution.inorderTraversal(root2)); // Output: [4, 2, 5, 1, 6, 3, 7, 9, 8]

        // Example 3
        TreeNode root3 = null;
        System.out.println(solution.inorderTraversal(root3)); // Output: []

        // Example 4
        TreeNode root4 = new TreeNode(1);
        System.out.println(solution.inorderTraversal(root4)); // Output: [1]
    }
}