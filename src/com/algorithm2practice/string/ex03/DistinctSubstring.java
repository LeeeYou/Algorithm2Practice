package com.algorithm2practice.string.ex03;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LeeeYou on 2016/3/14. 最长无重复字符子串练习题
 * <p>
 * 对于一个字符串,请设计一个高效算法，找到字符串的最长无重复字符的子串长度。
 * 给定一个字符串A及它的长度n，请返回它的最长无重复字符子串长度。保证A中字符全部为小写英文字符，且长度小于等于500。
 * 测试样例：
 * "aabcb",5
 * 返回：3
 */
public class DistinctSubstring {

    public static void main(String[] args) {
        System.out.println(longestSubstring("spnvw", 5));
        System.out.println(longestSubstring("rfrxkfrb", 8));
    }

    public static int longestSubstring(String A, int n) {
        if (A == null || A.equals(" ") || n <= 0) {
            return 0;
        }

        char[] chars = A.toCharArray();
        int[] map = new int[256];//保存字符上次出现的位置
        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }

        int len = 0;
        int pre = -1;//记录 chars[i-1] 位置的字符上次重复出现的位置
        int cur = 0;//记录当前最长无重复字符串长度

        for (int i = 0; i < chars.length; i++) {
            pre = Math.max(pre, map[chars[i]]);
            cur = i - pre;
            len = Math.max(len, cur);
            map[chars[i]] = i;
        }

        return len;
    }

}
