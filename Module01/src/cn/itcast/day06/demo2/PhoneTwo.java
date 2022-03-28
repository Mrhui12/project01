package cn.itcast.day06.demo2;

public class PhoneTwo {
    public static void main(String[] args) {
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
        System.out.println("==============");

        Phone two = new Phone();
        System.out.println(two.bran); // null
        System.out.println(two.price); // null
        System.out.println(two.color); // null
        System.out.println("==============");

        two.bran = "三星";
        two.price = "5999.0";
        two.color = "蓝色";

        System.out.println(two.color); // 苹果
        System.out.println(two.price); // 8388.0
        System.out.println(two.bran); // 黑色

        two.call("乔布斯"); // 给小红打电话
        two.sendMessage(); // 群发短信
    }
}

