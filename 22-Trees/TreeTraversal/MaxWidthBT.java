package TreeTraversal;
import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthBT {
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

    class Pair{
        TreeNode node;
        long index;

        public Pair(TreeNode node, long index){
            this.node=node;
            this.index=index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        int width=0;
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(root, 0));
        while (!queue.isEmpty()) {
            int levelSize=queue.size();
            long minIndex=queue.peek().index;
            long firstIndex=0;
            long lastIndex=0;
            for(int i=0;i<levelSize;i++){
                Pair current = queue.poll();
                long currIndex = current.index-minIndex;
                TreeNode currNode = current.node;
                if(i==0) firstIndex=currIndex;
                if(i==levelSize-1) lastIndex=currIndex;
                if(currNode.left!=null){
                    queue.offer(new Pair(currNode.left, 2*currIndex));
                }
                if(currNode.right!=null){
                    queue.offer(new Pair(currNode.right, 2*currIndex+1));
                }
            }
            width=(int)Math.max(width, lastIndex-firstIndex+1);
        }
        return width;
    }


}
