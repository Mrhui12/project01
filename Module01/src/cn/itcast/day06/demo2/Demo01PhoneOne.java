package cn.itcast.day06.demo2;

public class Demo01PhoneOne {
    public static void main(String[] args) {
//        根据Phone类，创建一个名为one的对象
//        格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.bran); // null
        System.out.println(one.price); // null
        System.out.println(one.color); // null
        System.out.println("==============");

        one.bran = "苹果";
        one.price = "8388.0";
        one.color = "黑色";

        System.out.println(one.color); // 苹果
        System.out.println(one.price); // 8388.0
        System.out.println(one.bran); // 黑色

        one.call("小红"); // 给小红打电话
        one.sendMessage(); // 群发短信
    }
}
