package cn.itcast.day10.demo05;
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi(); // 多态
        System.out.println(obj.num);
        obj.method(); // 父子都有，优先用子
        obj.methodFu(); // 子类没有，父类有，向上找到父类
        obj.showNum();
//        编译看左边，左边是Fu，Fu中没有methodZi方法，所以编译报错。
//        obj.methodZi(); // 错误写法
    }
}

