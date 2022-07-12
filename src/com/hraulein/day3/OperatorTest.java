package com.hraulein.day3;

public class OperatorTest {
    public static void main(String[] args) {
        ArithmeticOperatorTest();
        RemainderTest();
        AutoAddSubTest();
    }
    /*
    * 自增自减运算
    * ++a 先本身自增1, 然后在运算
    * a++ 先运算, 运算结果后自增1
    * 自增1不会改变本身的数据类型(比强制类型转换效率高)
    * --a 先本身自减1, 然后在运算
    * a-- 先运算, 运算结果后自减1
    */
    private static void AutoAddSubTest() {
        // ++(前): 先本身自增1, 然后在运算
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = "+ a1 + ", b1 = " + b1);
        // (后)++: 先运算, 运算结果后自增1
        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + ", b2 = " + b2);
        // 注意点
        short s1 = 10;
        // s1++; // 自增1不会改变本身的数据类型
        s1 += 1; // 数据类型已由 short > int
        System.out.println(" s1 += 1 : " + s1);

        // --(前): 先本身自减1, 然后在运算
        int a4 = 10;
        int b4 = --a4;
        System.out.println("a4 = " + a4 + ", b4 = " + b4);
        // (后)--: 先运算, 运算结果后自减1
        int a5 = 10;
        int b5 = a5--;
        System.out.println("a5 = " + a5 + ", b5 = " + b5);
    }

    /*
    * 取余运算
    * % 结果的符号与被模数的符号相同
    * 开发中, 经常使用 % 来判断是否被除尽
    */
    private static void RemainderTest() {
        // %: 取余运算
        // m1: 模数
        // n1: 被模数
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1 = " + m1 % n1);

        int m11 = -12;
        int n11 = 5;
        System.out.println("m11 % n11 = " + m11 % n11);

        int m12 = 12;
        int n12 = -5;
        System.out.println("m12 % n12 = " + m12 % n12);

        int m13 = -12;
        int n13 = -5;
        System.out.println("m13 % n13 = " + m13 % n13);
    }

    /*
    * 算术运算符
    * + - * / + - % (前)++ ++(后) (前)-- --(后)
    */
    private static void ArithmeticOperatorTest() {
        /* 掌握运算的本质 */
        // 除号: /
        int num1 = 21;
        int num2 = 5;
        // 除不尽, 则省略小数点
        int result1 = num1 / num2;
        System.out.println(result1);
        // 运算顺序: 从前往后算
        int result2 = num1 / num2 * num2;
        System.out.println(result2);
        // double 接收 int之间的除法结果
        /* double result3 = num1 / num2;
        System.out.println(result3); */
        // int 除法得完整结果(不省略)
        double result4 = num1 / (num2 + 0.0);
        double result5 = (double)num1 / num2;
        System.out.println(result4);
        System.out.println(result5);
    }

}
