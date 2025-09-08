package Heaps2;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinCostRope{
    
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int cost=0;
        while (pq.size()>1) {
            int rope=pq.peek();
            pq.poll();
            rope+=pq.peek();
            pq.poll();
            pq.add(rope);
            cost+=rope;
        }
        return cost;
         
    }

    public int nchoc(int A, int[] B) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<B.length;i++){
            maxHeap.add(B[i]);
        }
        int res=0;
        while(A>0 && !maxHeap.isEmpty()){
            res+=maxHeap.peek();
            if(maxHeap.peek()/2!=0){
                maxHeap.add(maxHeap.peek()/2);
            }
            maxHeap.poll();
            A--;
        }
        return res%((int)Math.pow(10, 7)+1);
    }
}