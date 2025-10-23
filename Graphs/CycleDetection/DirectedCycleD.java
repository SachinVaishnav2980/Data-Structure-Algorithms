package Graphs.CycleDetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DirectedCycleD {

    //using DFS...

    public boolean isCyclicDFS(int V, int[][] edges) {

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int []e:edges){
            adj.get(e[0]).add(e[1]);
        }

        boolean path[]=new boolean[V];
        boolean visited[]=new boolean[V];

        for(int i=0;i<V;i++){
            if(dfs(i, path, visited, adj)) return true;
        }
        return false;
    }

    boolean dfs(int node, boolean []path, boolean []visited, List<List<Integer>> adj){
        path[node]=true;
        visited[node]=true;

        for(int i=0;i<adj.get(node).size();i++){
            if(path[adj.get(node).get(i)]) return true;

            if(!visited[adj.get(node).get(i)] && dfs(adj.get(node).get(i), path, visited, adj)) return true;
        }

        path[node]=false;
        return false;
    }

    //using BFS...
    public boolean isCyclic(int V, int[][] edges) {

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int []inDegree=new int[V];

        for(int []e:edges){
            adj.get(e[0]).add(e[1]);
            inDegree[e[1]]++;
        }

        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }

        int count=0;

        while (!queue.isEmpty()) {
            int node=queue.poll();
            count++;

            for(int j=0;j<adj.get(node).size();j++){
                inDegree[adj.get(node).get(j)]--;
                if(inDegree[adj.get(node).get(j)]==0){
                    queue.add(adj.get(node).get(j));
                }
            }
        }

        return count!=V;
    }
}
