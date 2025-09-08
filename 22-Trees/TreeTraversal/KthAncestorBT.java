import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class KthAncestorBT {
    public static void main(String[] args) {

    }

    class TreeAncestor {

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
        TreeNode root;
        Map<Integer, TreeNode> map=new HashMap<>();
        public TreeAncestor(int n, int[] parent) {
            for(int i=0;i<n;i++){
                map.put(i, new TreeNode(i));
            }

            for(int i=0;i<n;i++){
                if(parent[i]==-1){
                    root=map.get(i);
                }else{
                    TreeNode p=map.get(parent[i]);
                    if(p.left==null){
                        p.left=map.get(i);
                    } else{
                        p.right=map.get(i);
                    }
                }
            }
        }

        public int getKthAncestor(int node, int k) {
            List<Integer> list = new ArrayList<>();
            if (!helper(root, node, list)) {
                return -1;
            }
            int index=list.size()-1-k;
            if(index<0){
                return -1;
            }
            return list.get(index);
        }

        boolean helper(TreeNode node, int target, List<Integer> list) {
            if (node == null) {
                return false;
            }
            
            list.add(node.val);

            if (node.val == target) {
                return true;
            }

            if (helper(node.left, target, list) || helper(node.right, target, list)) {
                return true;
            }

            list.remove(list.size() - 1);
            return false;
        }
    }
}
