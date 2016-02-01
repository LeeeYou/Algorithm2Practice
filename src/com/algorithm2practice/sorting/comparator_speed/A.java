package com.algorithm2practice.sorting.comparator_speed;

import java.util.Random;

/**
 * Created by leeyou on 2016/2/1.
 */
public class A {
    //5万个随机数
    public static int[] getData() {
        int A[] = new int[50000];
        Random random = new Random();
        for (int i = 0; i < 50000; i++) {
            A[i] = random.nextInt(500000);
        }
        return A;
    }

}
