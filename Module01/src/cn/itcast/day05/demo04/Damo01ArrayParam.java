package cn.itcast.day05.demo04;
/*
数组可以作为方法的参数。
当调用方法的时候，向方法的小括号进行传参，传递进去的，其实是数组的地址值。
 */
public class Damo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println(array);

        printArray(array); // 传递的就是array当中保存的地址值
        System.out.println("==================aaaa========================");
        printArray(array);
        System.out.println("==================bbbb========================");
        printArray(array);

    }
    /*
    三要素：
    返回值类型：只是进行打印而已，不需要进行计算，也没有结果，void
    方法名称：printArray
    参数列表：必须给我数组，我才能打印其中的元素
     */
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("printArray方法接收的是" + array);
            System.out.println(array[i]);
        }
    }
}

