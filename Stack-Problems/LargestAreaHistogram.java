import java.util.Stack;
public class LargestAreaHistogram {
    public static void main(String[] args) {
        int [] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }

    // public int largestRectangleArea(int[] heights) {
    //      Stack<Integer> stack= new Stack<>();
    //      int max=0;
    //      stack.push(0);
    //      for(int i=1;i<heights.length;i++){
    //         while (!stack.isEmpty() && heights[i]<heights[stack.peek()]){
    //             max=getMax(heights, stack, max, i);
    //         }
    //         stack.push(i); 
    //      }
    //      int i=heights.length;
    //      while(!stack.isEmpty()){
    //         max=getMax(heights, stack, max, i);
    //      }

    //      return max;
    // }

    // private static int getMax(int []arr, Stack<Integer> stack, int max, int i){
    //     int area;
    //     int popped=stack.pop();
    //     if(stack.isEmpty()){
    //         area=arr[popped]*i;
    //     }else{
    //         area=arr[popped]*(i-1-stack.peek());
    //     }
    //     return Math.max(max,area);
    // }


    //Striver approach
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int nse=0;
        int pse=0;
        int element=0;
        int area=0;
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                nse=i;
                element=stack.pop();
                pse=stack.isEmpty()?-1:stack.peek();
                area=Math.max(area, heights[element]*(nse-pse-1));
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
                nse=heights.length;
                element=stack.pop();
                pse=stack.isEmpty()?-1:stack.peek();
                area=Math.max(area, heights[element]*(nse-pse-1));
            }

        return area;
    }

}
