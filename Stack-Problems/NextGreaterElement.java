
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 5, 2, 4 };
        int[] nums2 = { 6, 5, 4, 3, 2, 1, 7 };
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    // public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     int val = 0;
    //     for (int i = 0; i < nums1.length; i++) {
    //         int element = nums1[i];
    //         val = findElement(nums1, nums2, element);
    //         ans.add(val);
    //     }
    //     for (int i = 0; i < ans.size(); i++) {
    //         nums1[i] = ans.get(i);
    //     }
    //     return nums1;
    // }

    // public static int findElement(int[] nums1, int[] nums2, int element) {
    //     for (int i = 0; i < nums2.length; i++) {
    //         if (nums2[i] == element) {
    //             int j = i + 1;
    //             while (j < nums2.length) {
    //                 if (nums2[j]>nums2[i]){
    //                     return nums2[j];
    //                 }j++;
    //             }
    //         }
    //     }
    //     return -1;
    // }

    //Using Stack+Map - O(n)
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        Map<Integer, Integer> nextGreater= new HashMap();
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && nums2[i]>stack.peek()){
                int smaller=stack.pop();
                nextGreater.put(smaller, nums2[i]);
            }
            stack.push(nums2[i]);
        }
        int []result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=nextGreater.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}
