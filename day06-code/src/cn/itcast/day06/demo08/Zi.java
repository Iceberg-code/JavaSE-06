package cn.itcast.day06.demo08;

import javax.crypto.spec.PSource;

/*
* super关键字的用法有三种：
* 1、在子类的成员方法中，访问父类的成员变量
* 2、在子类的成员方法中，访问父类的成员方法
* 3、在子类的构造方法中，访问父类的构造方法
* */
public class Zi extends Fu {
    int num = 20;
    public Zi(){
//        super();    //访问父类构造方法，不写也会默认赠送
    }
    public void methodZi(){
        System.out.println(super.num);  //父类中的num
    }
    public void method(){
        super.method(); //访问父类当中的method
        System.out.println("子类方法");
    }
}
