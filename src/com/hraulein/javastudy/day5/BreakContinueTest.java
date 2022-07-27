package com.hraulein.javastudy.day5;
/*
                使用范围         循环中的作用              相同点
break:          switch-case
                循环结构中       结束当前循环              关键字后面不能有执行语句

continue:       循环结构中       结束当次循环              关键字后面不能有执行语句

*/
public class BreakContinueTest {
    public static void main(String[] args) {
        BreakTest();
        ContinueTest();
    }

    private static void ContinueTest() {
        System.out.println("continue");
        for (int i = 0; i < 10; i++) {
            if (i % 4 == 0){
                continue;
            }
            System.out.print(i);
        }
        System.out.println("\n**************************");

        /* continue 默认跳出最近一层循环体 */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if ((j + 1) % 4 == 0){
                    // 默认跳出包裹此关键字的最近一层循环体
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n*************************");

        /* continue 结束指定标识的一层循环体 */
        label: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if ((j + 1) % 4 == 0){
                    // 结束指定标识的一层循环体
                    continue label;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void BreakTest() {
        /* break的使用 */
        System.out.println("break");
        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 4 == 0){
                break;
            }
            System.out.print(i);
        }
        System.out.println("\n**************************");

        /* break 默认跳出最近一层循环体 */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if ((j + 1) % 4 == 0){
                    // 默认跳出包裹此关键字的最近一层循环体
                    break;
                }
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n*************************");

        /* break 结束指定标识的一层循环体 */
        label: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if ((j + 1) % 4 == 0){
                    // 结束指定标识的一层循环体
                    break label;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
