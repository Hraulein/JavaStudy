package com.hraulein.javastudy.day4;

public class Review {
    public static void main(String[] args) {
        /*
        * 谈谈你对三元运算符, if-else, switch-case结构使用场景的理解
        * 使用优先级: 三元 > switch-case > if-else (基于程序效率)
        * 变量在使用之前需要赋值! 否则编译即Error
        * 编译报错反而是好事, 编译不报错, 语法问题难查因
        * 遇见的好的代码, 保存下来, 无事看看. 身心愉悦
        */
        int c;
        int a = 1,b = 2;
        if (a != b){
            c = a;
        }else {
            c = b;
        }
        // == ↓
        // int c = (a != b) ? a : b;
        // int c = a;

        /* 算法
        * 1. 有限性
        * */
    }
}
