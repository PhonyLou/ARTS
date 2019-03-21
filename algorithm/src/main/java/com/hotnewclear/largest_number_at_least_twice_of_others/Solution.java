package com.hotnewclear.largest_number_at_least_twice_of_others;

class Solution {
    public int dominantIndex(int[] nums) {
        int indexNumIndex = -1;
        int maxVal = 0;
        int secondVal = 0;
        if (nums.length == 1)
            return 0;
        for (int i = 0, len = nums.length; len > 1 && i < len; i++) {
            if (nums[i] > maxVal) {
                secondVal = maxVal;
                maxVal = nums[i];
                indexNumIndex = i;
            } else if (nums[i] > secondVal){
                secondVal = nums[i];
            }
        }

        if (maxVal >= secondVal * 2) {
            return indexNumIndex;
        }
        return -1;
    }
}