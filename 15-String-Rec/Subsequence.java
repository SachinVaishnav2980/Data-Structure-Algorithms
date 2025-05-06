//this code will create all the subsets of given string

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
       subSequence("", "abc");
    }

    //Normally print them-
    public static void subSequence(String modified, String original){
        if(original.isEmpty()){
            System.out.println(modified);
            return;
        }

        char ch=original.charAt(0);
        subSequence(modified+ch, original.substring(1));
        subSequence(modified, original.substring(1));
    }

    //In an arraylist-
    public static ArrayList<String> subSequenceList(String modified, String original){
        if(original.isEmpty()){
            ArrayList<String> powerset=new ArrayList<>();
            powerset.add(modified);
            return powerset;
        }

        char ch=original.charAt(0);
        ArrayList<String> left=subSequenceList(modified+ch, original.substring(1));
        ArrayList<String> right=subSequenceList(modified, original.substring(1));
        left.addAll(right);
        return left;
    }
}
