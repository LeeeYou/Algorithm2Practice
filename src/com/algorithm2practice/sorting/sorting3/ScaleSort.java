package com.algorithm2practice.sorting.sorting3;

import java.util.Arrays;

/**
 * Created by liuzhif on 16/2/17.
 * <p>
 * <p>
 * 已知一个几乎有序的数组，几乎有序是指，如果把数组排好顺序的话，每个元素移动的距离可以不超过k，并且k相对于数组来说比较小。请选择一个合适的排序算法针对这个数据进行排序。
 * 给定一个int数组A，同时给定A的大小n和题意中的k，请返回排序后的数组。
 * 测试样例：
 * [2,1,4,3,6,5,8,7,10,9],10,2
 * 返回：[1,2,3,4,5,6,7,8,9,10]
 */
public class ScaleSort {

    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 4, 3, 6, 5, 8, 7, 10, 9};

        System.out.printf(Arrays.toString(sortElement(A, A.length, 2)));
    }

    public static int[] sortElement(int[] A, int n, int k) {
        if (A == null || A.length == 0 || n < k) {
            return null;
        }

        int[] heap = getKHeap(A, k);//获取长度为K的数组,并排序好

        System.out.println(Arrays.toString(heap));

        //排序下标为k到n的数组段,每次将heap[0]赋值到A数组中的合适位置
        for (int i = k; i < n; i++) {
            A[i - k] = heap[0];
            heap[0] = A[i];
            heapify(heap, 0, k);
        }

        //排序下标为n - k到n的数组段,每次将heap[0]赋值到A数组中的合适位置
        for (int i = n - k; i < n; i++) {
            A[i] = heap[0];
            swap(heap, 0, k - 1);
            heapify(heap, 0, --k);
        }

        return A;
    }

    private static void heapify(int[] heap, int index, int heapSize) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int smallest = index;

        while (left < heapSize) {
            if (heap[left] < heap[index]) {
                smallest = left;
            }

            if (right < heapSize && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest != index) {
                swap(heap, smallest, index);
            } else {
                break;
            }

            index = smallest;
            left = index * 2 + 1;
            right = index * 2 + 2;
        }
    }

    private static int[] getKHeap(int[] A, int k) {
        int[] heap = new int[k];
        for (int i = 0; i < k; i++) {
            heapInsert(heap, A[i], i);
        }
        return heap;
    }

    private static void heapInsert(int[] heap, int value, int index) {
        heap[index] = value;
        while (index != 0) {
            int parent = (index - 1) / 2;
            if (heap[parent] > heap[index]) {
                swap(heap, parent, index);
                index = parent;
            } else {
                break;
            }
        }
    }

    private static void swap(int[] heap, int parent, int index) {
        heap[parent] = heap[parent] ^ heap[index];
        heap[index] = heap[parent] ^ heap[index];
        heap[parent] = heap[parent] ^ heap[index];
    }
}
