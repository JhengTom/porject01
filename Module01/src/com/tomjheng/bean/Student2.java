package com.tomjheng.bean;

/**
 * @author Tom
 * @date 2019/12/26 -下午 09:29
 */
public class Student2 extends Person {

    public static void main(String[] args) {
        Person p = new Person();//啟動馬上印出 我是人
        System.out.print("多載建構子:");
        new Person("TOMMMM");
        System.out.print("呼叫父方法 無參數");
        p.walk();
        System.out.println("呼叫父方法 有參數方法"+p.jump("GGININI"));

    }

    public void love() {
        System.out.println("滿滿的愛");
    }
    public  Student2(){
        System.out.println("我是誰??  Student2建構子");
    }


}
