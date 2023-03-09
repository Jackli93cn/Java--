package com.Jackli.ST;

import java.util.Scanner;

//题目:获取邮箱名字
//接收用户输入的邮箱名,获取邮箱的名字
public class P14 {
    public static void main(String[] args) {
        System.out.println("输入Email:");
        String e = new Scanner(System.in).nextLine();
        //email地址为e,传递到该方法,
        //并得到方法返回的名字,保存到变量n
        String n = getName(e);
        System.out.println(n);
    }

    static String getName(String email){
        /*
        "sdfwerw@rewerwe.com"
                        1
                         index

         1.定位"@"的下标位置index
         2.截取[0,index),直接返回
         email.indexOf("@")
                    查找指定字符串的位置
                    找不到,得到特殊值-1
         email.substring(0,index)
                    截取[0,index)
         */
        //找到@的位置
        int index = email.indexOf("@");
        if (index == -1){
            //找不到
            return "邮箱格式错误";
        }
        //截取,直接返回截取结果
        return email.substring(0,index);
    }
}
