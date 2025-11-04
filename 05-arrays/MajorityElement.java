import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //Space included
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

    //Without space
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            count+= (nums[i]==candidate)?1:-1;
        }
        return candidate;
    }
}
