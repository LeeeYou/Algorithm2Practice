package com.algorithm2practice.sorting;

import java.util.Arrays;

/**
 * Created by leeyou on 2016/1/29.
 * 1．先从数列中取出一个数作为基准数。
 * <p>
 * 2．分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。
 * <p>
 * 3．再对左右区间重复第二步，直到各区间只有一个数。
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] A = new int[]{90, -1, 3, 45, 22, 33, 33, 2, 19, 67, 82, 49, 50, 25, 56};
        quickSort(A, 0, A.length - 1);
        System.out.printf(Arrays.toString(A));
    }

    private static void quickSort(int[] A, int left, int right) {
        if (left < right) {
            int i = left, j = right, x = A[left];

            while (i < j) {
                while (i < j && A[j] >= x)//从右向左找到第一个小于x的数
                    j--;

                if (i < j)
                    A[i++] = A[j];//交换数据

                while (i < j && A[i] < x)//从左向右找到第一个大于x的数
                    i++;

                if (i < j)
                    A[j--] = A[i];//交换数据
            }

            A[i] = x;

            quickSort(A, left, i - 1);
            quickSort(A, i + 1, right);
        }
    }

}
