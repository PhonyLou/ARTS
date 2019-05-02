package com.hotnewclear.palindrome;

/**
 * This class is used to perform palindrome checking
 *
 * Created by louqilin on 2019/5/2.
 */
class Solution {
    public boolean isPalindrome(int x) {
        String data = String.valueOf(x);
        char[] dataArr = data.toCharArray();
        int middle = dataArr.length / 2;

        boolean result = true;

        for (int headIndex=0, tailIndex = dataArr.length - 1; headIndex < middle; headIndex++, tailIndex--) {
            if (dataArr[headIndex] != dataArr[tailIndex]) {
                return false;
            }
        }
        return result;
    }
}
