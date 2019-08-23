package com.tinyxiong.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A_003_LengthOfLongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring1() {
        String s = "abcabcbb";
        int len = A_003_LengthOfLongestSubstring.lengthOfLongestSubstring(s);

        assertEquals(3, len);
    }

    @Test
    public void lengthOfLongestSubstring2() {
        String s = "bbbbb";
        int len = A_003_LengthOfLongestSubstring.lengthOfLongestSubstring(s);

        assertEquals(1, len);
    }

    @Test
    public void lengthOfLongestSubstring3() {
        String s = "pwwkew";
        int len = A_003_LengthOfLongestSubstring.lengthOfLongestSubstring(s);

        assertEquals(3, len);
    }

    @Test
    public void lengthOfLongestSubstring4() {
        String s = "abcdefgg123456789";
        int len = A_003_LengthOfLongestSubstring.lengthOfLongestSubstring(s);

        assertEquals(10, len);
    }
}