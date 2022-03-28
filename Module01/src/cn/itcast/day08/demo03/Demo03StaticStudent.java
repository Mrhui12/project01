package cn.itcast.day08.demo03;
// static变量在方法区的静态区中保存。
// 注意：根据类名称访问静态成员变量的时候，全程和对象没关系，只和类有关系。
public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room = "101教室";

        Student one = new Student("郭靖" , 20);
        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + one.room);
        System.out.println("one的教室：" + Student.room);

        Student two = new Student("黄蓉", 18);
        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教室：" + two.room);
        System.out.println("two的教室：" + Student.room);

    }
}

