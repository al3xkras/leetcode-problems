package com.al3xkras.leetcode_problems.medium;

public class Problem5_LongestPalindromicSubstring {

    static class Solution {
        public String longestPalindrome(String s) {

            if (s.length() <= 1)
                return s;

            int len = s.length();
            boolean[][] palindromes = new boolean[len][len];

            for (int i = 0; i < len; i++) {
                palindromes[i][i] = true;
            }

            int palStart = 0;
            int palLength = 1;

            for (int i = len - 1; i >= 0; i--) {
                for (int dist = 1; dist < len - i; dist++) {
                    int j = dist + i;
                    boolean eq = s.charAt(i) == s.charAt(j);
                    palindromes[i][j] = (dist == 1) ? eq : eq && palindromes[i + 1][j - 1];
                    if (palindromes[i][j] && j - i + 1 > palLength) {
                        palLength = j - i + 1;
                        palStart = i;
                    }
                }
            }
            return s.substring(palStart,palStart+palLength);
        }
    }
}
