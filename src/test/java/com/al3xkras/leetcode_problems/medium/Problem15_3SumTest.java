package com.al3xkras.leetcode_problems.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static com.al3xkras.leetcode_problems.medium.Problem15_3Sum.*;

class Problem15_3SumTest {
    static Solution solution = new Solution();

    @Test
    void test1(){
        List<List<Integer>> list = solution.threeSum(-1,0,1,2,-1,-4);
        System.out.println(list);
    }

    @Test
    void test2(){
        List<List<Integer>> list = solution.threeSum(0,1,1);
        System.out.println(list);
    }

    @Test
    void test3(){
        List<List<Integer>> list = solution.threeSum(0,0,0,-1,-1,2);
        System.out.println(list);
    }

    @Test
    void test4(){
        List<List<Integer>> list = solution.threeSum(-1,-1,2);
        System.out.println(list);
    }

    @Test
    void test5(){
        List<List<Integer>> list = solution.threeSum(4,0,2,3,-1);
        System.out.println(list);
    }
}