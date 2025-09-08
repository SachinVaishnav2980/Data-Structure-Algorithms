//find the length of the longest substring without duplicate characters.
public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int len=0;
        for(int i=0;i<s.length();i++){
            int j=0;
            if(s.charAt(i)==(s.charAt(j))){
                j++;
            }
            if(s.charAt(i)!=(s.charAt(j)) && s.charAt(j)!=s.charAt(j-1)){
                len++;
            }
        }
        return len;
    }
}
