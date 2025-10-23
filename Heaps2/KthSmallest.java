import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        
    }

    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i<=k-1){
                pq.add(arr[i]);
                continue;
            }
            if(arr[i]<pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.poll();
        
    }

    static int[] kthLargest(int k, int[] arr, int n) {
        // code here
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i<k-1){
                list.add(-1);
                continue;
            }
            list.add(arr[i-(k-1)]);
        }
        int []nums=new int[n];
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return nums;
    }

    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
        // Your code goes here
        PriorityQueue<Long> p1=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> p2=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<A.length;i++){
            if(i<=K1-1){
                p1.add(A[i]);
                continue;
            }
            if(A[i]<p1.peek()){
                p1.poll();
                p1.add(A[i]);
            }
        }
        long sum1=0;
        while (!p1.isEmpty()) {
            sum1+=p1.poll();
        }

        for(int i=0;i<A.length;i++){
            if(i<=K2-2){
                p1.add(A[i]);
                continue;
            }
            if(A[i]<p1.peek()){
                p1.poll();
                p1.add(A[i]);
            }
        }
        long sum2=0;
        while (!p1.isEmpty()) {
            sum2+=p1.poll();
        }

        return Math.abs(sum1-sum2);


    }
}
