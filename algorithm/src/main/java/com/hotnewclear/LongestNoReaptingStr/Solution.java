package com.hotnewclear.LongestNoReaptingStr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by louqilin on 2019/3/14.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        int longest = 0;
        int currentLongest = 0;
        int currentHead = 0;
        Map<String, Integer> charMap = new HashMap<>();
        String[] strArr = s.split("");
        for (int i=currentHead; i < strArr.length; ) {
            if (null != charMap.get(strArr[i])) {
                currentLongest = 0;
                charMap.clear();
                i = ++currentHead;
            } else {
                charMap.put(strArr[i], i);
                currentLongest++;
                if (currentLongest > longest) {
                    longest = currentLongest;
                }
                i++;
            }

        }
        if (charMap.size() == s.length()) {
            return s.length();
        }
        return longest;
    }
}
