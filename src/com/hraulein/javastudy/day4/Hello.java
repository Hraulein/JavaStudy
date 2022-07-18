package com.hraulein.javastudy.day4;

import java.nio.file.FileStore;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello, day4");
        /*
        * 定义三个int型变量并赋值, 使用三元运算符或者 if-else获取三个数种的较大数的实现
        */
        int x= 10, y= 20, z = -21;
        if (x > y && x > z)
        {
            System.out.println(x);
        } else if (y >=x && y >= z) {
            System.out.println(y);
        } else  {
            System.out.println(z);
        }
        /*
        * 交换两个变量值的代码的实现
        */
        String str1 = "shanghai";
        String str2 = "beijing";
        String temp = str1;
               str1 = str2;
               str2 = temp;
        System.out.println("str1 = " + str1 + ", str2 = " + str2);
        OperatorTest();
    }
    private static void OperatorTest(){
        boolean x = true, y = false;
        short z= 40;
        // z=41(先++后运算)
        if ((z++ == 40) && (y == true)){
            z++;
        }
        // z=42(先运算后++)
        if ((x = false) || (++z == 43)){
            z++;
        }
        // ? z = 42
        System.out.println("z = " + z);

        /*
        * 特别说明
        * 自增自减运算
        * z++ : 先运算, 然后在自增1
        * * z++ == 40  >>>>>  z==40 ... z=z+1
        * ++z : 先自增1, 然后在运算
        * * ++z == 43  >>>>>  z=z+1 ... z==43
        */
    }
    private static void MessageTips(){
        /*
        * 关系运算符 ==
        * 比较运算符的结果是boolean类型
        * > < >= <= 只能用于数值类型的数据之间
        * == != 不仅可以使用在数值类型数据之间, 还可以使用在其他引用类型变量之间
        */

        /*
        * 逻辑运算符 & && | || ! ^
        * 比较的都是boolean类型, 结果也是boolean类型变量
        * & | ^ 与位运算符的区分
        */

        /*
        * 位运算符 << >> >>> & | ^ ~
        * 操作的都是整型的数值
        * << >> 在一定范围内左移右移相当于 *2 /2
        */
        // 十进制转十六进制 (0-255)
        int i1 = 100;
        int i2 = i1 & 15;
        String j = (i2 > 9) ? (char)(i2 - 10 + 'A') + "" : i2 + "";
        int temp = i1 >>> 4;
        i2 = temp & 15;
        String k = (i2 > 9) ? (char)(i2 - 10 + 'A') + "" : i2 + "";
        System.out.println(k + "" + j);


    }
}
