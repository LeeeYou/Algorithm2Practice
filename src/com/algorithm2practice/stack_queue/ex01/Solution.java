package com.algorithm2practice.stack_queue.ex01;

import java.util.Stack;

/**
 * Created by LeeeYou on 2016/3/17. 可查询最值的栈练习题
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class Solution {

    Stack<Integer> stackData = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();

    public void push(int node) {
        stackData.push(node);

        if (stackMin.isEmpty()) {
            stackMin.push(node);
        } else {
            if (node <= stackMin.peek()) {
                stackMin.push(node);
            } else {
                stackMin.push(stackMin.peek());
            }
        }
    }

    public void pop() {
        stackMin.pop();
    }

    public int top() {
        return stackMin.peek();
    }

    public int min() {
        return stackMin.peek();
    }

}
