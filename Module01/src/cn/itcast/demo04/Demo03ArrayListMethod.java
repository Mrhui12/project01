package cn.itcast.demo04;

import java.util.ArrayList;

/*
ArrayList当中的常用方法有：

public boolean add(E e)：向集合中添加元素，参数的类型和泛型一致。返回值代表动作是否成功
    备注：对于ArrayList集合来说，add添加动作一定是成功的，但对于其他集合add添加动作不一定成功。

public E get(int index)：从集合中获取元素，参数是索引编号，返回值就是对应的位置的元素。

public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。
public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。
public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // 向集合中添加元素：add
        boolean success = list.add("刘燕");
        System.out.println(list); // [刘燕]
        System.out.println("添加的动作是否成功:" + success); // true

        list.add("赵丽颖");
        list.add("李小璐");
        list.add("贾乃亮");
        list.add("赵又廷");
        System.out.println(list); // [刘燕, 赵丽颖, 李小璐, 贾乃亮, 赵又廷]

        // 从集合中获取元素：get。索引值从0开始
        String name = list.get(2);
        System.out.println("第2号索引" + name);

        // 从集合中删除元素：remove。索引值从0开始
        String whoRenamed = list.remove(2);
        System.out.println("被删除的人是：" + whoRenamed);
        System.out.println(list); // [刘燕, 赵丽颖, 贾乃亮, 赵又廷]

        int size = list.size(); // 获取集合的长度尺寸，也就是其中的元素个数
        System.out.println("集合的长度是：" + size);

    }
}

