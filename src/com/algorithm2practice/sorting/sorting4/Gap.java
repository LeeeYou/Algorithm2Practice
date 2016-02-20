package com.algorithm2practice.sorting.sorting4;

/**
 * Created by leeyou on 2016/2/19.
 * <p>
 * 有一个整形数组A，请设计一个复杂度为O(n)的算法，算出排序后相邻两数的最大差值。
 * 给定一个int数组A和A的大小n，请返回最大的差值。保证数组元素多于1个。
 * 测试样例：
 * [1,2,7,5,4,6],6
 * 返回：2
 */
public class Gap {

    public static void main(String[] args) {
        int[] A = {1, 8, 7, 5, 4, 6};

        System.out.printf(String.valueOf(maxGap(A, A.length)));
    }

    public static int maxGap(int[] A, int n) {
        int len = n;

        int min = A[0];
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] < min) {
                min = A[i];
            }

            if (A[i] > max) {
                max = A[i];
            }
        }

        if (max == min)
            return 0;

        boolean[] hasNum = new boolean[len + 1];
        int[] maxs = new int[len + 1];
        int[] mins = new int[len + 1];
        int bid = 0;

        for (int i = 0; i < len; i++) {
            bid = bucket(A[i], len, min, max); // 算出桶号
            mins[bid] = hasNum[bid] ? Math.min(mins[bid], A[i]) : A[i];
            maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], A[i]) : A[i];
            hasNum[bid] = true;
        }

        int res = 0;
        int lastMax = 0;
        int i = 0;

        while (i <= len) {
            if (hasNum[i++]) { // 找到第一个不空的桶
                lastMax = maxs[i - 1];
                break;
            }
        }

        for (; i <= len; i++) {
            if (hasNum[i]) {
                res = Math.max(res, mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return res;

    }

    // 使用long类型是为了防止相乘时溢出
    public static int bucket(long num, long len, long min, long max) {
        return (int) ((num - min) * len / (max - min));
    }
}
