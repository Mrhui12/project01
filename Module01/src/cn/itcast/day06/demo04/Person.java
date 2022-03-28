package cn.itcast.day06.demo04;
/*
当方法的局部变量和类的变量重名的时候，根据“就近原则”，优先使用局部变量。
如果需要访问本类当中的成员变量，需要使用格式：
this.成员变量名
“通过谁调用的方法，谁就是this。”
this主要在重名的条件下起到区分的效果。
 */
public class Person {
    String name; // 成员的名字

    // 参数who是对方的名字
    // 成员变量name是自己的名字
    public void sayHello(String name){
        System.out.println(name + "，你好。我是" + this.name);
        System.out.println(this); // cn.itcast.day06.demo04.Person@6e8dacdf
    }

}
