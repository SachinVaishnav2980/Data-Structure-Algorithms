import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ParitionString {
    public static void main(String[] args) {
        String s = "abbccccd";
        System.out.println(partitionString(s));
    }

    public static List<String> partitionString(String s) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

    int start = 0;
    int n = s.length();

    while (start < n) {
        StringBuilder sb = new StringBuilder();
        int end = start;
        while (end < n) {
            sb.append(s.charAt(end));
            String current = sb.toString();
            if (!set.contains(current)) {
                list.add(current);
                set.add(current);
                break;
            }
            end++;
        }
        start = end + 1;
    }

    return list;

    }
}
