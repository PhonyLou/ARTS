package com.gitbook.arts.sumTwo;

import org.springframework.stereotype.Service;

/**
 * Created by Phony on 2018/7/20.
 */
@Service
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int index1 = 0; index1 < nums.length - 1; index1 ++) {
            for (int index2 = index1 + 1; index2 < nums.length; index2 ++) {
                if (nums[index1] + nums[index2] == target) {
                    result[0] = index1;
                    result[1] = index2;
                }
            }
        }
        return result;
    }
}
