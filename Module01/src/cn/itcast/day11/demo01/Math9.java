package cn.itcast.day11.demo01;

import java.util.Scanner;

public class Math9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int week=0;
        System.out.println("请输入周：");
        week = scanner.nextInt();

        switch (week){
            case 1:
                System.out.println("星期一");
            break;
            case 2:
                System.out.println("星期2");
            break;
            case 3:
                System.out.println("星期3");
            break;
            case 4:
                System.out.println("星期4");
            break;
            case 5:
                System.out.println("星期五");
            break;
            case 6:
                System.out.println("星期六");
            break;
            case 7:
                System.out.println("星期天");
            break;
            default:
                System.out.println("输入有误");
            break;

        }
    }
}
