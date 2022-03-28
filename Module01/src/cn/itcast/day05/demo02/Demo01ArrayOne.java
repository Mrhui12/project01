package cn.itcast.day05.demo02;
/*

 */
public class Demo01ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3]; // 动态初始化
        System.out.println(array); // 地址值
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 0
        System.out.println(array[2]); // 0
        System.out.println("===============");

//        改变数组中元素的内容
        array[1] = 10;
        array[2] = 20;
        System.out.println(array); // 地址值
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 10
        System.out.println(array[2]); // 20
    }
}
//栈：
// --main (String args[])
// ------int[] array
// ----System.out.println(array); // 地址值
// ----array[1] = 10;
// ----array[2] = 20;
//堆：
// --new int[3]地址的值
// ----[0][1][2]的值
//方法区：public static void main(String[] args)
