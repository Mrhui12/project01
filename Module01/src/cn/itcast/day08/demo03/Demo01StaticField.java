package cn.itcast.day08.demo03;
/*
如果一个成员变量使用了static关键字，那么这个对象不再属于自己，而是属于所在的类，多个对象共享同一份数据。
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖",19);
        one.room = "101教室";
        System.out.println("姓名：" + one.getName() + "，年龄："
                + one.getAge() +"，学号："+one.getId() + "，教室：" + one.room);
        Student two = new Student("黄蓉",16);
        System.out.println("姓名：" + two.getName() + "，年龄：" + two.getAge()
                + "，学号：" + two.getId() + "，教室：" + two.room);


    }
}
