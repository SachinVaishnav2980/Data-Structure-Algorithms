package TreeTraversal;

import java.util.*;

public class PermutationTree {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        List<int[]> list = new ArrayList<>();
        permutation(arr, list, 0);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i)[0] != arr[0]) {
                list.remove(i);
            }
        }
        bst(arr);
        
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

    TreeNode root;
    public void insert(int value){
        root=insert(value, root);
    }

    public TreeNode insert(int value, TreeNode node){
        if(node==null){
            node=new TreeNode(value);
            return node;
        }

        if(value<node.val){
            node.left=insert(value, node.left);
        }

        if(value>node.val){
            node.right=insert(value, node.right);
        }

        node.height=Math.max(getHeight(node.left), getHeight(node.right))+1;
        return node;
    }


    static void permutation(int[] arr, List<int[]> list, int index) {
        if (index == arr.length) {
            list.add(arr.clone());
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            permutation(arr, list, index + 1);
            swap(arr, i, index);
        }
    }

    static void swap(int[] arr, int first, int secodnd) {
        int temp = arr[first];
        arr[first] = arr[secodnd];
        arr[secodnd] = temp;
    }
}
