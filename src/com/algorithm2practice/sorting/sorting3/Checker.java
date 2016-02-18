package com.algorithm2practice.sorting.sorting3;

import java.util.Arrays;

/**
 * Created by liuzhif on 16/2/17.
 * <p>
 * 请设计一个高效算法，判断数组中是否有重复值。必须保证额外空间复杂度为O(1)。
 * 给定一个int数组A及它的大小n，请返回它是否有重复值。
 * 测试样例：
 * [1,2,3,4,5,5,6],7
 * 返回：true
 */
public class Checker {

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5, 5, 6};

        System.out.printf(String.valueOf(checkDuplicate(A, A.length)));
    }

    public static boolean checkDuplicate(int[] a, int n) {
        if (a == null || a.length <= 0) {
            return false;
        }

        shellSort(a, n);

        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                return true;
            }
        }

        return false;
    }

    private static void shellSort(int[] A, int length) {
        for (int gap = length / 2; gap >= 1; gap--) {//增量递减
            for (int i = 0; i <= gap; i++) {//控制排序的列数
                for (int j = i; j + gap < length; j += gap) {//对每一列进行排序
                    if (A[j] > A[j + gap]) {
                        A[j] = A[j] ^ A[j + gap];
                        A[j + gap] = A[j] ^ A[j + gap];
                        A[j] = A[j] ^ A[j + gap];
                    }
                }
            }
        }
    }
}
