package TreeTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNodeQueryBST {
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

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        inorder(root, list);
        for(int i=0;i<queries.size();i++){
            res.add(colsestnodes(list, queries.get(i)));
        }
        return res;
    }

    List<Integer> colsestnodes(List<Integer> list, int element){
         int n=list.size();
         int low=0;
         int high=n-1;
         int floor=-1;
         int ceil=-1;
         while (low<=high) {
            int mid=low+(high-low)/2;
            if(list.get(mid)==element){
                return Arrays.asList(element, element);
            }else if(list.get(mid)<element){
                floor=list.get(mid);
                low=mid+1;
            }else{
                ceil=list.get(mid);
                high=mid-1;
            }
         }
         return Arrays.asList(floor, ceil);
    }

    void inorder(TreeNode node, List<Integer> list){
        if(node==null){
            return ;
        }

        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}
