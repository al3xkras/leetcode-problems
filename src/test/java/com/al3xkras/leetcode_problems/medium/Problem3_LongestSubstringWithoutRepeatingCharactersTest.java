package com.al3xkras.leetcode_problems.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.al3xkras.leetcode_problems.medium.Problem3_LongestSubstringWithoutRepeatingCharacters.*;
import static org.junit.jupiter.api.Assertions.*;

class Problem3_LongestSubstringWithoutRepeatingCharactersTest {

    private Solution solution;

    @BeforeEach
    void setUp(){
        solution = new Solution();
    }

    @Test
    void test1(){
        String s = "abcabcbb";
        assertEquals(3,solution.lengthOfLongestSubstring(s));
    }

    @Test
    void test2(){
        String s = "bbbbb";
        assertEquals(1,solution.lengthOfLongestSubstring(s));
    }

    @Test
    void test3(){
        String s = "pwwkew";
        assertEquals(3,solution.lengthOfLongestSubstring(s));
    }

    @Test
    void test4(){
        String s = "dvdf";
        assertEquals(3,solution.lengthOfLongestSubstring(s));
    }

}