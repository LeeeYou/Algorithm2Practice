package com.algorithm2practice.string.ex03;

/**
 * Created by LeeeYou on 2016/3/14. 合法括号序列判断练习题
 * <p>
 * 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
 * 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
 * 测试样例：
 * "(()())",6
 * 返回：true
 * 测试样例：
 * "()a()()",7
 * 返回：false
 * 测试样例：
 * "()(()()",7
 * 返回：false
 */
public class Parenthesis {

    public boolean chkParenthesis(String A, int n) {
        char[] chars = A.toCharArray();
        int num = 0;
        for (char c : chars) {
            if (c == '(') {
                num++;
            }
            if (c == ')' && --num < 0) {
                return false;
            }

            if (c != '(' && c != ')') {
                return false;
            }
        }

        return num == 0;
    }

}
