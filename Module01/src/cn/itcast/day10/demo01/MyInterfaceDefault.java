package cn.itcast.day10.demo01;
public interface MyInterfaceDefault {
    //    抽象方法
    public abstract void methodAbs();
//    又定义了一个抽象方法
//    public abstract void methodAbs2();

    // 新添加的方法，改成默认方法就可以解决问题
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}



