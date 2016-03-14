package com.algorithm2practice.string.ex02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by LeeeYou on 2016/3/13. 拼接最小字典序练习题
 * <p>
 * 对于一个给定的字符串数组，请找到一种拼接顺序，使所有小字符串拼接成的大字符串是所有可能的拼接中字典序最小的。
 * 给定一个字符串数组strs，同时给定它的大小，请返回拼接成的串。
 * 测试样例：
 * ["abc","de"],2
 * "abcde"
 */
public class Prior {
    public static void main(String[] args){
        String[] s = {"ac","aa","ee","ad","aa"};
        System.out.println(findSmallest(s,5));
    }

    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return (s1 + s2).compareTo(s2 + s1);
        }
    }

    public static String findSmallest(String[] strs, int n) {
        if (strs == null || strs.length <= 0)
            return null;

        Arrays.sort(strs, new MyComparator());
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }

        return sb.toString();
    }
}
