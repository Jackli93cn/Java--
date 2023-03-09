package com.Jackli.ST;
//最优选择2
//买一个手机,其价值8888元,旧手机在市场能卖1800元,手机专卖店可以以旧换新,用来买新手机可以享受7.5折优惠
//怎么样买最划算
public class P8 {
    public static void main(String[] args) {
        //1.计算不使用以旧换新的花费
        int plan1 = 8888 - 1800;
        //2.计算以旧换新的花费
        double plan2 = 8888 * 0.75;
        //3.判断两种方式
        if (plan1 > plan2){
            System.out.println("使用以旧换新更省钱");
        }else{
            System.out.println("不使用以旧换新更省钱");
        }
    }
}
