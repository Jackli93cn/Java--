package com.Jackli.ST;

import java.util.Scanner;

//题目:手机选号
//根据用户输入的手机号来确认用户实际支付的价格
//如果尾数为8,需50元,尾数为4,不需要钱,其余尾号,需20元.
public class P13 {
    public static void main(String[] args) {
        //1.提示并接收用户输入的手机号
        System.out.println("请输入您预选的手机号:");
        String tel = new Scanner(System.in).nextLine();//注意:String类型数据一般使用nextLine()

        //2.调用getPrice()方法,来计算价格,注意需把手机号tel作为参数传入方法中
        getPeice(tel);
    }
    //3.创建getPrice()
    public  static  void getPeice(String tel){
        //3.1手机号tel的长度,必须是11位正确的手机号--提前校验,提高程序健壮性
        if(tel.length() !=11){
            System.out.println("号码格式错误");
            return;//结束方法,返回到调用位置再继续执行
        }
        //比如我们拿到的手机号是tel="23133123",想要拿到尾数,也就是最后一个字符
        //需要用到 char c = tel.charAt(10)
        //注意:由于下标也是从0开始,所以取第11个字符,它的下标位置是10

        //3.2获取手机尾号
        char c = tel.charAt(10);

        //3.3定义用来保存最红结果的变量price,初始值为0
        int price = 0;

        //3.4根据c字符的值,来为price重新赋值
        switch (c){
            case '8':price = 50; break;//尾数为8支付50
            case '4':price = 0;break;//尾数为4免费
            default:price =  20;//其余情况需支付20
        }
        System.out.println("您实际应付的价格为:"+price);
    }
}
