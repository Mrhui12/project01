package cn.itcast.day08.demo04;

import java.util.Arrays;
public class Demo01Arrays {

    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        // 将int数组按照格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"bbb","ccc" ,"aaa"};
        Arrays.sort(array2);
//        System.out.println(array2);
        System.out.println(Arrays.toString(array2));
    }
}

