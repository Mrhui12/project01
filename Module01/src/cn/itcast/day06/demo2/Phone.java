package cn.itcast.day06.demo2;
/*
定义一个类，用来模拟“手机”这个事物。

属性：品牌、价格、颜色
行为：打电话、发短信

对应到类当中：
成员变量（属性）：
    String bran; // 品牌
    String price; // 价格
    String color; // 颜色
成员方法（方法）：
    public void call(String who){} // 打电话
    public void SendMessage(){} // 群发短信
 */
public class Phone {
    // 成员变量
    String bran; // 品牌
    String price; // 价格
    String color; // 颜色

    //成员方法
    public void call(String who){
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }
}

