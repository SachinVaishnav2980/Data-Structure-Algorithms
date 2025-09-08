import java.util.ArrayList;


public class Symmetric {
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

    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root, list);
        int n=list.size();
        for(int i=0;i<=n/2;i++){
            if(list.get(i)==list.get(n-1-i)){
                continue;
            }else{
                return false;
            }
        }
        return true;

    }

    void inorder(TreeNode node, ArrayList<Integer> list){
        if(node==null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}
