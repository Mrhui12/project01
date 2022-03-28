package cn.itcast.day08.demo04;
/*
题目：
计算在 -10.8 到 5.9 之间，绝对值大于6或者小于2.1的整数有多少个？

分析：
1. 既然已经确定了范围，for循环
2. 起点位置-10.8应该可以转换成-10，两种办法；
    2.1 可以使用Math.ceil方法，向上（向正方向）取整
    2.2 强转成int，自动舍弃所有小数位
3. 每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的
4. 如何拿到绝对值。Math.abs方法
5. 一旦发现了一个数字，需要让计数器++进行统计。

备注：如果使用Math.ceil方法，-10.8可以变成 - 10.0。注意double也是可以++的。
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        int count = 0;
        int low = (int)Math.ceil(-10.8);
        int up = (int)Math.floor(5.9);
        // 这样处理，i就是区间内所有的正式
        for(int i = low; i <= up; i++){
            int abs = Math.abs(i);
            if(abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有"+count + "个数字是满足要求的。");
    }
}


