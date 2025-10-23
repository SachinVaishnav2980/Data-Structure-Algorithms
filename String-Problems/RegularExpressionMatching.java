import java.util.ArrayList;
import java.util.List;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        
    }

    public boolean isMatch(String s, String p) {
        return matchRec(s, p, 0, 0);       
    }

    boolean matchRec(String s, String p, int i, int j){
        if(i>=s.length() && j>=p.length()) return true;

        if(j>=p.length()) return false;
                                                                                                
        boolean match=i<s.length() && (s.charAt(i)==s.charAt(j) || p.charAt(j)=='.');

        if(j+1<p.length() && p.charAt(j+1)=='*'){
            return matchRec(s, p, i, j+2) || (match && matchRec(s, p, i+1, j));
        }

        if(match) matchRec(s, p, i+1, j+1);

        return false;
    }
}
