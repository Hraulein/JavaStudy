package com.hraulein.javastudy.day4;

import java.util.Scanner;


public class IfTest {
    public static void main(String[] args) {
//        IfTest1();
        IfTest2();
    }
    /*
    * 键盘输入三个数, 进行排序, 从小到大输出
    * if-else 结构是可以嵌套的
    * if-else 的执行语句只有一行时, 可以省略但不建议
    *
    */
    private static void IfTest2() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("请输入第一个整数: ");
        int num1 = scanner.nextInt();
        System.out.printf("请输入第二个整数: ");
        int num2 = scanner.nextInt();
        System.out.printf("请输入第三个整数: ");
        int num3 = scanner.nextInt();
        if (num1 >= num2){
            NumberSizeComparison(num1, num2, num3);
        }else {
            NumberSizeComparison(num2, num1, num3);
        }

        /* 手写的代码
        if (num1 >= num2){
            if (num3 >= num1){
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else if (num3 <= num2) {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        }else {
            if (num3 >= num2){
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else if(num3 <= num1){
                System.out.println(num3 + ", "+ num1 + ", " + num2);
            } else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        }
        */
    }
    /*
    * Idea 自动"纠错"生成 alt+enter
    */
    private static void NumberSizeComparison(int num1, int num2, int num3) {
        if (num3 >= num1){
            System.out.println(num2 + ", " + num1 + ", " + num3);
        } else if (num3 <= num2) {
            System.out.println(num3 + ", " + num2 + ", " + num1);
        } else {
            System.out.println(num2 + ", " + num3 + ", " + num1);
        }
    }

    /*
     * 输入成绩, 获得奖励.
     * 特别说明
     * 1. else结构是可选的
     * 2. 针对于条件表达式
     * > 如果多个条件表达式之间是"互斥"关系(或没有交集的关系), 哪个判断和执行语句的位置无所谓
     * > 如果多个条件表达式之间有交集关系, 需要根据实际情况, 考虑清楚应该将哪个结构声明在上面
     * > 如果多个条件表达式之间有包含关系, 通常情况下需要将范围小的声明在范围大的上面, 否则范围小的永远无法执行
     */
    private static void IfTest1() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("请输入你的成绩(0-100): ");
        int score = scanner.nextInt();
        if (score == 100){
            System.out.println("奖励一辆BMW");
        } else if (score <= 99 && score > 80) {
            System.out.println("奖励一台iphon xs max");
        } else if (score <= 80 && score >= 60) {
            System.out.println("奖励一台iPad");
        } else {
            System.out.println("奖励一套男女混合双打");
        }
    }

}
