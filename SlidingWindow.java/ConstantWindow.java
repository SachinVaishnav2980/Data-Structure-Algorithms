public class ConstantWindow {
    public static void main(String[] args) {
        int[] arr = { -1, 2, 3, 3, 4, 5, -1 };
        int k = 4;
        System.out.println(longestSum(arr, k));
    }

    public static int longestSum(int[] arr, int k) {
        int left = 0;
        int right = k - 1;
        int sum = 0;
        int MaxSum=0;
        while (right < arr.length) {
            for (int i = left; i <= right; i++) {
                sum = sum + arr[left];
            }
            MaxSum=Math.max(MaxSum, sum);
            left++;
            right++;
            sum=0;
        }
        return MaxSum;
    }
}
