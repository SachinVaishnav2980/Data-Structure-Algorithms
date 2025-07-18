import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int []nums = {3, 5, 4, 2, 2, 5, 5, 4, 2, 5};
        System.out.println(Arrays.toString(Smallestonleft(nums, 10)));
        
    }

    public static int[] Smallestonleft(int arr[], int n) {
        // Complete the function
        int []ans=new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<arr.length; i++) {
            //popping condition
            while (!stack.isEmpty() && arr[i] <= stack.peek()) {
                stack.pop();
            }
            //Empty check
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{            // final check for conclusion
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
