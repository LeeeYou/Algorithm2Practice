package com.algorithm2practice.sorting.basic;

import java.util.Arrays;

/**
 * Created by leeyou on 2016/1/29.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] A = new int[]{90, -1, 3, 45, 22, 33, 33, 2, 19, 67, 82, 49, 50, 25, 56};

        mergeSort(A, 0, A.length - 1);
        System.out.printf(Arrays.toString(A));
    }

    private static void mergeSort(int[] A, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(A, left, middle);//划分左右
            mergeSort(A, middle + 1, right);
            mergeArray(A, left, middle, right);//合并数组
        }
    }

    public static void mergeArray(int A[], int left, int middle, int right) {
        int[] temp = new int[right - left + 1];

        int leftIndex = left, rightIndex = middle + 1, tempIndex = 0;

        //左右子数组中的小数值放到临时数组中
        while (leftIndex <= middle && rightIndex <= right)
            temp[tempIndex++] = A[leftIndex] < A[rightIndex] ? A[leftIndex++] : A[rightIndex++];

        //剩余的直接放入
        while (leftIndex <= middle)
            temp[tempIndex++] = A[leftIndex++];

        //剩余的直接放入
        while (rightIndex <= right)
            temp[tempIndex++] = A[rightIndex++];

        //将临时数组放到原数组
        tempIndex = 0;
        while ((left + tempIndex) <= right)
            A[left + tempIndex] = temp[tempIndex++];
    }
}
