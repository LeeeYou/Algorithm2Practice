package com.algorithm2practice.sorting.comparator_speed;

import java.util.Arrays;

/**
 * Created by leeyou on 2016/2/1.
 * <p>
 * wiki:https://zh.wikipedia.org/zh-sg/%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] A = com.algorithm2practice.sorting.comparator_speed.A.getData();//5万个随机数

        long cur = System.currentTimeMillis();
        shellSort(A, A.length);
        System.out.println("耗时：" + (System.currentTimeMillis() - cur));//耗时：2168
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
