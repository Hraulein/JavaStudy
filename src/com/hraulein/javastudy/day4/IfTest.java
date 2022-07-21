package com.hraulein.javastudy.day4;
import java.util.Scanner;


public class IfTest {
    public static void main(String[] args) {
        IfTest1();
        IfTest2();
        IfTest3();
        IfTest4();
        IfTest5();
        IfTest6();
    }
    /*
    * 高富帅 / 白富美
    * 高富帅: 大智若愚宠辱不惊为高, 大爱于心福泽天下是为富, 大略宏才智勇双全为帅
    * 白富美: 洁身自好为白, 经济独立为富, 内外兼修为美
    * String.equals()方法的使用
    */
    private static void IfTest6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的身高(cm): ");
        int height = scanner.nextInt();
        System.out.print("请输入你的财富(W): ");
        int money = scanner.nextInt();
        System.out.print("请输入你的颜值(帅,其他): ");
        String face = scanner.next();
        if (height >= 180 && money >= 1000 && face.equals("帅")){
            System.out.println("哇, 我的白马王子!!!");
        } else if (height >= 180 || money >= 1000 || face.equals("帅")) {
            System.out.println("嫁吧, 比上不足比下有余");
        } else{
            System.out.println("你是个好人");
        }
    }

    /*
    * 彩票游戏
    * 如何获取一个随机数 10 - 99
    * 公式: [a,b]: (int)Math.random() * (b - a + 1) + a)
    */
    private static void IfTest5() {

        // random范围 [0.0, 1.0)
        int value = (int)(Math.random() * 90 + 10);
        System.out.println("你的幸运数为: " + value);
    }

    /*
     * 计算狗的年龄(换算为人类的年龄)
     *
     */
    private static void IfTest4() {
        int dogAge = 6;
        if (dogAge >= 0 && dogAge <= 2){
            System.out.println("相当于人的年龄: " + dogAge * 10.5);
        }else if (dogAge > 2){
            double temp;
            temp = (2 * 10.5) + ((dogAge - 2) * 4);
            System.out.println("相当于人的年龄: " + temp);
        }
    }

    /*
    * if 练习
    * else的就近原则
    */
    private static void IfTest3() {
        int x = 4;
        int y = 1;
        if (x >2)
            if (y > 2)
                System.out.println(x + y);
        else // else跟谁配对? // 就近原则
            System.out.println("x is " + x);
    }

    /*
    * 键盘输入三个数, 进行排序, 从小到大输出
    * if-else 结构是可以嵌套的
    * if-else 的执行语句只有一行时, 可以省略但不建议
    *
    */
    private static void IfTest2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数: ");
        int num1 = scanner.nextInt();
        System.out.print("请输入第二个整数: ");
        int num2 = scanner.nextInt();
        System.out.print("请输入第三个整数: ");
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
        System.out.print("请输入你的成绩(0-100): ");
        int score = scanner.nextInt();
        if (score == 100){
            System.out.println("奖励一辆BMW");
        } else if (score <= 99 && score > 80) {
            System.out.println("奖励一台iphone xs max");
        } else if (score <= 80 && score >= 60) {
            System.out.println("奖励一台iPad");
        } else {
            System.out.println("奖励一套男女混合双打");
        }
    }

}
