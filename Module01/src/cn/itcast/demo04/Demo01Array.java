package cn.itcast.demo04;
/*
定义一个数组，用来生成一个Person对象
 */

import java.sql.SQLOutput;

public class Demo01Array {
    public static void main(String[] args) {
        // 首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("迪丽热巴" , 18);
        Person two = new Person("古力娜扎",20);
        Person three  = new Person("马尔扎哈" , 38);

//        将one当中的地址赋值到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]); // 地址值
        System.out.println(array[1]); // 地址值
        System.out.println(array[2]); // 地址值

        Person person = array[1];
        System.out.println(person.getName()); // 古力娜扎

    }
}


