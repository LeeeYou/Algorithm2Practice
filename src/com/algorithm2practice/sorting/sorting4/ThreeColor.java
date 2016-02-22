package com.algorithm2practice.sorting.sorting4;

import java.util.Arrays;

/**
 * Created by leeyou on 2016/2/19.三色排序问题
 * <p>
 * 有一个只由0，1，2三种元素构成的整数数组，请使用交换、原地排序而不是使用计数进行排序。
 * 给定一个只含0，1，2的整数数组A及它的大小，请返回排序后的数组。保证数组大小小于等于500。
 * 测试样例：
 * [0,1,1,0,2,2],6
 * 返回：[0,0,1,1,2,2]
 */
public class ThreeColor {

    public static void main(String[] args) {
        int[] A = new int[]{0, 1, 1, 0, 2, 2};

        System.out.printf(Arrays.toString(sortThreeColor(A, A.length)));
    }

    public static int[] sortThreeColor(int[] A, int n) {
        int kleft = -1, kright = n;
        int index = 0;
        while (index < kright) {
            if (A[index] == 0) {
                swap(A, ++kleft, index++);
            } else if (A[index] == 2) {
                swap(A, index, --kright);
            } else {
                index++;
            }
        }

        return A;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

}
