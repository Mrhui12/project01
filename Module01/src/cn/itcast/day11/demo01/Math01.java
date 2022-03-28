package cn.itcast.day11.demo01;

import java.util.Scanner;

public class Math01 {

    public static void main(String[] args) {
        //统计平均成绩
        //实例化（创建）长度为5的数组
        int[] scores=new int[5];
        int sum=0;


        //输入器
        Scanner input=new Scanner(System.in);

        //scores.length 数组的长度
        for (int i = 0; i <scores.length; i++) {
            scores[i]=input.nextInt();
        }
        
        //遍历数组
        for (int i = 0; i < scores.length; i++) {
            sum=sum+scores[i];
        }

        System.out.println("总分是："+sum+"，平均分："+(sum/scores.length));
    }

}