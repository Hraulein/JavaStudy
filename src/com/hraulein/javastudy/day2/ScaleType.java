package com.hraulein.javastudy.day2;

/*
* 计算机底层都以补码的方式来存储数据
* 反码, 原码只是为了得到补码 (过河拆桥)
*/
public class ScaleType {
    public static void main(String[] args) {
        binaryTest();
        decimalTest();
        octalTest();
        hexTest();
    }


    // 二进制
    private static void binaryTest(){
        // 二进制 binary 满2进1 以0B或0b开头
        // 0,1
        int num1 = 0b110;
        System.out.println("二进制 0b110 = " + num1);
    }

    // 十进制
    private static void decimalTest(){
        // 十进制 decimal 满10进1
        int num2 = 110;
        System.out.println("十进制 110 = " + num2);
    }

    // 八进制 以数字0开头表示
    private static void octalTest(){
        // int num3 = 0127;
        // System.out.println("八进制 0127 = " + num3);
    }

    // 十六进制 0-9,A-F 满16进1 以0x或0X开头, A-F不区分大小写
    private static void hexTest() {
        int num4 = 0x110A;
        System.out.println("十六进制 0x110B = " + num4);
    }
}

class ScaleConvert{
    public static void main(String[] args) {
        // 进制之间转换
        // 二进制 > 十进制: 乘2的和
        // 十进制 > 二进制: 除2取余数的逆
        // 二进制 > 八进制: 单数拆三位
        // 二进制 > 十六进制: 单数拆四位
        System.out.println("\n");
    }
}