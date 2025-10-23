import java.util.*;

public class AvoidFlood {

    public int[] avoidFlood(int[] rains) {

        int n=rains.length;
        Map<Integer, Integer> lakesMap=new HashMap<>();
        TreeSet<Integer> zeroSet=new TreeSet<>();
        int []ans=new int[n];

        for(int i=0;i<n;i++){
            if(rains[i]==0){
                zeroSet.add(i);
                ans[i]=1;  //temp. value
            }else{
                ans[i]=-1;
                if(lakesMap.containsKey(rains[i])){
                    Integer dryDay=zeroSet.higher(lakesMap.get(rains[i]));  //TreeSet return Integer object not int.
                    if(dryDay==0) return new int[0];
                    ans[dryDay]=rains[i];
                    zeroSet.remove(dryDay);
                }
                    lakesMap.put(rains[i], i);
            }
        }
        return ans;
    }
}
