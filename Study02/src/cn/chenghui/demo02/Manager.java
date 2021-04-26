package cn.chenghui.demo02;

import java.util.ArrayList;

/*
* 群主类继承自用户类
* */
public class Manager extends User {
    /*空参构造方法*/
    public Manager() {
    }

    /*重写父类构造方法*/
    public Manager(String name, int money) {
        super(name, money);
    }

    /**
     * @param count 红包的个数
     * @param money 要发红包的总钱数
     * @return 存放每份红包的金额
     * */
    public ArrayList<Double> send(int money, int count){
        ArrayList<Double> list = new ArrayList<>();
        //首先看群主自己有多少钱
        double leftMoney = super.getMoney(); //群主当前余额
        if (money > leftMoney) {  //自己发的红包金额是否大于自己的余额
            System.out.println("余额不足");
            return list;
        }
        //扣钱,起始就是重新设置余额，总数-发出数
        super.setMoney(leftMoney - money);
        //发红包平均分
        double avg = money / count;
        double mod = money % count; //余数
        //余下的包在最后一个红包之中
        for (int i = 0; i < count; i++) {
            if (i == count-1){
                list.add(avg+mod);
            } else {
                list.add(avg);
            }
        }
        return list;
    }
}
