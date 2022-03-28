package cn.itcast.day05.demo03;

public class Demo04ArrayMax {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 20, 1000};
        int max = array[0]; // 比武雷台
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素，比max更大，则换人
            if(array[i] > max){
                max = array[i];
            }
        }
        // 谁最厉害。谁能在max中留下谁的最大值。
        System.out.println("最大值：" + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素比min更小，则换人
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最小值：" + min);
    }
}

