package cn.itcast.day09.demo14;



public class User {

    private String name; // 姓名
    private int money; // 余额，也就是当前用户所有的钱数

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {
    }

    // 展示一下，当前用户有多少钱
    public void money() {
        System.out.println("我叫什么：" + name + "，我有多少钱：" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void show() {
        System.out.println("姓名：" + this.getName() + "，余额：" + this.getMoney());
    }
}