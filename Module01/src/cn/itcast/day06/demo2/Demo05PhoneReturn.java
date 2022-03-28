package cn.itcast.day06.demo2;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone phone =  getPhone();
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.bran = "华为";
        one.bran = "8833.0";
        one.color = "雾霾蓝";
        return one;
    }
}

