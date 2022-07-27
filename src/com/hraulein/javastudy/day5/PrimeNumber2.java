package com.hraulein.javastudy.day5;

/*
求质数的第二种做法
*/

public class PrimeNumber2 {
    public static void main(String[] args) {
        int count = 0; //记录质数的个数
        // 循环运行前的时间的毫秒数
        long start = System.currentTimeMillis();
        label:
        for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue label;
                }
            }
            count++;
        }
        // 循环运行结束的时间的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为: " + count);
        System.out.println("程序执行所花费的时间为: " + (end - start) + "ms");
    }
}
