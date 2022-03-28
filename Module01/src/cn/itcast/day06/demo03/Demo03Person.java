package cn.itcast.day06.demo03;
/*
问题描述：定义Person的年龄时，无法阻止不合理的的数值被设置进来。
解决方案：用private关键字将需要保护的成员变量进行修饰。

一旦使用了private进行修饰，那么本类当中仍然可以随意访问。
但是！超出本类范围之外就不能再直接访问了。
 */
public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "赵丽颖";
//        person.age = -20; // 直接访问private数据
        person.setAge(-20);
        person.show();
    }
}


