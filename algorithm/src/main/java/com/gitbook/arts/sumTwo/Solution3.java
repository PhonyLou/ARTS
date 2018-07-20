package com.gitbook.arts.sumTwo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Phony on 2018/7/20.
 */
@Service
public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        /**
         * Key = nums' value
         * Value = nums' index
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
