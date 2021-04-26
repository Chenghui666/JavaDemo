package cn.chenghui.demo02;

/*
* 用户类
* */
public class User {
    private String name;  //姓名
    private double money;  //余额

    /*空参构造方法*/
    public User() {
    }
    /*全参构造方法*/
    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    //普通方法：显示当前用户有多少钱
    public void show(){
        System.out.println("我叫" + name + "我有" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
