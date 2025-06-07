import java.util.*;
public class Subsequence {
    public static void main(String[] args) {
        String original="abc";
        // subSequence(original, "");
        System.out.println(subSequenceList(original, ""));

    }

    public static void subSequence(String original, String modified){
        if(original.isEmpty()){
            System.out.print(modified+" ");
            return ;
        }

        subSequence(original.substring(1), modified+original.charAt(0));
        subSequence(original.substring(1), modified);
    }

    public static ArrayList<String> subSequenceList(String original, String modified){
        if(original.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(modified);
            return list;
        }

        ArrayList<String> left=subSequenceList(original.substring(1), modified+original.charAt(0));
        ArrayList<String> right=subSequenceList(original.substring(1), modified);
        left.addAll(right);
        return left;
    }
}
