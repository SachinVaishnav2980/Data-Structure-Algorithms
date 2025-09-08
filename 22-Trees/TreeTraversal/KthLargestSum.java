package TreeTraversal;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

import TreeTraversal.LinkedBinaryTree.Node;

public class KthLargestSum {
    public static void main(String[] args) {
        
    }

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

    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null){
            return -1;
        }
        long sum=0;
        List<Long> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode node=queue.poll();
                sum+=node.val;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            list.add(sum);
            sum=0;
        }
        Collections.sort(list);
        int n=list.size();
        return list.get(n-k);
    }
}
