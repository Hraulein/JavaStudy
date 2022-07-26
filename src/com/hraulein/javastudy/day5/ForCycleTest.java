package com.hraulein.javastudy.day5;

import java.util.Scanner;

public class ForCycleTest {
    public static void main(String[] args) {
        Test1();
    }
    /*
    * 输入两个正整数m和n, 求其最大公约数和最小公倍数
    * 比如: 12和20的最大公约数是4, 最小公倍数是60
    *
    * 说明: break关键字的使用
    * */
    private static void Test1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个正整数: ");
        int m = scanner.nextInt();
        System.out.print("请输入第二个正整数: ");
        int n = scanner.nextInt();
        // 最大公约数
        // 获取两个数中的较小值
        int min = (m > n) ? n : m;
        for (int i = min; i >= 1 ; i--) {
            if (m % i == 0 && n % i == 0){
                System.out.println("最大公约数为: " + i);
                // 一旦在循环中执行到break, 即跳出循环
                break;
            }
        }
        // 最小公倍数
        int max = (m > n) ? m : n;
        for (int i = max; i <= m * n; i++){
            if (i % m == 0 && i % n == 0){
                System.out.println("最小公倍数: " + i);
                break;
            }
        }
    }
}
