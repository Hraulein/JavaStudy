package com.hraulein.javastudy.day5;

// 推荐书籍: 《算法与数据结构》

/*
求指定范围内的质数
质数: 只能被1和其本身除尽的自然数 > 从2开始, 到这个数-1结束为止, 都不能被这个数本身整除.
最小的质数: 2
算法的优化 >> 效率至上
*/
public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber1();
        PrimeNumber2();
        PrimeNumber3();
    }
    /* 求质数算法的优化2 */
    private static void PrimeNumber3() {
        System.out.println("\n求质数(优化2): 对本身是质数的自然数是有效的");
        // 标识i是否被j除尽, 一旦除尽, 修改其值
        boolean isFlag = true;
        int count = 0; //记录质数的个数
        // 循环运行前的时间的毫秒数
        long start  = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
                // 优化2: 对本身是质数的自然数是有效的
                for (int j = 2; j <= Math.sqrt(i); j++){ // 根号i 79ms 1653ms  (开方)
                    if (i % j == 0) {
                        isFlag = false;
                        // 优化1: 只对本身非质数的自然数有效
                        break;
                    }
                }
                if (isFlag){
                    // 程序输出也会占用cpu"内存读写"
                    // System.out.println(i);
                    count++;
                }
                isFlag = true;
            }
            // 循环运行结束的时间的毫秒数
            long end  = System.currentTimeMillis();
            System.out.println("质数的个数为: " + count);
            System.out.println("程序执行所花费的时间为: " + (end - start) + "ms");
    }

    /* 求质数算法的优化1 */
    private static void PrimeNumber2() {
        System.out.println("\n求质数(优化1): 只对本身非质数的自然数有效");
        // 标识i是否被j除尽, 一旦除尽, 修改其值
        boolean isFlag = true;
        int count = 0; //记录质数的个数
        // 循环运行前的时间的毫秒数
        long start  = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                    // 优化1: 只对本身非质数的自然数有效
                    break;
                }
            }
            if (isFlag){
                // 程序输出也会占用cpu"内存读写"
                // System.out.println(i);
                count++;
            }
            isFlag = true;
        }
        // 循环运行结束的时间的毫秒数
        long end  = System.currentTimeMillis();
        System.out.println("质数的个数为: " + count);
        System.out.println("程序执行所花费的时间为: " + (end - start) + "ms");
    }

    /* 及格的面试题答案 */
    private static void PrimeNumber1() {
        System.out.println("\n求质数: 未优化效果(程序运行中, 请耐心等待)");
        // 标识i是否被j除尽, 一旦除尽, 修改其值
        boolean isFlag = true;
        int count = 0; //记录质数的个数
        // 循环运行前的时间的毫秒数
        long start  = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                }
            }
            if (isFlag){
                // 程序输出也会占用cpu"内存读写"
                // System.out.println(i);
                count++;
            }
            isFlag = true;
        }
        // 循环运行结束的时间的毫秒数
        long end  = System.currentTimeMillis();
        System.out.println("质数的个数为: " + count);
        System.out.println("程序执行所花费的时间为: " + (end - start) + "ms");
    }
}
