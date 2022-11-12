package com.al3xkras.leetcode_problems.medium;

import java.util.HashSet;
import java.util.LinkedList;

public class Problem3_LongestSubstringWithoutRepeatingCharacters {

    static class Solution {
        private final HashSet<Character> charSet = new HashSet<>();
        private final LinkedList<Character> iter = new LinkedList<>();
        private void addCharacter(char c){
            charSet.add(c);
            iter.addFirst(c);
        }
        private void removeAllBeforeInclusive(char c){
            while (iter.getLast()!=c){
                char c1 = iter.removeLast();
                charSet.remove(c1);
            }
            charSet.remove(c);
            iter.removeLast();
        }
        private boolean containsChar(char c){
            return charSet.contains(c);
        }
        public int lengthOfLongestSubstring(String s) {
            int maxLen = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (containsChar(c)){
                    maxLen = Math.max(maxLen,iter.size());
                    removeAllBeforeInclusive(c);
                }
                addCharacter(c);
            }
            maxLen = Math.max(maxLen,iter.size());
            return maxLen;
        }
    }
}
