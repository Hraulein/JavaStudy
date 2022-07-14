package com.hraulein.day3;

import java.sql.SQLOutput;

public class OperatorTest {
    public static void main(String[] args) {
        ArithmeticOperatorTest();
        RemainderTest();
        AutoAddSubTest();
        AriExer();
        AssigningOperator();
        ComparisonOperator();
        LogicalOperator();
        BitOperator();

    }
    // 位运算符, 用的很少
    // 直接对整数的二进制进行的运算
    // << 左移   >> 右移
    // >>> 无符号右移 (没有 <<<)
    // & 与运算     | 或运算
    // ^ 异或运算   ~ 取反运算
    private static void BitOperator() {
        // << 左移
        // 在一定范围内, 每向左移一位, 在原来的基础上 *2
        // >> 右移
        // 在一定范围内, 每向右移一位, 在原来的基础上 /2
        int num = 21;
        System.out.println("num << 2 : " + (num << 2) );
        System.out.println("num << 2 << 25 : " + (num << 2 << 25) );
        // >>> 无符号右移, 不管最高位为0或是1, 空缺位都用0来补足
        //
        // 面试题: 最高效的计算 2*8 ?
        System.out.println((2 << 3));
        System.out.println((8 << 1));

    }
    /*
    * 逻辑运算符 >> 只能适用于boolean类型变量
    * & 逻辑与
    * && 短路与
    * >> 均为true则为true, 否则为false
    * | 逻辑或
    * || 短路或
    * >> 一个为true则为true, 均为false则为false
    * ! 逻辑非
    * >> 取反
    * ^ 逻辑异或
    * >> 两者相同为false, 不同为true
    */

    private static void LogicalOperator() {
        // 区分 & &&
        // 相同点1: & 与 && 的运算结果相同
        // 相同点2: 当符号左边为true时, 二者会执行符号右边的运算
        // // 不同点: 当符号左边为false时, & 会执行右边的运算, && 不执行右边的运算
        // 优先使用 &&
        /* & */
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0))
        {
            System.out.println("this is true ");
        }else {
            System.out.println("this is false");
        }
        System.out.println("num1: " + num1);

        /* && */
        // 截断, 即前面条件为false, 后续判断不操作(没必要操作:可以理解为多此一举)
        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0))
        {
            System.out.println("this is true ");
        }else {
            System.out.println("this is false");
        }
        System.out.println("num2: " + num2);

        // 区分 | 与 ||
        // 相同点1: | 与 || 的运算结果相同
        // 相同的2: 当符号左边是false时, 二者都会执行符号右边的运算
        // 不同点: 当符号左边为true时, | 会执行符号右边的运算, || 不执行右边的运算
        // 优先使用 ||
        boolean b3 = true;
        b3 = false;
        int num3 = 10;
        if (b3 & (num3++ > 0))
        {
            System.out.println("this is true ");
        }else {
            System.out.println("this is false");
        }
        System.out.println("num3: " + num3);

        /* && */
        // 截断, 即前面条件为false, 后续判断不操作(没必要操作:可以理解为多此一举)
        boolean b4 = true;
        b4 = false;
        int num4 = 10;
        if (b4 && (num4++ > 0))
        {
            System.out.println("this is true ");
        }else {
            System.out.println("this is false");
        }
        System.out.println("num4: " + num4);

        // 无聊的笔试题?
        boolean x1 = true;
        boolean y1 = false;
        short z1 = 42;
        // if (y1 == true)
            // true,z1+=1,true
            if ((z1++ == 42) && (y1 = true))
                // z1+=1
                z1++;
        // false,z1+=1,true
        if ((x1 = false) || (++z1 == 45))
            // z1+=1
            z1++;
        // if (y1 == true) 注释时为46,不注释为43
        System.out.println("z1 = " + z1);
    }

    /*
    * 比较运算符
    * 结果只能为 true / false
    * 区分 == 和 =
    * ==
    * !=
    * >=
    * <=
    * >
    * <
    * instanceof
    */
    private static void ComparisonOperator() {
        int i = 2, j = 5;
        // false
        System.out.println(i == j);
        // 7
        System.out.println(i = j);
        boolean b1 = true;
        boolean b2 = false;
        // false
        System.out.println(b2 == b1);
        // true
        System.out.println(b2 = b1);

    }

    /*
    * 赋值运算符
    * 符号: =
    * 当'='两侧数据类型不一致时, 可以使用自动类型转换或强制类型转换进行处理
    * 扩展: += -= *= /= %=
    */
    private static void AssigningOperator() {
        // 赋值1
        int i1 = 10;
        int j1 = 10;
        // 赋值2
        int i2,j2;
        i2 = j2 = 10;
        // 赋值3
        int i3 = 10, j3 = 20;

        // 赋值的扩展
        /*
        * 不会改变变量数据类型
        * short s1 = 10
        * s1 += 2;
        * 会改变数据类型
        * short s1 = 10;
        * s1 = s1 + 2;
        */
        int num = 100;
        num = 200;
        // 赋值符号 =
        System.out.println("num = " + num);
        // +=
        num += 100;
        System.out.println("num += 100: " + num);
        // -=
        num -= 24;
        System.out.println("num -= 24: " + num);
        // *=
        num *= 3;
        System.out.println("num *= 3: " + num);
        // /=
        num /= 8;
        System.out.println("num /= 8: " + num);
        // %=
        num %= 6;
        System.out.println("num %= 6: " + num);

        // 开发中, 如果希望变量实现+2的操作, 有几种方法? short num = 10;
        // 方法1: num = num + 2;
        // 方法2: num += 2; (推荐, 不会改变数据类型)

        // 开发中, 如果希望变量实现+1的操作, 有几种方法? short num = 10;
        // 方法1: num = num + 1;
        // 方法2: num += 1; (推荐, 不会改变数据类型)
        // 方法3: num++; (推荐)

        /* 思考2 */
        int i11 = 1;
        i11 *= 0.1;
        // 0.1 double ? x
        // = 0 (不会改变数据类型, 故还是int型)
        System.out.println("i11 *= 0.1 : " + i11);
        i11++;
        // 1.1 ?
        // = 1(不会改变数据类型, 故还是int型)
        System.out.println("I11++ : " + i11);

        /* 思考3 */
        int m = 3, n = 2;
        // m = 4; n = 6
        n *= m++;
        System.out.println("n *= m++, n = " + n + ", m = " + m);

        /* 思考4 */
        int n1 = 10;
        // n1 = n1 + (n1++) + (++n1);
        n1 += (n1++) + (++n1);
        System.out.println("n1 += (n1++) + (++n1): " + n1);
    }


    /*
    * 随意给出一三位数的整数, 分别输出百位,十位,个位.
    */
    private static void AriExer() {
        int num = 187;
        int bai = num / 100;
        int shi = num % 100 / 10;
        int ge = num % 10;
        System.out.println("数字为: " + num);
        System.out.println("百位:" + bai);
        System.out.println("十位:" + shi);
        System.out.println("各位:" + ge);
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
