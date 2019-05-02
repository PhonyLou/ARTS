package com.hotnewclear.palindrome;

/**
 * Created by louqilin on 2019/5/2.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int testData = 0;
        checkPalindrome(testData, solution);
        testData = 121;
        checkPalindrome(testData, solution);
        testData = 2;
        checkPalindrome(testData, solution);
        testData = 10;
        checkPalindrome(testData, solution);
        testData = 121;
        checkPalindrome(testData, solution);
        testData = 22;
        checkPalindrome(testData, solution);
        testData = -10;
        checkPalindrome(testData, solution);
        testData = -121;
        checkPalindrome(testData, solution);
    }

    private static void checkPalindrome(int testData, Solution solution) {
        boolean isPalindrome = solution.isPalindrome(testData);
        System.out.println("test data is " + testData + ", it is palindrome? " + isPalindrome);
    }
}
