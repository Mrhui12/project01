package cn.itcast.day10.demo03;
/*
这个子接口中有几个方法？答：4个
mothodA来自于接口A
methodB来自于接口B
methodCommon来自于接口A和B
method来自于我自己
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    public  abstract void method();

    @Override
    public default void methodDefault() {

    }
}

