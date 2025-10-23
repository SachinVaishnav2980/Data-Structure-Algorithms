package Graphs.CycleDetection;

import java.util.*;


public class CycleD {

    //Using DFS, TC:0(V+E), SC:O(V)
    // public boolean isCycle(int V, int[][] edges) {
    //     List<List<Integer>> adj=new ArrayList<>();
    //     for(int i=0;i<V;i++){
    //         adj.add(new ArrayList<>());
    //     }

    //     for(int []e:edges){
    //         adj.get(e[0]).add(e[1]);
    //         adj.get(e[1]).add(e[0]);
    //     }

    //     Set<Integer> visited=new HashSet<>();
    //     for(int i=0;i<V;i++){
    //         if(!visited.contains(i)){
    //             if(dfs(i, -1, adj, visited)){
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;
    // }

    // boolean dfs(int node, int parent, List<List<Integer>> adj, Set<Integer> visited){
    //     visited.add(node);

    //     for(int i=0;i<adj.get(node).size();i++){
    //         if(adj.get(node).get(i)==parent) continue; // skip this node
    //         if(visited.contains(adj.get(node).get(i))) return true;  //cycle present
    //         if(dfs(adj.get(node).get(i), node, adj, visited)){
    //             return true;
    //         }
    //     }

    //     return false;
    // }

    //Using BFS
    class Pair{
        int vertex;
        int parent;

        public Pair(int vertex, int parent){
            this.vertex=vertex;
            this.parent=parent;
        }
    }

    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int []e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        Set<Integer> visited=new HashSet<>();
        for(int i=0;i<V;i++){
            if(!visited.contains(i)){
                if(bfs(i, adj, visited)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean bfs(int node, List<List<Integer>> adj, Set<Integer> visited){
        
        Queue<Pair> queue=new LinkedList<>();
        visited.add(node);

        queue.add(new Pair(node, -1));
        while (!queue.isEmpty()) {
            int curr=queue.peek().vertex;
            int parent=queue.peek().parent;

            queue.poll();

            for(int i=0;i<adj.get(curr).size();i++){
                if(adj.get(curr).get(i)==parent) continue;
                if(visited.contains(adj.get(curr).get(i))) return true;
                visited.add(adj.get(curr).get(i));
                queue.add(new Pair(adj.get(curr).get(i), curr));
            }
        }
        return false;
    }

}
