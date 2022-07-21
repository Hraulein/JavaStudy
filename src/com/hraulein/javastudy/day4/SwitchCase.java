package com.hraulein.javastudy.day4;

import java.util.Scanner;

/*
* switch(表达式):{
*   case 常量1:
*       执行语句1;
*       //break;
*   case 常量2:
*       执行语句2;
*       //break;
*   ......
*   default:
*       执行语句;
*       //break
* }
*
*/

/*
* switch的表达式, 只能是如下结构的6种结构类型之一
* byte, short, char, int, 枚举(JDK5.0新增), String(JDK7.0新增)

* case 之后只能为常量, 不能为变量

* break 关键字是可选的, 根据实际情况决定是否添加(9成情况是要加上)

* default 相当于if-else结构中的else, 同样是可选的,位置是灵活的

* 凡是可以使用switch-case的结构, 都可以转换为if-else语句, 反之不成立
* 写分支结构的时候, 当发现既可以使用switch语句(但代码不能冗余[即case语句不多]), 又可以使用if语句, 优先选择使用 switch (效率高)
*/
public class SwitchCase {
    public static void main(String[] args) {
//        SwitchCaseTest1();
//        SwitchCaseTest2();
//        SwitchCaseTest3();
//        SwitchCaseTest4();
//        SwitchCaseTest5();
//        SwitchCaseTest6();
        SwitchCaseTest7();
    }
    /*
    * switch与if-else语句的转换
    *
    * */
    private static void SwitchCaseTest7() {
//      凡是可以使用switch-case的结构, 都可以转换为if-else语句, 反之不成立
//      写分支结构的时候, 当发现既可以使用switch语句(但代码不能冗余[即case语句不多]), 又可以使用if语句
//      优先选择使用 switch (效率高)

    }

    /*
    * 键盘输入年月日,判断这一天是当年的第几天?
    * 闰年标准: 可以被4整除不能被100整除, 或可以被400整除
    * 意义: switch与if-else的嵌套
    */
    private static void SwitchCaseTest6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份: ");
        int year = scanner.nextInt();
        System.out.print("请输入月份: ");
        int month = scanner.nextInt();
        System.out.print("请输入该月的某一日: ");
        int day = scanner.nextInt();
        /*
        int febDays = 0;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("闰年");
            febDays = 29;
        }else{
            System.out.println("非闰年");
            febDays = 28;
        }
        */
        int sumDays = 0;
        switch (month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                //sumDays += 28;
                //sumDays += febDays;
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    System.out.println("闰年");
                    sumDays += 29;
                }else{
                    System.out.println("非闰年");
                    sumDays += 28;
                }
            case 2:
                sumDays +=31;
            case 1:
                sumDays += day;
                break;
            default:
                System.out.println("输入有误");
                return;
        }
        System.out.println(year + "年" + month + "月" + day + "日" + ", 是当年的第" + sumDays + "天");
    }

    /*
    * 编写程序, 从键盘上输入2019年的 "month" 和 "day", 输出该日期是2019年的第几天
    * 意义: break并不一定要在每个case分支中都写上
    * 减少代码的冗余(重复的代码/代码块)
    */
    private static void SwitchCaseTest5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入2019年的月份: ");
        int month = scanner.nextInt();
        System.out.print("请输入2019年的该月的某日:");
        int day = scanner.nextInt();
        int sumDays = 0;
        switch (month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays +=31;
            case 1:
                sumDays += day;
                break;
            default:
                System.out.println("输入有误");
                return;
        }
        System.out.println("2019年" + month + "月" + day + "日" + ", 是2019年的第" + sumDays + "天");
    }

    /*
    * 输入指定月份, 输出该月份所属季节
    * 3,4,5: 春季 6,7,8: 夏季 9,10,11: 秋季 12,1,2: 冬季
    */
    private static void SwitchCaseTest4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("现在是几月?: ");
        int season = scanner.nextInt();
        switch (season){
            case 3: case 4: case 5:
                System.out.println("春");
                break;
            case 6: case 7: case 8:
                System.out.println("夏");
                break;
            case 9: case 10: case 11:
                System.out.println("秋");
                break;
            case 12: case 1: case 2:
                System.out.println("冬");
                break;
            default:
                System.out.println("输入月份有误");
        }
    }
    /*
    * 成绩大于等于60输出合格, 低于60输出不合格
    * case 语句的合并
    */
    private static void SwitchCaseTest3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的成绩(0-100): ");
        int score = scanner.nextInt();
        // 最优解为 (score / 60)
        switch (score / 10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
            default:
                System.out.println("输入有误");
        }

    }

    /*
    * 使用switch把小写类型的char转为大写, 只转换a,b,c, 其他输出other
    */
    private static void SwitchCaseTest2() {
        System.out.print("请输入字符(仅限于a,b,c): ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char char1 = str.charAt(0);
        switch (char1){
            case 'a':
                char1 = 'A';
                System.out.println(char1);
                break;
            case 'b':
                char1 = 'B';
                System.out.println(char1);
                break;
            case 'c':
                char1 = 'C';
                System.out.println(char1);
                break;
            default:
                System.out.println("other");
        }
    }

    /*
    * 根据switch表达式的值, 依次匹配各个case中的常量
    * 一旦匹配成功, 则进入相应case结构中的执行语句并执行
    * 当调用完执行语句以后, 则仍然继续向下执行case语句结构中的语句, 直到遇到break关键字或程序结尾
    * break, 可以用在switch-case结构中, 表示一旦执行到此关键字, 就跳出switch-case语句
    * switch的表达式, 只能是如下结构的6种结构类型之一
    *   byte, short, char, int, 枚举(JDK5.0), String(JDK7.0新增)
    */
    private static void SwitchCaseTest1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入1-3的其中一个数: ");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
        }
    }
}
