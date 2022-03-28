package cn.itcast.day05.demo03;
/*
如何获取数组的长度、格式：
数组名称.length

这将会得到一个int数字，带表数组的长度。

数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10, 20, 30, 3, 4,  5, 6, 7, 8, 9};
        int len = arrayB.length;
        System.out.println("ArrayB数组的长度是：" + len);
        System.out.println("=================");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length); // 3
        arrayC = new int[5]; // 新的堆中数组，赋值给arrayC
        System.out.println(arrayC.length); // 5
    }
}


