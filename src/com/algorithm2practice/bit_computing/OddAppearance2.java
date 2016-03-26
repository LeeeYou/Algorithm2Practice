package com.algorithm2practice.bit_computing;

import java.util.Arrays;

/**
 * Created by LeeeYou on 2016/3/26.寻找奇数出现II练习题
 * <p>
 * 给定一个整型数组arr，其中有两个数出现了奇数次，其他的数都出现了偶数次，找到这两个数。要求时间复杂度为O(N)，额外空间复杂度为O(1)。
 * 给定一个整形数组arr及它的大小n，请返回一个数组，其中两个元素为两个出现了奇数次的元素,请将他们按从小到大排列。
 * 测试样例：
 * [1,2,4,4,2,1,3,5],8
 * 返回：[3,5]
 */
public class OddAppearance2 {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 4, 2, 1, 3, 5};
        System.out.print(Arrays.toString(findOdd(A, 8)));
    }

    public static int[] findOdd(int[] A, int n) {
        int result0 = 0, result1 = 0;
        for (int i = 0; i < n; i++) {
            result0 ^= A[i];
        }

        int temp = result0 & (~result0 + 1);
        for (int i = 0; i < n; i++) {
            if ((A[i] & temp) != 0) {
                result1 ^= A[i];
            }
        }

        int min = Math.min(result1, result0 ^ result1);
        int max = Math.max(result1, result0 ^ result1);

        return new int[]{min, max};
    }
}
