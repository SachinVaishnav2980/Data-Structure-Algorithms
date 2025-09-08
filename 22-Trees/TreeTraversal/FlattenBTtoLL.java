package TreeTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenBTtoLL {
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

    public void flatten(TreeNode root){
        if(root==null) return ;
        Queue<TreeNode> ans= new LinkedList<>();
        treeToQueue(root, ans);

        TreeNode node=ans.poll();
        while (!ans.isEmpty()) {
            node.left=null;
            node.right=ans.poll();
            node=node.right;
        }
    }

    public void treeToQueue(TreeNode node, Queue<TreeNode> ans){
        if(node==null) return;
        ans.offer(node);
        treeToQueue(node.left, ans);
        treeToQueue(node.right, ans);
    }

    public void flatten2(TreeNode root){
        TreeNode currNode=root;
        while (currNode!=null) {
            if(currNode.left!=null){
                TreeNode temp=currNode.left;
                while (temp.right!=null) {
                    temp=temp.right;
                }
                temp.right=currNode.right;
                currNode.right=currNode.left;
                currNode.left=null;
            }
            currNode=currNode.right;
        }
    }
}
