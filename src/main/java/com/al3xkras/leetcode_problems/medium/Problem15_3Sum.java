package com.al3xkras.leetcode_problems.medium;

import java.util.*;

public class Problem15_3Sum {
    static class Solution {
        public List<List<Integer>> threeSum(int... nums) {
            Set<List<Integer>> out = new HashSet<>();
            if (nums.length<3)
                return Collections.emptyList();

            Arrays.sort(nums);
            int start = 0;
            int end = nums.length-1;

            while (end-start>=2){
                int numStart = nums[start];
                int numEnd = nums[end];
                if (Math.abs(numStart)>Math.abs(numEnd)){
                    for (int i = start+1; i <= end; i++) {
                        int k = Arrays.binarySearch(nums,start+1,end+1,-numStart-nums[i]);
                        if (k<0)
                            continue;
                        if ((k==i && k!=0 && nums[k-1]!=nums[k]) ||
                                k>i)
                            continue;
                        out.add(Arrays.asList(numStart,nums[i],nums[k]));
                    }
                    start++;
                } else {
                    for (int i = start; i <= end-1; i++) {
                        int k = Arrays.binarySearch(nums,start,end,-numEnd-nums[i]);
                        if (k<0)
                            continue;
                        if ((k==i && k!=0 && nums[k-1]!=nums[k]) || k>i)
                            continue;
                        out.add(Arrays.asList(numStart,nums[i],nums[k]));
                    }
                    end--;
                }
            }
            return new LinkedList<>(out);
        }
    }
}
