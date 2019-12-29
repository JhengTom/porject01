package com.tomjheng.bean;

/**
 * @author Tom
 * @date 2019/12/26 -下午 11:13
 */

//        我是人  Person建構子
//        多載建構子:my name is:TOMMMM
//        呼叫父方法 無參數我可以走路
//        呼叫父方法 有參數方法Hi I'mGGININI  i can jump very tall
public class Student4 extends Student2{
    @Override
    public void love() {
        System.out.println("不愛了");
    }
}
