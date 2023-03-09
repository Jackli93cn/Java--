package com.Jackli.ST;
//题目:逻辑判断
//已知小红由25元,她存了几天钱发现现在的钱比原本的两倍还多10块钱.
//小蓝有30块钱,攒了几天后发现正好是原来的两倍.
//小蓝和小红的钱一样多,是真的吗?
public class P2 {
    public static void main(String[] args) {
        int red = 25;
        int blue = 30;
        red = red * 2+10;
        blue *= 2;
                System.out.println(red == blue);
    }
}
