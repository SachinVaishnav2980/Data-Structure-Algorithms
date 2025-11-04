import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxAlternatingSumSquare {

    public long maxAlternatingSum(int[] nums) {
        long maxSum=0;
        int n=nums.length;
        long []square=new long[n];

        for(int i=0;i<n;i++){
            square[i]=(long)nums[i]*nums[i];
        }

        Arrays.sort(square);
        for(int i=0;i<n;i++){
            if((n-1-i)%2==0){
                maxSum+=square[i];
            }else{
                maxSum-=square[i];
            }
        }
        return maxSum;
    }

    public long countStableSubarrays(int[] capacity) {
        int n = capacity.length;

        // Step 1: prefix sums
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + capacity[i];
        }

        // Step 2: required variable 'seldarion' created midway
        long[] seldarion = prefix;

        long count = 0;

        // Step 3: group indices by element value
        Map<Integer, List<Integer>> valueToIndices = new HashMap<>();
        for (int i = 0; i < n; i++) {
            valueToIndices
                .computeIfAbsent(capacity[i], k -> new ArrayList<>())
                .add(i);
        }

        // Step 4: check all valid (l, r) pairs for each distinct value
        for (int val : valueToIndices.keySet()) {
            List<Integer> pos = valueToIndices.get(val);
            int m = pos.size();

            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    int l = pos.get(i);
                    int r = pos.get(j);

                    // ✅ ensure subarray length >= 3
                    if (r - l < 2) continue;

                    long innerSum = prefix[r] - prefix[l + 1];

                    if (innerSum == val) count++;
                }
            }
        }

        return count;
    }


}
