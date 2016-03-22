package com.algorithm2practice.stack_queue.ex02;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

/**
 * Created by leeyou on 2016/3/18. 双栈队列练习题
 * <p>
 * 编写一个类,只能用两个栈结构实现队列,支持队列的基本操作(push，pop)。
 * 给定一个操作序列ope及它的长度n，其中元素为正数代表push操作，为0代表pop操作，保证操作序列合法且一定含pop操作，请返回pop的结果序列。
 * 测试样例：
 * [1,2,3,0,4,0],6
 * 返回：[1,2]
 */
public class TwoStack {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 0, 4, 0};

        System.out.printf(Arrays.toString(twoStack(A, 6)));
    }

    static Stack<Integer> stackPush = new Stack<>();
    static Stack<Integer> stackPop = new Stack<>();

    public static int[] twoStack(int[] ope, int n) {
        Vector<Integer> result = new Vector<>();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = ope[i];
            if (temp > 0) {
                stackPush.push(temp);
            } else if (temp == 0) {

                if (stackPop.isEmpty()) {//stackPop栈只有为空才能往里面压入数据
                    while (!stackPush.isEmpty()) {
                        stackPop.push(stackPush.pop());
                    }
                }
                result.add(stackPop.pop());
            }
        }

        int[] mResult = new int[result.size()];
        for(int i=0;i<result.size();i++){
            mResult[i] = result.get(i);
        }

        return mResult;
    }
}
