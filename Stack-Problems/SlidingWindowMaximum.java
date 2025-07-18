import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
//To initialize a Deque in Java, 
//one must use a concrete class that implements the Deque interface, 
//as Deque itself is an interface and cannot be directly instantiated. 
//The two most common implementing classes are ArrayDeque and LinkedList.
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int  []nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }


    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        Deque<Integer> queue=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!queue.isEmpty() && queue.getFirst()<=i-k){
                queue.removeFirst();
            }
            while (!queue.isEmpty() && nums[i]>=nums[queue.getLast()]) {
                queue.removeLast();
            }
            queue.addLast(i);
            if(i>=k-1) list.add(nums[queue.peekFirst()]);
        }
        int []ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }



    //O(k*(n-k)) Time Limit Exceeded
    // public static int[] maxSlidingWindow(int[] nums, int k) {
    //     ArrayList<Integer> list=new ArrayList<>();
    //     for(int i=0;i<=nums.length-k;i++){
    //         int max=Integer.MIN_VALUE;
    //         for(int j=i;j<=i+k-1;j++){
    //             max=Math.max(max, nums[j]);
    //         }
    //         list.add(max);
    //     }
    //     int []ans=new int[list.size()];
    //     int i=0;
    //     for(int element:list){
    //         ans[i]=element;
    //         i++;
    //     }
    //     return ans;
    // }
}
