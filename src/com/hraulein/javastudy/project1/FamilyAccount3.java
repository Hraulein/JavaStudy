package com.hraulein.javastudy.project1;

/**
 * 使用数组返回多个值
 *
 * */
public class FamilyAccount3 {
    public static void main(String[] args) {
        // 初始金额
        int balance = 10000;
        // 收支记录明细
        String moneyInfo = "";
        // 循环条件
        boolean loopFlag = true;
        String[] array;
        do {
            FamilyAccountMainDisplay();
            switch (Utility.readMenuSelection()) {
                case '1':
                    PaymentDetails(moneyInfo);
                    break;
                case '2':
                    // 收入
                    array = InMoney(balance);
                    balance = Integer.parseInt(array[0]);
                    moneyInfo += array[1];
                    break;
                case '3':
                    // 支出
                    array = OutMoney(balance);
                    balance = Integer.parseInt(array[0]);
                    moneyInfo += array[1];
                    break;
                case '4':
                    loopFlag = ExitProgram();
                    break;
            }
        } while (loopFlag);

    }


    /**
     * 退出程序
     */
    private static boolean ExitProgram() {
        System.out.print("确定退出家庭记账本吗? (Y/N): ");
        char choose = Utility.readConfirmSelection();
        return choose != 'Y' && choose != 'y';
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
    private static String[] InMoney(int balance) {
        String[] array = new String[2];
        System.out.print("本次收入金额: ");
        int inMoney = Utility.readNumber();
        balance += inMoney;
        System.out.print("本次收入说明: ");
        String info = Utility.readString();
        System.out.println("收入登记成功");
        array[0] = String.valueOf(balance);
        array[1] = "收入\t" + balance + "\t\t" + inMoney + "\t\t" + info + "\n";
        return array;
    }

    /**
     * 支出记录
     */
    private static String[] OutMoney(int balance) {
        String[] array = new String[2];
        System.out.print("本次支出金额: ");
        int outMoney = Utility.readNumber();
        balance -= outMoney;
        System.out.print("本次支出说明: ");
        String info = Utility.readString();
        System.out.println("支出登记成功");
        array[0] = String.valueOf(balance);
        array[1] = "支出\t" + balance + "\t\t" + outMoney + "\t\t" + info + "\n";
        return array;
    }
}
