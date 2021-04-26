package cn.chenghui.demo02;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author GH
 * */
public class Member extends User{
    public Member() {
//        super(); //编译器默认给添加
    }

    /*全参构造方法*/
    public Member(String name, int money) {
        super(name, money); // 调用父类参构造方法，并将数据赋值给成员变量
    }

    /**
     * @param list 红包的份额集合
     * */
    public void receive(ArrayList<Double> list){
        int index = new Random().nextInt(list.size());//生成一个随机数
        Double delta = list.remove(index); //删除列表中的一份金额并返回数值
        double money = super.getMoney(); //获取用户本来的金额
        super.setMoney(money + delta); //将用户得到的金额和本来的金额相加得到最终余额
    }
}
