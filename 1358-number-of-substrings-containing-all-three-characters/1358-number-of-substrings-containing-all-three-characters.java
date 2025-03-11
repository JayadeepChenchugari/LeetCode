import java.util.*;

class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int left = 0;
        int[] freq = new int[3]; // To store count of 'a', 'b', 'c'
        
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;

            // Move left until all three characters are present
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += s.length() - right; // Count all substrings from left to end
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }
}
