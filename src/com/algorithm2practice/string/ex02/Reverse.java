package com.algorithm2practice.string.ex02;

/**
 * Created by LeeeYou on 2016/3/13. 句子的逆序练习题
 * <p>
 * 对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
 * 给定一个原字符串A和他的长度，请返回逆序后的字符串。
 * 测试样例：
 * "dog loves pig",13
 * 返回："pig loves dog"
 */
public class Reverse {
    public static void main(String[] args){
       System.out.println(reverseSentence("dog loves pig",13));
       System.out.println(reverseSentence("I'm a Student.",14));
    }

    public static String reverseSentence(String A, int n) {
        if(n<=0)
            return null;

        char[] chars = A.toCharArray();
        reverse(chars);

        StringBuilder sb = new StringBuilder();
        String[] subStrings = String.copyValueOf(chars).split(" ");
        int subStringsLen = subStrings.length;
        for(int i = 0; i< subStringsLen; i++){
            char[] subChars = subStrings[i].toCharArray();
            reverse(subChars);
            sb.append(String.copyValueOf(subChars));

            if(i!= subStringsLen -1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void reverse(char[] chars){
        int subCharsLen = chars.length;
        int j=0;
        while (j<subCharsLen/2){
            swap(chars,j, subCharsLen -j-1);
            ++j;
        }
    }

    public static void swap(char[] chars ,int i,int j){
        chars[i] = (char) (chars[i] ^ chars[j]);
        chars[j] = (char) (chars[i] ^ chars[j]);
        chars[i] = (char) (chars[i] ^ chars[j]);
    }
}
