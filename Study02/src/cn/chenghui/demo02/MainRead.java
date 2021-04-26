package cn.chenghui.demo02;

import java.util.ArrayList;

/*
* 实现一个群主发红包，群成员抢红包的程序
*
* 1.群主和成员都是用户，定义一个用户类，其中具有姓名和金额属性，和查看当前余额的方法
* 2.定义群主类和成员类都继承与用户类
* 3.在群主类用编写发红包程序，在成员类中编写收红包程序
* 4.在main方法中创建群主和成员的对象，调用群主的发红包方法和成员的收红包方法
* */

public class MainRead {
    public static void main(String[] args) {
        //创建群主对象实例
        Manager manager = new Manager("群主", 100);
        //创建群员对象实例
        Member one = new Member("成员A，", 10);
        Member two = new Member("成员B，", 10);
        Member three = new Member("成员C，", 10);
        //显示群主和成员原来的金额
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("====================");

        //群主发红包20元分成三份，返回没集合中存放每一份的金额
        ArrayList<Double> list = manager.send(55, 3);
        if (list.size()>0){
            //成员领取红包
            one.receive(list);
            two.receive(list);
            three.receive(list);
            //显示群主和成员的金额
            manager.show(); //80
            one.show();  //6
            two.show();  //6
            three.show();//8
        }
    }
}
