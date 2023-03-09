package com.Jackli.ST;

import java.util.Scanner;

//题目:银行收入计算
//某行退出定期储蓄业务,存期分别为1,2,3,5年,到期凭存单支取本息
//一年 2.25%,二年 2.7%,三年 3.25%,五年 3.6%
//请输入一定金额(1000起),四选一,计算到期后得到的本息总额.
//提示:存入金额与存入年限均有键盘录入
//本息计算方法:本金+本金*年利率*年限
public class P11 {
    public static void main(String[] args) {
        //1.提示并接收用户输入的存款金额
        System.out.println("请输入存款金额:");
        int money = new Scanner(System.in).nextInt();
        //2.提示并接收用户输入的存款年限
        System.out.println("请输入存款年限:");
        int year = new  Scanner(System.in).nextInt();
        //3.定义变量用来保存本金和利息之和
        double outMoney = 0;
        //4.根据利率和年限计算本息和
        if(year == 1){
            outMoney = money + money * 2.25 / 100 * 1;
        }else if (year == 2){
            outMoney = money + money * 2.7 / 100 * 2;
        } else if (year ==3) {
            outMoney = money + money * 3.25 / 100 * 3;
        } else if (year == 5) {
            outMoney = money + money * 3.6 / 100 * 5;
        }else {
            System.out.println("输入的年限有误");
        }
        //5.打印输出
        System.out.println("存款" + year + "年后的本息是:" + outMoney);
    }
}
