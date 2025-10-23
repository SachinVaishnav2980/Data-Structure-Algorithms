import java.util.*;

public class Majority {
    public static void main(String[] args) {
        
    } 

    public String majorityFrequencyGroup(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        Map<Integer, List<Character>> groupMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            char ch = entry.getKey();
            groupMap.computeIfAbsent(freq, k -> new ArrayList<>()).add(ch);
        }

        int maxGroupSize = 0;
        int chosenFreq = -1;

        for (Map.Entry<Integer, List<Character>> entry : groupMap.entrySet()) {
            int freq = entry.getKey();
            int groupSize = entry.getValue().size();

            if (groupSize > maxGroupSize || (groupSize == maxGroupSize && freq > chosenFreq)) {
                maxGroupSize = groupSize;
                chosenFreq = freq;
            }
        }

        List<Character> resultGroup = groupMap.get(chosenFreq);

        StringBuilder sb = new StringBuilder();
        for (char ch : resultGroup) {
            sb.append(ch);
        }

        return sb.toString();
    }
}

// Q3. Distinct Points Reachable After Substring Removal
// Q2. Climbing Stairs II
// Q3. Distinct Points Reachable After Substring Removal
// Q2. Split Array With Minimum Difference©leetcode
// Q3. Number of ZigZag Arrays I©leetcode
// Q4. Number of ZigZag Arrays II©leetcode
