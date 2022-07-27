package com.hraulein.javastudy.project1;

/*
家庭记账软件
*/


public class FamilyAccount {

    public static void main(String[] args) {
        ProjectRunFunction1();
        ProjectRunFunction2();
    }

    /**
     * 参考教程写的, 运行正常
     */
    private static void ProjectRunFunction2() {
        int balance = 10000;
        boolean loopFlag = true;
        String details = "---------------- 当前收支明细记录 ----------------\n收支\t账号金额\t\t收支金额\t\t说明\n";
        do {
            FamilyAccountMainDisplay();
            int inputNum = Utility.readMenuSelection();
            switch (inputNum) {
                case '1':
                    System.out.println(details);
                    break;
                case '2':
                    System.out.print("本次收入金额: ");
                    int money = Utility.readNumber();
                    balance += money;
                    System.out.print("本次收入说明: ");
                    String msg = Utility.readString();
                    details += "支出\t" + balance + "\t\t" + money + "\t\t" + msg + "\n";
                    System.out.println("收入登记成功");
                    break;
                case '3':
                    System.out.print("本次支出金额: ");
                    int money1 = Utility.readNumber();
                    balance -= money1;
                    System.out.print("本次支出说明: ");
                    String msg1 = Utility.readString();
                    details += "支出\t" + balance + "\t\t" + money1 + "\t\t" + msg1 + "\n";
                    break;
                case '4':
                    System.out.print("确定退出家庭记账本吗? (Y/N): ");
                    char choose = Utility.readConfirmSelection();
                    if (choose == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }
        } while (loopFlag);
    }

    /**
     * 自己写的, 存在问题: money不会迭代更新
     */
    private static void ProjectRunFunction1() {
        int money = 10000;
        String accountInfo = "";
        boolean loopFlag = true;
        do {
            FamilyAccountMainDisplay();
            int inputNum = Utility.readMenuSelection();
            switch (inputNum) {
                case '1':
                    System.out.print(PaymentDetails(accountInfo));
                    break;
                case '2':
                    accountInfo += InMoney(money);
                    System.out.println("收入登记成功");
                    break;
                case '3':
                    accountInfo += OutMoney(money);
                    System.out.println("支出登记成功");
                    break;
                case '4':
                    System.out.print("确定退出家庭记账本吗? (Y/N): ");
                    char choose = Utility.readConfirmSelection();
                    if (choose == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }
        } while (loopFlag);
    }

    private static String OutMoney(int balance) {
        System.out.print("本次支出金额: ");
        int money = Utility.readNumber();
        balance -= money;
        System.out.print("本次支出说明: ");
        String msg = Utility.readString();
        return "支出\t" + balance + "\t\t" + money + "\t\t" + msg + "\n";

    }

    private static String InMoney(int balance) {
        System.out.print("本次收入金额: ");
        int money = Utility.readNumber();
        balance += money;
        System.out.print("本次收入说明: ");
        String msg = Utility.readString();
        return "收入\t" + balance + "\t\t" + money + "\t\t" + msg + "\n";
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
    private static String PaymentDetails(String record) {
        return "---------------- 当前收支明细记录 ----------------\n" +
                "收支\t账号金额\t\t收支金额\t\t说明\n" +
                record;
    }
}
