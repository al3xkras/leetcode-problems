package com.al3xkras.leetcode_problems.medium;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem6_ZigzagConversion {

    static class Solution {
        public String convert(String s, int numRows) {
            if (numRows==1)
                return s;
            StringBuilder sb = new StringBuilder();
            for (int level = 0; level < numRows; level++) {
                int iter = 0;
                boolean reverse = false;
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (iter==level){
                        sb.append(c);
                    }
                    if (reverse){
                        if (iter==0){
                            reverse=false;
                            iter=1;
                        } else iter--;
                        continue;
                    }
                    if (iter==numRows-1){
                        reverse=true;
                        iter--;
                    } else iter++;
                }
            }
            return sb.toString();
        }
    }
}
