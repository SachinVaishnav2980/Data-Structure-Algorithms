package Heaps2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestStream {

    class KthLargest {
        int k;
        PriorityQueue<Integer> pq;        

    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>();
        for(int element:nums){
            add(element);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k){
            pq.poll()
        }
        return pq.peek();
    }
} 
}
