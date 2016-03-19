package com.algorithm2practice.stack_queue.ex03;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by LeeeYou on 2016/3/19. 滑动窗口练习题
 * <p>
 * 有一个整型数组 arr 和一个大小为 w 的窗口从数组的最左边滑到最右边,窗口每次向右边滑一个位置。 返回一个长度为n-w+1的数组res，res[i]表示每一种窗口状态下的最大值。 以数组为[4,3,5,4,3,3,6,7]，w=3为例。因为第一个窗口[4,3,5]的最大值为5，第二个窗口[3,5,4]的最大值为5，第三个窗口[5,4,3]的最大值为5。第四个窗口[4,3,3]的最大值为4。第五个窗口[3,3,6]的最大值为6。第六个窗口[3,6,7]的最大值为7。所以最终返回[5,5,5,4,6,7]。
 * 给定整形数组arr及它的大小n，同时给定w，请返回res数组。保证w小于等于n，同时保证数组大小小于等于500。
 * 测试样例：
 * [4,3,5,4,3,3,6,7],8,3
 * 返回：[5,5,5,4,6,7]
 */
public class SlideWindow {

    public static void main(String[] args) {
        int[] A = {357, 564, 212, 500, 96};
        int[] B = {308, 427, 36, 77, 147, 144, 273};
        int[] C = {60, 185, 364, 0, 369, 579, 246, 44};
        System.out.println(Arrays.toString(slide(A, 5, 3)));
        System.out.println(Arrays.toString(slide(B, 7, 6)));
        System.out.println(Arrays.toString(slide(C, 8, 3)));
    }

    public static int[] slide(int[] arr, int n, int w) {
        if (n <= 0 || w == 1)
            return arr;

        LinkedList<Integer> qmax = new LinkedList<>();
        int[] result = new int[n - w + 1];
        int resultIndex = 0;
        for (int i = 0; i < n; i++) {
            while (!qmax.isEmpty() && arr[i] >= arr[qmax.peekLast()]) {
                qmax.pollLast();
            }

            qmax.addLast(i);

            if (qmax.peekFirst() == i - w) {//检查队头的下标是否过期
                qmax.pollFirst();//如过期，则将队头下标弹出
            }

            if (i >= w - 1) {
                result[resultIndex++] = arr[qmax.peekFirst()];
            }
        }

        return result;
    }

}
