package com.hraulein.javastudy.day5;

import java.util.Scanner;

/* 循环语句综合例题 */

/*
1. 不在循环条件部分限制次数的结构: for(;;) 或 while(true)
2. 结束循环方式?
   方式一: 循环条件部分返回false
   方式二: 循环体中使用break;
*/
public class CycleTest {
    public static void main(String[] args) {
        WhileTrueTest();
        ForTrueTest();
    }

    private static void ForTrueTest() {
        Scanner scanner = new Scanner(System.in);
        // 记录正数的个数
        int plusCount = 0;
        // 记录负数的个数
        int minusCount = 0;
        for (;;){
            System.out.print("请输入整数 (输入0结束程序): ");
            int inputNum = scanner.nextInt();
            if (inputNum > 0){
                plusCount++;
            }else if (inputNum < 0){
                minusCount++;
            }else {
                break;
            }
        }
        System.out.println("输入正整数的个数为: " + plusCount);
        System.out.println("输入负整数的个数为: " + minusCount);
    }

    /*
    * 从键盘读入个数不确定的整数,
    * 并判断读入的正数和负数的个数,
    * 输入为0时结束程序
    *
    * 最简单的无限循环格式: while(true), for(;;)
    *
    */
    private static void WhileTrueTest() {
        Scanner scanner = new Scanner(System.in);
        // 记录正数的个数
        int plusCount = 0;
        // 记录负数的个数
        int minusCount = 0;
        int inputNum;
        while (true){
            System.out.printf("请输入整数 (输入0结束程序): ");
            inputNum = scanner.nextInt();
            if (inputNum > 0){
                plusCount++;
            }
            if (inputNum < 0){
                minusCount++;
            }
            if (inputNum == 0){
                break;
            }
        }
        System.out.println("输入正整数的个数为: " + plusCount);
        System.out.println("输入负整数的个数为: " + minusCount);
    }
}
