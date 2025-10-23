package Heaps2;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SuperUglyNumber {
    
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        Set<Long> set=new HashSet<>();
        pq.add(1L);
        long curr=1;
        while (n>0) {
            curr=pq.poll();
            n--;

            for(int i=0;i<primes.length;i++){
                if(!set.contains(curr*primes[i])){
                    pq.add((long)curr*primes[i]);
                    set.add((long)curr*primes[i]);
                }
            }
        }
        return (int)curr;
    }
}
