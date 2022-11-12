package com.al3xkras.leetcode_problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.al3xkras.leetcode_problems.medium.Problem6_ZigzagConversion.*;

class Problem6_ZigzagConversionTest {
    static Solution solution = new Solution();

    @Test
    void test1(){
        String s = "PAYPALISHIRING";
        assertEquals("PAHNAPLSIIGYIR",solution.convert(s,3));
    }

    @Test
    void test2(){
        String s = "PAYPALISHIRING";
        assertEquals("PINALSIGYAHRPI",solution.convert(s,4));
    }

    @Test
    void test3(){
        String s = "A";
        assertEquals("A",solution.convert(s,1));
    }
}
