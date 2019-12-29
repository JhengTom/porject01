package com.tomjheng.java;

import com.tomjheng.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Tom
 * @date 2019/12/26 -下午 12:19
 *
 * settings - editor - Live Templates / postfix Completions
 *
 */
public class TemplatesTest {
//psf
public static final Customer cus=new Customer();
//psfi
public static final int NUM = 1 ;
//psfs
public static final String NATION="TOM.J"  ;


    //psvm
    public static void main(String[] args) {
   //sout
        System.out.println("hellos");

        //soutm mathod
        System.out.println("TemplatesTest.main");
        //soutp param
        System.out.println("args = " + Arrays.deepToString(args));
        //soutv value

        int a=0;
        System.out.println("a = " + a);
        int b=20;
        //b.sout
        System.out.println(b);
        //b.soutv
        System.out.println("b = " + b);

        //fori
        String[] arr=new String[]{"Tom","Mandy","Jerry","Jason"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
            //iter
        for (String s : arr) {
            System.out.println(s);
        }
            //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //list.for
        ArrayList<String> test_list = new ArrayList<String>(Arrays.asList(arr));
        for (String s : test_list) {
            System.out.println(s);
        }
        //list.fori
        for (int i = 0; i < test_list.size(); i++) {

        }
        //list.forr
        for (int i = test_list.size() - 1; i >= 0; i--) {

        }
    }
    public void method(){

        ArrayList<Integer> list = new ArrayList<>();
list.add(222);
list.add(333);
list.add(444);
list.add(555);
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //xxx.nn
        if (list != null) {

        }
        //xxx.null
        if (list == null) {

        }

    }
}
