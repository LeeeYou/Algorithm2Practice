package com.algorithm2practice.sorting;

/**
 * Created by liuzhif on 16/1/31.
 * <p>
 * 堆是用完全二叉树来表示的.
 * <p>
 * 堆分为:小根堆和大根堆
 * <p>
 * 视频教学:http://v.youku.com/v_show/id_XMzQzNzAwODQ=.html
 * 1先建立二叉树
 * 2建立小根堆,移动第一个有孩子的节点
 * 3如果满足堆的定义,则将第一个节点和最后一个元素交换,然后断掉最后一个元素
 */
public class HeapSort {
    private static int[] sort = new int[]{90, -1, 3, 45, 22, 33, 33, 2, 19, 67, 82, 49, 50, 25, 56};

    public static void main(String[] args) {
        buildMaxHeapify(sort);
        heapSort(sort);
        print(sort);
    }

    private static void buildMaxHeapify(int[] data) {
        //没有子节点的才需要创建最大堆，从最后一个的父节点开始
        int startIndex = getParentIndex(data.length - 1);

        System.out.println("startIndex:" + startIndex);

        //从尾端开始创建最大堆，每次都是正确的堆
        for (int i = startIndex; i >= 0; i--) {
            maxHeapify(data, data.length, i);
        }
    }

    /**
     * 创建最大堆
     *
     * @param data
     * @param heapSize需要创建最大堆的大小，一般在sort的时候用到，因为最多值放在末尾，末尾就不再归入最大堆了
     * @param index当前需要创建最大堆的位置
     */
    private static void maxHeapify(int[] data, int heapSize, int index) {
        // 当前点与左右子节点比较
        int left = getChildLeftIndex(index);
        int right = getChildRightIndex(index);

        System.out.println(left + " - " + right);

        int largest = index;
        if (left < heapSize && data[index] < data[left]) {
            largest = left;
        }
        if (right < heapSize && data[largest] < data[right]) {
            largest = right;
        }
        //得到最大值后可能需要交换，如果交换了，其子节点可能就不是最大堆了，需要重新调整
        if (largest != index) {
            int temp = data[index];
            data[index] = data[largest];
            data[largest] = temp;
            maxHeapify(data, heapSize, largest);
        }
    }

    /**
     * 排序，最大值放在末尾，data虽然是最大堆，在排序后就成了递增的
     *
     * @param data
     */
    private static void heapSort(int[] data) {
        //末尾与头交换，交换后调整最大堆
        for (int i = data.length - 1; i > 0; i--) {
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;
            maxHeapify(data, i, 0);
        }
    }

    /**
     * 父节点位置
     *
     * @param current
     * @return
     */
    private static int getParentIndex(int current) {
        return (current - 1) >> 1;
    }

    /**
     * 左子节点position注意括号，加法优先级更高
     *
     * @param current
     * @return
     */
    private static int getChildLeftIndex(int current) {
        return (current << 1) + 1;
    }

    /**
     * 右子节点position
     *
     * @param current
     * @return
     */
    private static int getChildRightIndex(int current) {
        return (current << 1) + 2;
    }

    private static void print(int[] data) {
        int pre = -2;
        for (int i = 0; i < data.length; i++) {
            if (pre < (int) getLog(i + 1)) {
                pre = (int) getLog(i + 1);
                System.out.println();
            }
            System.out.print(data[i] + " |");
        }
    }

    /**
     * 以2为底的对数
     *
     * @param param
     * @return
     */
    private static double getLog(double param) {
        return Math.log(param) / Math.log(2);
    }
}

