package com.hraulein.javastudy.day4;

import java.util.Scanner;

/*
* 使用 Scanner从控制台获取键盘输入数据
* 具体实现步骤:
* 1. 导包 import java.util.Scanner;
* 2. Scanner的实例化: Scanner scanner = new Scanner(System.ui);
* 3. 调用相关的函数获取键盘输入的值
*
*/
public class ScannerGetInputValueTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("请输入你的姓名: ");
        String name = scanner.next();
        System.out.printf("请输入你的年龄: ");
        int age  = scanner.nextInt();
        System.out.printf("请输入你的体重 (kg): ");
        double weight = scanner.nextDouble();
        System.out.printf("你是单身吗? 是(true) 否(false): ");
        boolean isSignDog = scanner.nextBoolean();
        System.out.printf("请输入你的性别 (男/女): ");
        String gender = scanner.next();
        char genderInput = gender.charAt(0);
        String InputMessages = "姓名: " + name + ", 性别: " + genderInput + ", 年龄: " + age + ", 体重: " + weight + "kg";
        System.out.println(InputMessages);
        if (isSignDog == true) {
            System.out.println("你这个单身狗");
        } else if (isSignDog == false){
            System.out.println("你不要撒狗粮");
        } else {
            System.out.println("nothing");
        }
    }
}
