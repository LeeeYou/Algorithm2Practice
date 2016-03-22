package com.algorithm2practice.other;

/**
 * Created by leeyou on 2016/3/22. 计算一个int里面二进制有几个1?
 */
public class FindInt1 {

    public static void main(String[] args) {
        int num = 5;
        int num2 = 15;

        System.out.println(find_01(num) + "  --  " + find_01(num2));
        System.out.println(find_02(num) + "  --  " + find_02(num2));
        System.out.println(find_02(7));
    }

    public static int find_01(int num) {
        int count = 0;
        for (; num > 0; num >>= 1)
            count += num & 1;
        return count;
    }

    /**
     * 为什么n &= (n – 1)能清除最右边的1呢？
     * <p>
     * 因为从二进制的角度讲，n相当于在n - 1的最低位加上1。
     * <p>
     * 举个例子，8（1000）= 7（0111）+ 1（0001），所以8 & 7 = （1000）&（0111）= 0（0000），清除了8最右边的1（其实就是最高位的1，因为8的二进制中只有一个1）。
     * <p>
     * 再比如7（0111）= 6（0110）+ 1（0001），所以7 & 6 = （0111）&（0110）= 6（0110），清除了7的二进制表示中最右边的1（也就是最低位的1）。
     *
     * @param num
     * @return
     */
    public static int find_02(int num) {
        int count = 0;
        for (; num > 0; ++count)
            num &= num - 1;
        return count;
    }


}
