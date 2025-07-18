import java.util.*;

public class NgeArray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        System.out.println(Arrays.toString(ngeArray(arr)));
    }

    public static int[] ngeArray(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            //popping condition
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            //Empty check
            if(stack.isEmpty()){
                nge[i] = -1;
            }else{            // final check for conclusion
                nge[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return nge;
    }
}
