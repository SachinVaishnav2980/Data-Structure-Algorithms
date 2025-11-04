public class LexSmallestString {
    public static void main(String[] args) {
        
    }
    public String lexSmallest(String s) {
        int n = s.length();
        String res = s;  // initialize with original string

        for (int k = 1; k <= n; k++) {
            // Reverse first k
            String prefixRev = new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k);

            // Reverse last k
            String suffixRev = s.substring(0, n - k) + new StringBuilder(s.substring(n - k)).reverse().toString();

            // Compare and keep smallest
            if (prefixRev.compareTo(res) < 0) res = prefixRev;
            if (suffixRev.compareTo(res) < 0) res = suffixRev;
        }

        return res;
    }
}
