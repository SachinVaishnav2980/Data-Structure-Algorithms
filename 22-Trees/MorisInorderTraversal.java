import java.util.ArrayList;
import java.util.List;

public class MorisInorderTraversal {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        TreeNode curr=root;

        while (curr!=null) {
            if(curr.left==null){
                list.add(curr.val);
                curr=curr.right;
            }else{
                TreeNode ip=curr.left;
                while (ip.right!=null && ip.right!=curr) {
                    ip=ip.right;
                }
                if(ip.right==null){
                    ip.right=curr;   //Thread creation
                    curr=curr.left;
                }else{
                    ip.right=null;  //Thread deletion
                    list.add(curr.val);
                    curr=curr.right;
                }

            }
        }
        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        TreeNode curr=root;

        while (curr!=null) {
            if(curr.left==null){
                list.add(curr.val);
                curr=curr.right;
            }else{
                TreeNode ip=curr.left;
                while (ip.right!=null && ip.right!=curr) {
                    ip=ip.right;
                }
                if(ip.right==null){
                    ip.right=curr;   //Thread creation
                    list.add(curr.val);
                    curr=curr.left;
                }else{
                    ip.right=null;  //Thread deletion
                    curr=curr.right;
                }
            }
        }
        return list;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curr=root;

        List<Integer> list=new ArrayList<>();

        while (curr!=null) {
            if(curr.left==null){
                list.add(curr.val);
                curr=curr.right;
            }else{
                TreeNode ip=curr.left;
                while (ip.right!=null && ip.right!=curr) {
                    ip=ip.right;
                }
                if(ip.right==null){
                    ip.right=curr;   //Thread creation
                    curr=curr.left;
                }else{
                    ip.right=null;   //Thread deletion
                    list.add(curr.val);
                    curr=curr.right;
                }
            }
        }
        return list;
    }
}
