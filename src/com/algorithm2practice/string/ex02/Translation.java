package com.algorithm2practice.string.ex02;

/**
 * Created by LeeeYou on 2016/3/13. 字符串移位练习题
 * <p>
 * 对于一个字符串，请设计一个算法，将字符串的长度为len的前缀平移到字符串的最后。
 * 给定一个字符串A和它的长度，同时给定len，请返回平移后的字符串。
 * 测试样例：
 * "ABCDE",5,3
 * 返回："DEABC"
 */
public class Translation {

    public static void main(String[] args) {
        System.out.println(String.valueOf(stringTranslation("sostupid", 8, 2)));
        System.out.println(String.valueOf(stringTranslation("WQ", 2, 1)));
    }

    public static String stringTranslation(String A, int n, int len) {
        if (n == 1)
            return A;

        if (len <= 0 || len > n - 1)
            return A;

        char[] chars = A.toCharArray();

        reverse(chars, 0, len - 1);
        reverse(chars, len, n - 1);
        reverse(chars, 0, n - 1);

        return String.valueOf(chars);
    }

    public static void reverse(char[] chas, int start, int end) {
        char tmp;
        while (start < end) {
            tmp = chas[start];
            chas[start] = chas[end];
            chas[end] = tmp;
            start++;
            end--;
        }
    }

}
