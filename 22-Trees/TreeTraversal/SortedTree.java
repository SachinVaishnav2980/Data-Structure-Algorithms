package TreeTraversal;

public class SortedTree {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedBT(nums, 0,nums.length);
    }
        

    public TreeNode sortedBT(int []nums, int start, int end){
        if(start>=end) return null;

        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sortedBT(nums, start, mid);
        root.right=sortedBT(nums, mid+1, end);
        return root;
    }

}
