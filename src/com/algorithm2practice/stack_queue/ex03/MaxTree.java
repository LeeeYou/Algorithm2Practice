package com.algorithm2practice.stack_queue.ex03;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by LeeeYou on 2016/3/19. 数组变树练习题
 * <p>
 * 对于一个没有重复元素的整数数组，请用其中元素构造一棵MaxTree，MaxTree定义为一棵二叉树，其中的节点与数组元素一一对应，同时对于MaxTree的每棵子树，它的根的元素值为子树的最大值。现有一建树方法，对于数组中的每个元素，其在树中的父亲为数组中它左边比它大的第一个数和右边比它大的第一个数中更小的一个。若两边都不存在比它大的数，那么它就是树根。请设计O(n)的算法实现这个方法。
 * 给定一个无重复元素的数组A和它的大小n，请返回一个数组，其中每个元素为原数组中对应位置元素在树中的父亲节点的编号，若为根则值为-1。
 * 测试样例：
 * [3,1,4,2],4
 * 返回：[2,0,-1,2]
 * <p>
 * 证明该方法的的正确性：
 * 1、该方法可以生成一棵树，而不是森林。（因为数组中的数值都不同，一个数向上一定可以找到比它大的数，会有一个共同的头部）
 * 2、生成的这一棵树是二叉树，而不是多叉树。（任何一个数在单独一侧，孩子的数量都不超过一个）
 * <p>
 * 假设A这棵树在单独一侧，有两个孩子 k1,k2, 假如设在右侧
 * ....A......k1...k2...
 * A>k1且A>k2
 * <p>
 * 假设k1<k2
 * 根据A>k2,有k1<k2<A
 * 所以根据我们的方法，k1不可能以A为父节点
 * <p>
 * 假设k1>k2
 * 根据A>k1,有k2<k1<A
 * 所以根据我们的方法，k2不可能以A为父节点
 * <p>
 * 总之，A在单独一侧不可能有超过一个孩子节点的情况
 */
public class MaxTree {

    public static void main(String[] args) {
        int[] A = {3, 4, 5, 1, 2};
        buildMaxTree(A, 5);
    }

    public static int[] buildMaxTree(int[] A, int n) {
        Stack<Integer> stack = new Stack<>();

        int[] ALeft = new int[n];//左边第一个大的数
        int[] ARight = new int[n];//右边第一个大的数

        //寻找左边第一个大的数，将值存放到ALeft
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                stack.push(A[i]);
                ALeft[i] = -1;
            } else {
                while (!stack.isEmpty() && A[i] > stack.peek()) {
                    stack.pop();
                }

                if (!stack.isEmpty()) {
                    ALeft[i] = stack.peek();
                    stack.push(A[i]);
                } else {
                    stack.push(A[i]);
                    ALeft[i] = -1;
                }
            }
        }

        stack.clear();

        //寻找右边第一个大的数，将值存放到ARight
        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(A[i]);
                ARight[i] = -1;
            } else {
                while (!stack.isEmpty() && A[i] > stack.peek()) {
                    stack.pop();
                }

                if (!stack.isEmpty()) {
                    ARight[i] = stack.peek();
                    stack.push(A[i]);
                } else {
                    stack.push(A[i]);
                    ARight[i] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(ALeft));
        System.out.println(Arrays.toString(ARight));

        int[] result = new int[n];
        int temp;

        //每一个数的父节点是它左边第一个比它大的数与右边第一个比它大的数中较小的那个数
        for (int i = 0; i < n; i++) {
            if (ALeft[i] == -1 && ARight[i] == -1) {
                temp = -1;
            } else if (ALeft[i] == -1) {
                temp = ARight[i];
            } else if (ARight[i] == -1) {
                temp = ALeft[i];
            } else {
                temp = ALeft[i] < ARight[i] ? ALeft[i] : ARight[i];
            }

            result[i] = getIndex(A, temp);
        }

        System.out.println(Arrays.toString(result));

        return result;
    }

    //根据元素值，获取它在数组A中的下标位置
    public static int getIndex(int[] A, int num) {
        if (num < 0)
            return -1;

        for (int j = 0; j < A.length; j++) {
            if (A[j] == num)
                return j;
        }
        return -2;
    }

}
