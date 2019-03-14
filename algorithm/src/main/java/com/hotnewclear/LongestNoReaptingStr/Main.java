package com.hotnewclear.LongestNoReaptingStr;

/**
 * Created by louqilin on 2019/3/14.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("abcabcbb == " + s.lengthOfLongestSubstring("abcabcbb"));
        System.out.println("bbbbb == " + s.lengthOfLongestSubstring("bbbbb"));
        System.out.println("pwwkew == " + s.lengthOfLongestSubstring("pwwkew"));
        System.out.println("au == " + s.lengthOfLongestSubstring("au"));
        System.out.println("aab == " + s.lengthOfLongestSubstring("aab"));

    }
}
