package com.tinyxiong.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * "abcabcbb" 3
 * "bbbbb" 1
 * "pwwkew" 3
 */
class A_003_LengthOfLongestSubstring {

    static int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) return 0;
        Map<Character, Integer> m = new HashMap<>(s.length());
        char[] chars = s.toCharArray();
        String sub = s;
        int len = 0;
        while (sub.length() > len) {
            System.out.println("sub len: " + sub.length() + ", len: " + len);
            int curLen = 0;
            for (int i = 0; i < chars.length; i++) {
                if (m.get(chars[i]) != null) {
                    sub = sub.substring(m.get(chars[i]) + 1);
                    chars = sub.toCharArray();
                    if (len < curLen) {
                        len = curLen;
                    }
                    m.clear();
                    break;
                }
                m.put(chars[i], i);
                curLen++;
            }
            if (len < curLen) {
                len = curLen;
            }
        }
        return len;
    }

    static int lengthOfLongestSubstring2(String s) {
        Set<Character> set = new HashSet<>(s.length());
        int i = 0, j = 0, ret = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                ret = Math.max(ret, j - i + 1);
                set.add(s.charAt(j++));
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ret;
    }
}
