public class EqualStrings {
    public static void main(String[] args) {
        String []word1 = {"ab", "c"};
        String []word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String next1=String.join("",word1);
        String next2=String.join("",word2);
        if(next1.equals(next2)) return true;
        return false;
    }
}
