package com.hraulein.javastudy.day4;

/*
* 循环结构
* 在某些条件满足的情况下, 反复执行特定代码的结构
* * for 循环
* * while 循环
* * do-while 循环
*
*/
public class ForCycleTest {
    public static void main(String[] args) {
//        MainForCycleReadme();
        ForCycleTest1();
    }

    /*
    * 1循环到150, 每行打印一个值
    * 3的倍数打印 foo
    * 5的倍数打印 biz
    * 7的倍数打印 baz
    */
    private static void ForCycleTest1() {
        // String inputMessages;
        for (int i = 1; i <= 150; i++) {
            System.out.print(i);
            if (i % 3 == 0){
                System.out.print(" foo");
            }
            if (i % 5 == 0){
                System.out.print(" biz");
            }
            if (i % 7 == 0){
                System.out.print(" baz");
            }
            // 写代码的建议: 写一点, 调试运行一点. 即: 边写边调(**)
            System.out.println();
        }
    }

    private static void MainForCycleReadme() {
        /*
        * for 循环结构的使用

        * 一. 循环结构的4个要素
        * 1. 初始化条件
        * 2. 循环条件 >> boolean类型
        * 3. 循环体
        * 4. 迭代条件

        * 二. for循环结构
          for(1;2;4){
               3
          }
          执行过程: 1 > 2 > 3 > 4 > 2 > 3 > 4 > ... > 2
        *
        *
        */
        // for循环输出500次
        // i 在循环体中定义, 循环体外不能直接用
        for (int i = 0; i < 500; i++) {
            System.out.println("Hello World, Cycle Times: " + (i + 1));
        }

        // 练习
        int num = 1;
        for (System.out.print('a'); num <= 3; System.out.print('c'), num++){
            System.out.print('b');
        }

        // 例题: 遍历100以内的偶数, 输出所有偶数的和, 输出偶数的个数
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("所有偶数的和: " + sum);
        System.out.println("所有偶数的个数: " + count);
    }
}
