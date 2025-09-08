package Heaps2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class ProfitMaximization {
    public static void main(String[] args) {
    }

    public int solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int element:A){
            pq.add(element);
        }
        int maxProfit=0;
        while (B>0) {
            int profit=pq.poll();
            maxProfit+=profit;
            profit--;
            pq.add(profit);
            B--;
        }
        return maxProfit;
    }
}
