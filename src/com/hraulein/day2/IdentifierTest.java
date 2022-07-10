package com.hraulein.day2;

/*
标识符命名规范:
    数字不可以开头
    26个英文字母大小写,0-9,_或$组成
    不可以用关键字和保留字(但可以包含关键字和保留字)
    不能包含空格
    区分大小写

名称命名规范:
    包名: 所有字母都小写
    类名,接口名: 首字母大写
    变量名,方法名: 第一个单词首字母大写,第二个单词之后首字母大写
    常量名: 所有字母都大写,多个单词用下划线连接
 */

// 规范的类名 "首字母大写"
public class IdentifierTest {
    public static void main(String[] args) {
        // 规范的常量名
        int LIH_BIRTHDAY = 1120;
        System.out.println(LIH_BIRTHDAY);
        // 规范的变量名
        String myName = "Xiao.JiuJiu";
        int birthday = 706;
        System.out.println(myName);
        System.out.println(birthday);
   }
}

/*
* Java定义变量的格式: 数据类型 变量名 = 变量值
* 变量只在作用域内有效
* 同一个作用域 不能声明多个同名变量
*/

// 变量的定义使用
class VariableTest{
    public static void main(String[] args) {
        // 变量的定义
        int aliAge = 22;
        // 变量的使用
        System.out.println(aliAge);

    }
}

/*
基本数据类型
    整数 byte,short,int,long
    浮点 float,double
    字符 char
    布尔 boolean
引用数据类型
    类 Class (字符串在这里)
    接口 interface
    数组 []
*/

// 变量的数据类型
class VariableTypeTest{
    public static void main(String[] args) {
        // byte 1字节=8bit (-128~127)
        byte testByte = 1;
        System.out.println(testByte);

        // short 2字节
        short testShort = 2;
        System.out.println(testShort);

        // int 4字节
        int testInt = 3;
        // long 8字节 声明long型变量必须以"l"或"L"结尾
        System.out.println(testInt);

        // 通常定义整型用 int型
        long testLong = 4L;
        // float 单精度浮点型, 声明float型变量必须以"f"或"F"结尾
        System.out.println(testLong);

        // float表示的数值范围比long还大
        float testFloat = 3.14F;
        System.out.println(testFloat);

        // double 双精度浮点型, 通常使用此类型
        double testDouble = 5.12;
        System.out.println(testDouble);

        // char 字符型, 使用单引号 '', 允许的范围
        // 1. 单个字符
        // 2. 转义字符 '\n' 等
        // 3. Unicode 值
        char testChar = 'a';
        char testChar2 = '\t';
        char testChar3 = '\u0520';
        System.out.println("char" + testChar + testChar2 + testChar3);

        // 布尔型,只有两个值: true false
        // 常在条件判断, 循环结构中使用
        boolean testBoolean = true;
        System.out.println(testBoolean);
        if (!testBoolean) {
            System.out.println("真的 true");
        }
        else {
            System.out.println("假的 false");
        }

        // String
        String testString = "this is a test string";
        System.out.println(testString);

        // UTF-8是互联网上使用最广的一种Unicode的实现方式
    }
}

/* 数据类型之间的运算规则(不包含Boolean)
* 自动类型提升
* 强制类型转换
* */

class VariableRulesTest{
    public static void main(String[] args) {
        /* 自动类型提升 */
        // 当容量小的数据类型变量与容量大的数据类型变量做运算的时候,将自动提升为容量大的数据类型
        // byte \ char \ short > int > long > float > double
        // byte,char,short 做运算时, 结果均为int型, 即, 有这三种数据类型的变量做运算时, 运算结果为int (怕数据溢出?)
        // 书说: Java在做运算的时候,如果操作数均在int范围内,那么一律在int的空间内运算
        byte b1 = 2;
        int i1 = 133;
        // b1 + i1 为 int 型
        int i2 = b1 + i1;
        System.out.println(i2);

        // char 做运算
        char c1 = 'a';
        int i3 = 3;
        int i4 = c1 + i3;
        System.out.println(i4);

        /* 强制类型转换 */
        // 自动类型提升运算的逆运算, 即大数据类型降为小数据类型(可能会存在数据丢失情况)
        // 转换后多余的值直接舍弃(截断)
        // 有精度损失 eg.1
        double d1 = 1123.11;
        // 使用强制转换符号 (TYPE)
        int i5 = (int)d1;
        System.out.println(i5);

        // 有精度损失 eg.2 <<<<<<<<<<<<<<<<<<< 二进制层面解释"精度丢失"
        // (可以理解为进入循环) >>>>>《开端》(bushi)
        int i7 = 129;
        byte b2 = (byte) i7;
        System.out.println(b2);

        // 无精度损失
        int i6 = 122;
        short s1 = (short) i6;
        System.out.println(s1);
    }
}

/*
* String 变量类型使用
* 1. String为引用数据类型
* 2. 声明String类型变量,使用双引号 ""
* 3. String 声明可以为空, char 不行
* 4. String与8种基本数据类型变量做运算, 运算只能为连接(+)运算, 运算结果只能为 String
* */
class StringTypeTest{
    public static void main(String[] args) {
        String s1 = "Hello String Type";
        System.out.println(s1);
        int number = 100;
        String infoStr = "信息: ";
        // String + int
        String s2 = infoStr + number;
        System.out.println(s2);
        // String + boolean
        boolean b1 = true;
        String s3 = infoStr + b1;
        System.out.println(s3);
    }
}

/*
* String 练习
* */
class StringTest2{
    public static void main(String[] args) {
        // test1
        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str); // 107hello
        System.out.println(c + str + num); // ahello10
        System.out.println(c + (num + str)); // a10hello
        System.out.println((c+ num) + str); // 107hello
        System.out.println(str + num + c); // hello10a

        // test2
        // *tab* 输出效果
        // tips: char 字符可作为数字从而进行运算
        System.out.println("*   *");
        System.out.println('*' + '\t' + '*'); // X
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*"); // X
        System.out.println('*' + ('\t'+ "*"));
    }
}
















