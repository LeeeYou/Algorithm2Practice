package com.algorithm2practice.stack_queue.ex02;

import java.util.Stack;

/**
 * Created by LeeeYou on 2016/3/19. 栈的反转练习题
 * <p>
 * 实现一个栈的逆序，但是只能用递归函数和这个栈本身的pop操作来实现，而不能自己申请另外的数据结构。
 * 给定一个整数数组A即为给定的栈，同时给定它的大小n，请返回逆序后的栈。
 * 测试样例：
 * [4,3,2,1],4
 * 返回：[1,2,3,4]
 */
public class StackReverse {

    public int[] reverseStack(int[] A, int n) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(A[i]);
        }

        reverse(stack);

        for (int i = 0; i < n; i++) {
            A[i] = stack.pop();
        }

        return A;
    }

    //把栈中元素逆序
    public void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int i = get(stack);
        reverse(stack);
        stack.push(i);
    }

    //移除栈底元素并返回
    public int get(Stack<Integer> stack) {
        Integer result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = get(stack);
            stack.push(last);
            return result;
        }
    }

}
