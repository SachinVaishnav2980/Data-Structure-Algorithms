
import java.util.ArrayList;
public class PermutationString {
    public static void main(String[] args) {
        permutation("", "abc");
        ArrayList<String> ans=permutationList("", "abc");
        System.out.println(ans);
        System.out.println(permutationCount("", "abc"));
    }

    //display the permutations-
    public static void permutation(String modified, String original){
        if(original.isEmpty()){
            System.out.println(modified);
            return ;
        }

        char ch=original.charAt(0);
        for(int i=0;i<=modified.length();i++){
            String first=modified.substring(0, i);
            String last=modified.substring(i,modified.length());
            permutation(first+ch+last, original.substring(1));
        }
    }

    //return a list of permutation-
    public static ArrayList<String> permutationList(String modified, String original){
        if(original.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(modified);
            return list;
        }

        char ch=original.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=modified.length();i++){
            String first=modified.substring(0, i);
            String last=modified.substring(i,modified.length());
            ans.addAll(permutationList(first + ch + last, original.substring(1)));
        }
        return ans;
    }

    //count the permutation-
    public static int permutationCount(String modified, String original){
        if(original.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=original.charAt(0);
        for(int i=0;i<=modified.length();i++){
            String first=modified.substring(0, i);
            String last=modified.substring(i,modified.length());
            count=count+permutationCount(first+ch+last, original.substring(1));
        }
        return count;
    }
}
