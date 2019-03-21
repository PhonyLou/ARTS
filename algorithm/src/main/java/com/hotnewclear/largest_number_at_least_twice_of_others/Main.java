package com.hotnewclear.largest_number_at_least_twice_of_others;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{3, 6, 1, 0};
        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] nums3 = new int[]{};
        int[] nums4 = new int[]{0};
        int[] nums5 = new int[]{1};
        int[] nums6 = new int[]{1, 2};
        int[] nums7 = new int[]{2, 1};
        System.out.println(s.dominantIndex(nums));
        System.out.println(s.dominantIndex(nums2));
        System.out.println(s.dominantIndex(nums3));
        System.out.println(s.dominantIndex(nums4));
        System.out.println(s.dominantIndex(nums5));
        System.out.println(s.dominantIndex(nums6));
        System.out.println(s.dominantIndex(nums7));
    }
}
