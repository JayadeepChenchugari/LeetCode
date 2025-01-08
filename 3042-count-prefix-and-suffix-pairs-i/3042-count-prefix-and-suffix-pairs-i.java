import java.util.*;

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        int n = words.length;

        // Sort words by length to ensure shorter strings are compared first
        // Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if words[i] is both prefix and suffix of words[j]
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    // Helper function to check prefix and suffix
    public boolean isPrefixAndSuffix(String s1, String s2) {
        int l = s1.length();
        int m = s2.length();

        // If s1's length is greater than s2, it cannot be a prefix or suffix
        if (l > m) {
            return false;
        }

        // Check if s1 is both prefix and suffix of s2
        return s2.startsWith(s1) && s2.endsWith(s1);
    }
}
