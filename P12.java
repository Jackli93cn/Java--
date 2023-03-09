package com.Jackli.ST;

import java.util.Scanner;

//题目:求税后工资问题
//国家推出新的个人所得税政策,起征点上调至5000,即为到手工资超过5000则需缴税
//超额部分按照梯度交税:
//0~3000元,交税3%
//3000~12000元,交税10%
//12000~25000元,交税20%
//25000~35000元,交税25%
//35000~55000元,交税30%
//55000~80000元,交税35%
//超过80000元的部分,交税45%
//完成一个个税计算程序.在用户输入税前工资后.计算出他对应的纳税金额,以及税后工资为多少
public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的税前工资:");
        //1.键盘录入税前工资
        int money = sc.nextInt();
        //2.计算应纳税部分的工资
        double before = money - (money * 0.1) - 5000;
        //3.定义个税变量
        double shui = 0;
        //4.按照梯度范围计算个税数值
        if(before > 0 && before <= 3000){
            shui = before * 0.03;
        } else if (before > 3000 && before <= 12000) {
            shui = 3000 * 0.03 + (before - 3000) * 0.1;
        } else if (before > 12000 && before <= 25000) {
            shui = 3000 * 0.03 + 9000 * 0.1 + (before - 12000) * 0.2;
        } else if (before > 25000 && before <= 35000) {
            shui = 300 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + (before - 25000) * 0.25;
        } else if (before >35000 && before <= 55000) {
            shui = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (before - 35000) * 0.3;
        } else if (before > 55000 && before <= 80000) {
            shui = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + (before - 55000) * 0.35;
        } else if (before > 80000) {
            shui = 3000 * 0.3 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (before - 80000) * 0.45;
        }
        //5.计算税后工资
        double after = money - (money * 0.1) - shui;
        //6,打印个税和税后工资
        System.out.println("个人所得税" + shui + "元");
        System.out.println("税后工资" + after + "元");
    }
}
