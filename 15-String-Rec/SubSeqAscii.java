import java.util.ArrayList;

public class SubSeqAscii {
    public static void main(String[] args) {
        // subSeqAscii("", "abc");
        System.out.println(subSequenceAsciiList("", "abc"));
    }

    public static void subSeqAscii(String modified, String original){
        if(original.isEmpty()){
            System.out.println(modified);
            return ;
        }
        char ch=original.charAt(0);
        subSeqAscii(modified+ch, original.substring(1));
        subSeqAscii(modified, original.substring(1));
        subSeqAscii(modified+(ch+0), original.substring(1));
    }

    public static ArrayList<String> subSequenceAsciiList(String modified, String original){
        if(original.isEmpty()){
            ArrayList<String> powerset=new ArrayList<>();
            powerset.add(modified);
            return powerset;
        }

        char ch=original.charAt(0);
        ArrayList<String> left=subSequenceAsciiList(modified+ch, original.substring(1));
        ArrayList<String> right=subSequenceAsciiList(modified, original.substring(1));
        ArrayList<String> first=subSequenceAsciiList(modified+(ch+0), original.substring(1));
        left.addAll(right);
        left.addAll(first);
        return left;
    }
}
