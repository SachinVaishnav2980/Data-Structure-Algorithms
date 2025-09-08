package TreeTraversal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            List<Integer> currLevel = new ArrayList<>(levelsize);
            for (int i = 0; i < levelsize; i++) {
                TreeNode node = queue.poll();
                currLevel.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(currLevel);
        }
        // Collections.reverse(result);
        return result;
    }

    // Zig-Zag order
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        // boolean reverse=false;
        int level = 1;
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            List<Integer> currLevel = new ArrayList<>(levelsize);
            for (int i = 0; i < levelsize; i++) {
                if (level % 2 != 0) {
                    TreeNode node = queue.pollFirst();
                    currLevel.add(node.val);
                    if (node.left != null) {
                        queue.addLast(node.left);
                    }
                    if (node.right != null) {
                        queue.addLast(node.right);
                    }
                } else {
                    TreeNode node = queue.pollLast();
                    currLevel.add(node.val);
                    if (node.right != null) {
                        queue.addFirst(node.right);
                    }
                    if (node.left != null) {
                        queue.addFirst(node.left);
                    }
                }
            }
            level++;
            // reverse=!reverse;
            result.add(currLevel);
        }
        return result;
    }

}
