package com.hraulein.javastudy.day5;

/*

嵌套循环: 将一个循环结构a声明在另一个循环结构b的结构体中, 即构成嵌套循环
    外层循环: 循环结构b
    内层循环: 循环结构a
    不超过3层

内层循环结构遍历一边, 只相当于外层循环的循环体执行了一次
假设外层循环需要执行m次, 内层循环需要执行n次, 此时内层循环的循环体一共执行m*n次


*/
public class NestedLoop {
    public static void main(String[] args) {
        ForForLoops();
    }

    private static void ForForLoops() {
        // ******
        for (int i = 0; i < 6; i++) {
            System.out.print("*");
        }
        System.out.println();

        /*
        ++++++++++++
        ++++++++++++
        ++++++++++++
        ++++++++++++
        */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        /*
        -
        --
        ---
        ----
        -----
        */
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('-');
            }
            System.out.println();
        }
        System.out.println();
        /*
        =====
        ====
        ===
        ==
        =
        */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i ; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
        System.out.println();
    }

}
