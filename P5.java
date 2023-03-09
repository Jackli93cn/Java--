package com.Jackli.ST;

import java.util.Scanner;

//题目:接收用户输入的数据,判断是奇数还是偶数.
public class P5 {
    public static void main(String[] args) {
        //1.提示并接收用户输入的数据
        System.out.println("请输入你需要判断的数据");
        int input = new Scanner(System.in).nextInt();
        //2判断用户输入的数据
        if(input % 2 ==0){
            System.out.println(input+"是偶数");
        }
        else
        {
            System.out.println(input+"是奇数");
        }
    }
}
