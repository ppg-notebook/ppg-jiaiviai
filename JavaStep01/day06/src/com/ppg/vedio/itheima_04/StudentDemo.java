package com.ppg.vedio.itheima_04;

/*
    学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //使用set方法给成员变量赋值
        s.setName("林青霞");
        s.setAge(30);

        //输出成员变量的值
        System.out.println(s.getName() + "," + s.getAge());
    }
}