package cn.itcast.day06.demo05;
/*
一个标准的类通常要有下面四个组成部分：

1. 所有的成员变量都要使用private关键字修饰
2. 为每一个成员变量编写一对儿Getter、Setter方法
3. 编写一个无参数的构造方法
4. 编写一个全参数的构造方法

这样标准的类也叫做Java Bean
alt + insert-->快捷生成Getter和Setter方法
或者：code-->Generate生成Getter和Setter方法
这两种方法还能生成全参和无参的构造方法
 */
public class Student {

    private String name; // 姓名
    private int age; // 年龄

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Student(){
    }
    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }
}


