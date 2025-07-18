import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String [] words = {"jump","run","run","jump","run"};
        System.out.println(Arrays.toString(longestcommonPrefix(words)));
    }

        public static int[] longestcommonPrefix(String[] words) {
            int []ans=new int[words.length];
            for(int i=0;i<words.length;i++){
                for(int j=i+1;j<words.length;j++){
                    if(j<words.length-1){
                        if(words[j].equals(words[j+1])){
                        ans[i]=words[j].length();
                        }
                    }
                }
            }
            return ans;
    }
}
