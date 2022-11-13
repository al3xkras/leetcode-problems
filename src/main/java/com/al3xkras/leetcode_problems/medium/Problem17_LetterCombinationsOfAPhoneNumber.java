package com.al3xkras.leetcode_problems.medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem17_LetterCombinationsOfAPhoneNumber {

    static class Solution {
        private static final Map<Character,String> nums = new HashMap<>();
        static {
            nums.put('2',"abc");
            nums.put('3',"def");
            nums.put('4',"ghi");
            nums.put('5',"jkl");
            nums.put('6',"mno");
            nums.put('7',"pqrs");
            nums.put('8',"tuv");
            nums.put('9',"wxyz");
        }
        public List<List<Integer>> iterate(int loopId, int minIndex, int maxIndex){
            if (loopId==0){
                return IntStream.rangeClosed(minIndex,maxIndex)
                        .mapToObj(x->{
                            LinkedList<Integer> out = new LinkedList<>();
                            out.add(x);
                            return out;
                        })
                        .collect(Collectors.toCollection(LinkedList::new));
            } else {
                List<List<Integer>> out = new LinkedList<>();
                for (int i = minIndex+1; i <= maxIndex; i++) {
                    List<List<Integer>> l = iterate(loopId-1, i, maxIndex);
                    int finalI = i-1;
                    l.forEach(lst-> lst.add(finalI));
                    out.addAll(l);
                }
                return out;
            }
        }

        public List<String> letterCombinations(String digits) {
            String letters = digits.chars().sorted().mapToObj(c->nums.get((char)c))
                    .collect(Collectors.joining());
            System.out.println(letters);
            return iterate(digits.length() - 1, 0, letters.length() - 1).stream()
                    .map(l -> {
                        StringBuilder sb = new StringBuilder();
                        l.forEach(i -> sb.append(letters.charAt(i)));
                        return sb.toString();
                    }).toList();
        }
    }

}
