import java.util.ArrayList;

public class NumberOStringASubstring {
    public static void main(String[] args) {
        String word = "abc";
        String []patterns = {"a","abc","bc","d"};
        // System.out.println(numOfStrings(patterns, word));
    }

    // public static int numOfStrings(String[] patterns, String word) {
        
    // }

    public static void subsets(String original, String modified, ArrayList<String> ans){
        if(original.isEmpty()){
            ans.add(modified);
        }
        subsets(original.substring(1), modified+original.charAt(0), ans);
        subsets(original.substring(1), modified, ans);
    }
}
