package Graphs.GraphTraversal;

import java.util.*;

public class BFSG {

    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> queue=new LinkedList<>();
        List<Integer> visited=new ArrayList<>();
        queue.add(0);
        visited.add(0);
        ArrayList<Integer> ans=new ArrayList<>();
        while (!queue.isEmpty()) {
            int curr=queue.poll();
            ans.add(curr);
            for(int i=0;i<adj.get(curr).size();i++){
                if(!visited.contains(adj.get(curr).get(i))){
                    visited.add(adj.get(curr).get(i));
                    queue.add(adj.get(curr).get(i));
                }
            }
        }
        return ans;
    }
}
