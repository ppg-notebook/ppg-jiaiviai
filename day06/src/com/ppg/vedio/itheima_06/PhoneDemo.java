package com.ppg.vedio.itheima_06;

/*
    测试类
 */
public class PhoneDemo {
    public static void main(String[] args) {
        //无参构造方法+set方法
        Phone p1 = new Phone();
        p1.setBrand("小米");
        p1.setPrice(2999);
        System.out.println(p1.getBrand() + "," + p1.getPrice());

        //带参构造方法
        Phone p2 = new Phone("小米", 2999);
        System.out.println(p2.getBrand() + "," + p2.getPrice());
    }
}
