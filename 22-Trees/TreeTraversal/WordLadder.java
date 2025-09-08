package TreeTraversal;
import java.util.*;

public class WordLadder {
    public static void main(String[] args) {

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }

        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        Set<String> visited = new HashSet<>();
        beginSet.add(beginWord);
        endSet.add(endWord);
        int length = 1;
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {

            if (beginSet.size() > endSet.size()) {
                Set<String> temp = beginSet;
                beginSet = endSet;
                endSet = temp;
            }
            Set<String> nextLevel = new HashSet<>();
            for (String word : beginSet) {
                char[] wordChars = word.toCharArray();
                for (int i = 0; i < wordChars.length; i++) {
                    char originalChar = wordChars[i];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == originalChar)
                            continue;
                        wordChars[i] = ch;
                        String newWord = new String(wordChars);
                        if (endSet.contains(newWord)) {
                            return length + 1;
                        }
                        if (wordList.contains(newWord) && !visited.contains(newWord)) {
                            nextLevel.add(newWord);
                            visited.add(newWord);
                        }
                    }
                    wordChars[i] = originalChar;
                }
            }
            beginSet = nextLevel;
            length++;
        }
        return 0;
    }
}
