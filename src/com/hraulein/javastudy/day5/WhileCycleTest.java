package com.hraulein.javastudy.day5;

/*
* 一. 循环结构的4个要素
* 1. 初始化条件
* 2. 循环条件 >> boolean类型
* 3. 循环体
* 4. 迭代条件

* while循环的结构
* 1
* while (2){
*    3;
*    4;
* }

* 执行过程: 1 > 2 > 3 > 4 > 2 > 3 > 4 > ... > 2

* 写while循环千万小心不要丢了迭代条件, 一旦丢了, 就可能导致死循环
* 写程序要避免出现死循环
* for 和 while 是可以相互转换的. 区别在于初始化条件的作用域不一样(i)
*
* */
public class WhileCycleTest {
    public static void main(String[] args) {
        WhileTest1();
    }
    /*
    * while 循环的使用
    * */
    private static void WhileTest1() {
       // 遍历100以内的所有偶数
       int i = 1;
       while (i <= 100){
           if (i % 2 == 0){
               System.out.print(i + " ");
           }
           i++;
       }
    }
}
