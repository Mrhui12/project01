package cn.itcast.day10.demo01;

public class Demo01Interface {
    public static void main(String[] args) {
//        错误写法！不能直接new接口对象使用。
        // MyInterfaceAbstract inter = new MyInterfaceAbstract();

//        创建实现类的对象使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();

    }
}

