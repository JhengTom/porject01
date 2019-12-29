package com.tomjheng.bean;

/**
 * @author Tom
 * @date 2019/12/26 -下午 09:10
 */
public class Person {
    public Person() {
        System.out.println("我是人 Person建構子");
    }

    public Person(String name) {
        System.out.println("my name is:" + name);
    }

    public void walk() {
        System.out.println("我可以走路");
    }

    public String jump(String name) {
        return "Hi I'm" + name + "  i can jump very tall";
    }
}
