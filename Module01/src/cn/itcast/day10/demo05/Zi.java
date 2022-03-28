package cn.itcast.day10.demo05;

public class Zi extends Fu{
    //  成员变量不能重写，只有成员方法能重写
    int num = 20;

    int age = 16;
    @Override
    public void showNum(){
        System.out.println(num);
    }
    @Override
    public void method(){
        System.out.println("子类方法");
    }
    public void methodZi(){
        System.out.println("子类特有方法");
    }
}

