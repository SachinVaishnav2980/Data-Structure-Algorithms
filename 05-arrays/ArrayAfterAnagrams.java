import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAfterAnagrams {
    public static void main(String[] args) {

    }

    // words = ["abba","baba","bbaa","cd","cd"]
        public List<String> removeAnagrams(String[] words) {
            List<String> ans=new ArrayList<>();
            String prevSorted="";
            for(String word:words){
                Char chars[]=word.toCharArray();
                Arrays.sort(chars);
                String sorted=new String(chars);

                if(!sorted.equals(prevSorted)){
                    ans.add(word);
                }

                prevSorted=sorted;
            }
            return ans;
        }
}