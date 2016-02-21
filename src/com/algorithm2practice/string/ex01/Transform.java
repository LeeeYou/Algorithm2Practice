package com.algorithm2practice.string.ex01;

/**
 * Created by liuzhif on 16/2/21.
 * <p>
 * 对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。
 * 给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。
 * 测试样例：
 * "abc",3,"bca",3
 * 返回：true
 */
public class Transform {

    public boolean chkTransform(String A, int lena, String B, int lenb) {
        if (lena != lenb)
            return false;

        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();

        int tempA = 0, tempB = 0;
        for (int i = 0; i < lena; i++) {
            tempA += String.valueOf(charsA[i]).hashCode();
            tempB += String.valueOf(charsB[i]).hashCode();
        }

        return tempA == tempB;


    }


}
