

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = { 4,2,0,3,2,5 };
        System.out.println(trap(height));
    }

    // public static int trap(int[] height) {
    //     int[] leftMax = new int[height.length];
    //     int[] rightMax = new int[height.length];
    //     int max = 0;
    //     for (int i = 0; i < height.length; i++) {
    //         leftMax[i] = Math.max(height[i], max);
    //         max = leftMax[i];
    //     }
    //     int max2 = 0;
    //     for (int i = height.length - 1; i >= 0; i--) {
    //         rightMax[i] = Math.max(height[i], max2);
    //         max2 = rightMax[i];
    //     }
    //     int units=0;
    //     for(int i=0;i<height.length;i++){
    //         if (height[i]<leftMax[i] && height[i]<rightMax[i]) {
    //             units+=Math.min(leftMax[i], rightMax[i])-height[i];
    //         }
    //     }
    //     return units;
    // }

    public static int trap(int[] height) {
        int leftMax=0;
        int rightMax=0;
        int total=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            if(height[l]<height[r]){
                if(leftMax>height[l]){
                    total+=leftMax-height[l];
                }else{
                    leftMax=height[l];
                }
                l+=1;
            }else{
                if(rightMax>height[r]){
                    total+=rightMax-height[r];
                }else{
                    rightMax=height[r];
                }
                r-=1;
            }
        }
        return total;
    }
}
