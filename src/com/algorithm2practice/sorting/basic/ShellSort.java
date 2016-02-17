package com.algorithm2practice.sorting.basic;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by leeyou on 2016/2/1.
 * <p>
 * wiki:https://zh.wikipedia.org/zh-sg/%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] A = new int[]{90, -1, 3, 45, 22, 33, 33, 2, 19, 67, 82, 49, 50, 25, 56};

        shellSort(A, A.length);
        System.out.printf(Arrays.toString(A));
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
