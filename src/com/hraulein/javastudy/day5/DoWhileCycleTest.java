package com.hraulein.javastudy.day5;

/*
* do-while循环的使用
* 一. 循环结构的4个要素
* 1. 初始化条件
* 2. 循环条件 >> boolean类型
* 3. 循环体
* 4. 迭代条件
*


* 1
* do{
*   3;
*   4;
* }while(2);

* 执行过程: 1 > 3 > 4 > 2 > 3 > 4 > ... > 2

* do-while 至少执行一次循环体
*
*/

public class DoWhileCycleTest {
    public static void main(String[] args) {
//        DoWhileTest1();
        DoWhileTest2();
    }
    /*
    * while 和 do-while 的区别
    * */
    private static void DoWhileTest2() {
        int num1 = 10;
        while (num1 > 10){
            System.out.println("hello: whlie");
            num1--;
        }

        do {
            System.out.println("hello: do-while");
            num1--;
        }while (num1 > 10);
    }


    private static void DoWhileTest1() {
        // 遍历100以内的偶数, 并计算所有偶数的和以及偶数的个数
        int i = 1;
        int sum = 0;
        int count = 0;
        do {
            if (i % 2 == 0){
                System.out.print(i + " ");
                sum += i;
                count++;
            }
            i++;
        }while (i <= 100);
        System.out.println("\n总和为: " + sum);
        System.out.println("个数为: "+ count);
    }
}
