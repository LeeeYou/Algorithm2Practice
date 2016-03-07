package com.algorithm2practice.sorting.basic;

import java.util.Arrays;

/**
 * Created by leeyou on 2016/3/7.
 * <p>
 * 对于一个int数组，请编写一个计数排序算法，对数组元素排序。
 * 给定一个int数组A及数组的大小n，请返回排序后的数组。
 * 测试样例：
 * [1,2,3,5,2,3],6
 * [1,2,2,3,3,5]
 */
public class CountSort {
    public static void main(String[] args) {
        int[] A = new int[]{90, 9, 3, 45, 22, 33, 33, 2, 19, 67, 82, 49, 50, 25, 56, 12, 76, 22, 65};

        countingSort(A, A.length);
        System.out.printf(Arrays.toString(A));
    }

    public static int[] countingSort(int[] A, int n) {
        if (A == null || n < 2) {
            return A;
        }

        int max = A[0], min = A[0];

        for (Integer i : A) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }

        int[] countArray = new int[max - min + 1];
        for (int i = 0; i < n; i++) {
            countArray[A[i] - min]++;
        }

        int index = 0;
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i]-- > 0) {
                A[index++] = i + min;
            }
        }

        return A;
    }

}
