import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKsortedArray {
    class Pair<F, S> {
    F first;
    S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
}
}
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
        PriorityQueue<Pair<Integer, Pair<Integer, Integer>>> pq=new PriorityQueue<>((a,b)->a.first-b.first);
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            // pq.add(new Pair<>(arr[i][0], new Pair<>(i, 0)));
        }

        ArrayList<Integer> list=new ArrayList<>();
        while (!pq.isEmpty()) {
            Pair<Integer,Pair<Integer,Integer>> p=pq.poll();
            int val=p.first;
            int i=p.second.first;
            int j=p.second.second;
            list.add(val);
            if(j+1<m){
                // pq.add(new Pair<>(arr[i][j+1], new Pair<>(i, j+1)));
            }
        }
        return list;
    }
}
