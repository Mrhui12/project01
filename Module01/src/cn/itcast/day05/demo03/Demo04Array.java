package cn.itcast.day05.demo03;
/*
遍历数组：说的就是对数组当中的每一个元素进行逐一、挨个儿处理。默认的处理方式就是打印输出。
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15, 20, 30, 40, 50, 4};

        // 首先使用原始方式
        System.out.println(array[0]); // 15
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30
        System.out.println(array[3]); // 40
        System.out.println(array[4]); // 50
        System.out.println(array[5]); // 4
        System.out.println("==============");

        // 使用循环，次数其实就是数组的长度
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

