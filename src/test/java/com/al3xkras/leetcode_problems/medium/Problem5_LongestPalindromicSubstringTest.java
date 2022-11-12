package com.al3xkras.leetcode_problems.medium;

import org.junit.jupiter.api.Test;

import static com.al3xkras.leetcode_problems.medium.Problem5_LongestPalindromicSubstring.*;
import static org.junit.jupiter.api.Assertions.*;

class Problem5_LongestPalindromicSubstringTest {

    private static Solution solution = new Solution();
    @Test
    void test1(){
        String s = "babad";
        String pal = solution.longestPalindrome(s);
        assertEquals("aba",pal);
    }

    @Test
    void test2(){
        String s = "cbbd";
        String pal = solution.longestPalindrome(s);
        assertEquals("bb",pal);
    }

    @Test
    void test3(){
        String s = "aba";
        String pal = solution.longestPalindrome(s);
        assertEquals("aba",pal);
    }

}