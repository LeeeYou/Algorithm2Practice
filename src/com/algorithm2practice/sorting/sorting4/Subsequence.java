package com.algorithm2practice.sorting.sorting4;

/**
 * Created by leeyou on 2016/2/19.
 * <p>
 * 对于一个数组，请设计一个高效算法计算需要排序的最短子数组的长度。
 * 给定一个int数组A和数组的大小n，请返回一个二元组，代表所求序列的长度。(原序列位置从0开始标号,若原序列有序，返回0)。保证A中元素均为正整数。
 * 测试样例：
 * [1,4,6,5,9,10],6
 * 返回：2
 */
public class Subsequence {

    public static void main(String[] args) {
        int[] A = {1, 4, 6, 5, 9, 10};

        System.out.printf(String.valueOf(shortestSubsequence(A, A.length)));
    }

    public static int shortestSubsequence(int[] A, int n) {
        int max = A[0];
        int rightIndex = n - 1;
        for (int i = 0; i < n; i++) {//从左到右，找到最右边小于最大数的下标
            if (A[i] >= max) {
                max = A[i];
            } else {
                rightIndex = i;
            }
        }

        int min = A[n - 1];
        int leftIndex = 0;
        for (int i = n - 1; i >= 0; i--) {//从右到左，找到最左边大于最小数的下标
            if (A[i] <= min) {
                min = A[i];
            } else {
                leftIndex = i;
            }
        }

        if (rightIndex - leftIndex + 1 == n)
            return 0;

        return rightIndex - leftIndex + 1;

    }

}
