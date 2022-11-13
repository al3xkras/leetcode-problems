package com.al3xkras.leetcode_problems.medium;

import com.al3xkras.leetcode_problems.medium.Problem17_LetterCombinationsOfAPhoneNumber.Solution;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static com.al3xkras.leetcode_problems.medium.Problem17_LetterCombinationsOfAPhoneNumber.*;

class Problem17_LetterCombinationsOfAPhoneNumberTest {
    static Solution solution = new Solution();
    @Test
    void testIterate(){
        List<List<Integer>> out = solution.iterate(3,0,4);
        System.out.println(out);
    }

    @Test
    void test1(){
        System.out.println(solution.letterCombinations("2369"));
    }
}