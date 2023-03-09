package com.Jackli.ST;
//题目:鸡兔同笼(穷举法)
//已知鸡兔共35只,共94只脚,那么鸡兔各多少只?
public class P16 {
    public static void main(String[] args) {
       //循环变量j,控制小鸡的个数:0~35递增
       //循环变量t,控制兔子的个数:35~0递减
       for (int j = 0, t = 35; j <= 35; j ++, t --){//如果有多个小条件用逗号隔开
           //保证脚的数量是94
           if(j * 2 + t * 4 ==94){
               System.out.println("鸡:" +j+ ",兔:" +t);
           }
        }
    }
}
