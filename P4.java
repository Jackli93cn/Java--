package com.Jackli.ST;

import java.util.Scanner;

//题目:接收三个用户输入的3个整数,并将它们的最大值作为输出结果
public class P4 {
    public static void main(String[] args) {
        //1.提示并接收用户输入的三个整数,并交由变量a b c 来保存
        System.out.println("请输入第一个整数:");
        int a =new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个整数:");
        int c = new Scanner(System.in).nextInt();


        //2.对接收到的三个值进行比较
        //三元运算符1 ? 2 : 3
        //如果这1号位置的表达式结果为ture,结果就取2号位置的值,反之,就取3号位置的值
        //2.1定义变量max来保存a和b中的最大值
        int max = a > b ? a : b;
        //2.2比较max与c谁最大,并将最大值交由max来保存
        max = max > c ? max : c;
        //解决方案2
        //int max = a > b ? (a > c ? a : c):(b> c ? b : c);
        //3.输出结果
        System.out.println("三个数的最大值是:"+max);
    }
}
