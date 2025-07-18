import java.util.Arrays;
import java.util.Stack;


public class NgeArray2 {
    public static void main(String[] args) {
        int []nums={2, 10, 12, 1, 11};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        //Monotonic stack of dec. order to store elements
        int []nge=new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=(2*nums.length)-1;i>=0;i--){ 
            //checking for popping condition with original index(not hypothetical)
            while (!stack.isEmpty() && nums[i%nums.length]>=stack.peek()) {
                stack.pop();
            }
            //main condition for making nge array
            if(i<nums.length){
                nge[i]=stack.isEmpty()?-1:stack.peek();
            }
            //must do step but after the nge array modification
            stack.push(nums[i%nums.length]);
        }
        return nge;
    }
}
