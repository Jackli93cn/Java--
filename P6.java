package com.Jackli.ST;

import java.util.Scanner;

//题目:输入1~7,输出对应星期几
public class P6 {
    public static void main(String[] args) {
        //1.提示并接收用户输入的数据
        System.out.println("请输入数据:");
        int input = new Scanner(System.in).nextInt();
        //2.判断用户输入的数据
        if(input == 1){
            System.out.println("星期一");
        }
        else if(input == 2)
        {
            System.out.println("星期二");
        }
        else if(input == 3)
        {
            System.out.println("星期三");
        }
        else if(input == 4)
        {
            System.out.println("星期四");
        }
        else if(input == 5)
        {
            System.out.println("星期五");
        }
        else if (input == 6)
        {
            System.out.println("星期六");
        } else if (input == 7)
        {
            System.out.println("星期天");
        }
    }
}
