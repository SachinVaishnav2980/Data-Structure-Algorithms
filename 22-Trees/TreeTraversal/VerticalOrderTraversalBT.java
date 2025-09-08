package TreeTraversal;
import java.util.*;

public class VerticalOrderTraversalBT {
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
        int col;
        int row;

        public Pair(TreeNode node, int col, int row){
            this.node=node;
            this.col=col;
            this.row=row;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        TreeMap<Integer, ArrayList<int[]>> map=new TreeMap<>();
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(root, 0, 0));
        while (!queue.isEmpty()) {
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                Pair currPair=queue.poll();
                int col=currPair.col;
                int row=currPair.row;
                TreeNode currNode=currPair.node;
                if(currNode!=null){
                    if(!map.containsKey(col)){
                        map.put(col, new ArrayList<>());
                    }
                }
                map.get(col).add(new int[]{row, currNode.val});

                if(currNode.left!=null){
                    queue.offer(new Pair(currNode.left, col-1, row+1));
                }

                if(currNode.right!=null){
                    queue.offer(new Pair(currNode.right, col+1, row+1));
                }   
            }        
        }

        for(int col: map.keySet()){
            List<int[]> list=map.get(col);
            Collections.sort(list, (a,b)->{
                if(a[0]==b[0]) return a[1]-b[1];
                return a[0]-b[0];
            });

            List<Integer> colVals = new ArrayList<>();
            for(int []entry: list){
                colVals.add(entry[1]);
            }
            ans.add(colVals);
        }
        return ans;
    }
}
