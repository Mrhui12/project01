package cn.itcast.day08.demo03;
import cn.itcast.day08.demo02.Demo05StringSplit;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // 首先创建对象
        obj.method(); // 然后才能使用没有static关键字的内容

        // 对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称进行调用
        obj.methodStatic(); // 正确，不推荐，容易误以为是普通的成员方法，这种写法在编译之后也会被javac翻译成“类名.静态方法名”
        MyClass.methodStatic(); // 正确，推荐，静态方法强烈推荐用类名称来编写

        // 对于本类中的静态方法，可以省略类名称
        myMethod();
        Demo02StaticMethod.myMethod(); // 完全等效

    }

    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}

