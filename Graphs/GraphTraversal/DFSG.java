package Graphs.GraphTraversal;

import java.util.ArrayList;

public class DFSG {

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> visited=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int node=0;
        DepthFirstSearch(node, adj, visited, ans);
        return ans;
        
    }

    void DepthFirstSearch(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> visited, ArrayList<Integer> ans){
        visited.add(node);
        ans.add(node);
        for(int i=0;i<adj.get(node).size();i++){
            if(!visited.contains(adj.get(node).get(i))){
                DepthFirstSearch(adj.get(node).get(i), adj, visited, ans);
            }
        }
    }
}
