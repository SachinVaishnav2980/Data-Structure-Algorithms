package Graphs.Sorting;

import java.util.*;

public class TopoLogicalSort {

    // public ArrayList<Integer> topoSort(int V, int[][] edges) {
    //     ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    //     for(int i=0;i<V;i++){
    //         adj.add(new ArrayList<>());
    //     }

    //     for(int []e:edges){
    //         adj.get(e[0]).add(e[1]);  //Directed graph...
    //     }

    //     boolean visited[]=new boolean[V];  
    //     Stack<Integer> stack=new Stack<>();

    //     for(int i=0;i<V;i++){
    //         if(!visited[i]){
    //             dfs(0, adj, stack, visited);
    //         }
    //     }

    //     ArrayList<Integer> list=new ArrayList<>();
    //     while (!stack.isEmpty()) {
    //         list.add(stack.pop());
    //     }
    //     return list;
    // }

    // void dfs(int node, ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack, boolean visited[]){
    //     visited[node]=true;
    //     for(int i=0;i<adj.get(node).size();i++){
    //         int next=adj.get(node).get(i);
    //         if(!visited[next]){
    //             dfs(next, adj, stack, visited);
    //         }
    //     }
    //     stack.push(node);
    // }

    public ArrayList<Integer> topoSort(int V, int[][] edges) {

        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.pop();    
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int inDegree[] = new int[V];
        Queue<Integer> queue=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int []e:edges){
            adj.get(e[0]).add(e[1]);  //Directed graph...
            inDegree[e[1]]++;        // increase indegree of destination
        }

        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int curr=queue.poll();
            ans.add(curr);
            for(int i=0;i<adj.get(curr).size();i++){
                inDegree[adj.get(curr).get(i)]--;
                if(inDegree[adj.get(curr).get(i)]==0){
                    queue.add(adj.get(curr).get(i));
                }
            }
        }
        return ans;
    }
}
