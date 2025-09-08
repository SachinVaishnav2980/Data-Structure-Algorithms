package TreeTraversal;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeBT {
    public static void main(String[] args) {
    }
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(){

        }

        public TreeNode(int val){
            this.val=val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


        public String serialize(TreeNode root){
            StringBuilder string=new StringBuilder();
            preorder(root, string);
            return string.toString();
        }

        public void preorder(TreeNode node,  StringBuilder string){
            if(node==null){
                string.append("null,");
                return ;
            }
            string.append(node.val).append(",");
            preorder(node.left, string);
            preorder(node.right, string);

        }

        public TreeNode deserialize(String data){
            if(data==null || data.isEmpty()) return null;
            
            String []values=data.split(",");
            Queue<String> queue=new LinkedList<>(Arrays.asList(values));
            return helper(queue);
        }        

        public TreeNode helper(Queue<String> queue){
            String val=queue.poll();
            if(val.equals("null")) return null;

            TreeNode node=new TreeNode(Integer.parseInt(val));
            node.left=helper(queue);
            node.right=helper(queue);
            return node;
        }
}
