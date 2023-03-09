package com.Jackli.ST;
//题目:最优选择
//买个外卖,商家的优惠方式如下:a菜品单点24元,b菜品单点8元,c菜品单点3元
//订单满30元8折优惠,a菜品优惠价16元,但是优惠于满减不可以一起用
//请问点三样菜品最少多少钱.
public class P3 {
    public static void main(String[] args){
        //1.求不使用优惠的总价
        double money1 = 24 + 8 + 3;
        //2.判断折后总价
        money1 = (money1 <= 30? money1: money1*0.8);
        //3.求使用优惠时的总价
        double money2 = 16 + 8 + 3;
        //4.判断两种花费哪个更少
        double money = money1<money2?money1:money2;
        //5.打印最终花费
        System.out.println(money);
    }
}
