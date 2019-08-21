package com.tinyxiong.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Function: [2, 7, 11, 15], target = 9 return [0,1]
 *
 * @author crossoverJie
 *         Date: 02/12/2017 22:47
 * @since JDK 1.8
 */
public class A_001_TwoSum {

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for(int i =0; i<nums.length ;i++){

            for (int j = nums.length -1 ;j > 0 ;j-- ){

                if (nums[i] + nums[j] == target){
                    ret = new int[]{i, j};
                    return ret;
                }
            }
        }
        return ret ;
    }

    public int[] twoSum2(int[] sums, int target) {
        Map<Integer, Integer> elements = new LinkedHashMap<>();
        for (int i = 0; i < sums.length; i++) {
            int delta = target - sums[i];
            if (elements.containsKey(delta)) {
                return new int[]{elements.get(delta), i};
            }
            elements.put(sums[i], i);
        }
        throw new RuntimeException("No solution");
    }
}
