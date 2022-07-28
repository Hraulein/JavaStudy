package com.hraulein.javastudy.project1;

public class FamilyAccount2 {
    /**
     * 自己写的
     * 思考: 如果将money放置在main方法里面, 如何通过函数改变money的值
     * * java只有值传递
     * * 要么就是对象包装起来, 传对象, 然后改对象里面的值
     * * 要么使用函数返回值
     */
    // 初始金额
    private static int money = 10000;

    public static void main(String[] args) {
        // 收支记录明细
        String moneyInfo = "";
        // 循环条件
        boolean loopFlag = true;
        do {
            FamilyAccountMainDisplay();
            switch (Utility.readMenuSelection()) {
                case '1':
                    PaymentDetails(moneyInfo);
                    break;
                case '2':
                    moneyInfo += InMoney();
                    break;
                case '3':
                    moneyInfo += OutMoney();
                    break;
                case '4':
                    loopFlag = ExitProgram();
                    break;
            }
        } while (loopFlag);

    }
    /**
     * 退出程序
     *
     */
    private static boolean ExitProgram() {
        System.out.print("确定退出家庭记账本吗? (Y/N): ");
        char choose = Utility.readConfirmSelection();
        if (choose == 'Y' || choose == 'y') {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 主页面提示
     */
    private static void FamilyAccountMainDisplay() {
        System.out.println("---------------- 家庭收支记账软件 ----------------");
        System.out.println("\t\t\t\t1 收支明细");
        System.out.println("\t\t\t\t2 登记收入");
        System.out.println("\t\t\t\t3 登记支出");
        System.out.println("\t\t\t\t4 退出程序");
        System.out.print("\t\t\t\t请选择(1-4): ");
    }

    /**
     * 收支明细记录总计
     */
    private static void PaymentDetails(String record) {
        System.out.println("---------------- 当前收支明细记录 ----------------");
        System.out.println("收支\t账号金额\t\t收支金额\t\t说明\n" + record);
    }

    /**
     * 收入记录
     */
    private static String InMoney() {
        System.out.print("本次收入金额: ");
        int inMoney = Utility.readNumber();
        money += inMoney;
        System.out.print("本次收入说明: ");
        String msg = Utility.readString();
        System.out.println("收入登记成功");
        return "收入\t" + money + "\t\t" + inMoney + "\t\t" + msg + "\n";
    }

    /**
     * 支出记录
     */
    private static String OutMoney() {
        System.out.print("本次支出金额: ");
        int outMoney = Utility.readNumber();
        money -= outMoney;
        System.out.print("本次支出说明: ");
        String msg = Utility.readString();
        System.out.println("支出登记成功");
        return "支出\t" + money + "\t\t" + outMoney + "\t\t" + msg + "\n";
    }
}