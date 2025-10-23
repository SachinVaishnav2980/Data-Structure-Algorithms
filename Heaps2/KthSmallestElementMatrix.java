package Heaps2;

import java.util.*;
class Pair<F, S> {
    F first;
    S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
}
}
public class KthSmallestElementMatrix {

    public static void main(String[] args) {
        int mat[][] ={{16, 28, 60, 64},
                {22, 41, 63, 91},
                {27, 50, 87, 93},
                {36, 78, 87, 94}};
        // int k=3;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.println(mat[i][j]);
            }
        }

    }
    public int kthSmallest(int[][] mat, int k) {
        List<Pair<Integer,Pair<Integer,Integer>>> list=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            list.add(new Pair<>(mat[i][0], new Pair<>(i, 0)));  
        }

        PriorityQueue<Pair<Integer, Pair<Integer,Integer>>> pq= new PriorityQueue<>((a, b) -> a.first - b.first);
        for (Pair<Integer, Pair<Integer,Integer>> p : list) {
        pq.add(p);
    }   
        int ans=0;
        while (k>0) {
            Pair<Integer,Pair<Integer,Integer>> element=pq.poll();
            ans=element.first;
            int i=element.second.first;
            int j=element.second.second;
            if(j+1<m){
                pq.add(new Pair<>(mat[i][j+1], new Pair<>(i, j+1)));
            }
            k--;
        } 
        return ans;
    }
}
