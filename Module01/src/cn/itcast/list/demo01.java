package cn.itcast.list;

import java.util.*;

public class demo01 {

    public static void main(String[] args) {

        //定义一个集合，只能存Integer
        List<Integer> marks=new ArrayList<Integer>();

        Integer k=75;

        //添加
        marks.add(10);  //0
        marks.add(90);  //1
        marks.add(37);
        marks.add(k);
        marks.add(58);
        marks.add(77);

        //取值
        System.out.println(marks.get(1));

        //长度
        System.out.println("个数："+marks.size());

        //遍历
        System.out.println("遍历：");
        for (Integer n : marks) {
            System.out.println(n);
        }

        //根据索引删除
        marks.remove(2);
        //根据对象删除
        marks.remove(k);
//        System.out.println("个数："+marks.size());
//
//        //遍历
//        System.out.println("遍历：");
//        for (Integer n : marks) {
//            System.out.println(n);
//        }
        Integer d=null;
        for (Integer j : marks) {
            if(j==90){
                d=j;
                break;
            }
        }
        marks.remove(d);

        //修改
        marks.set(0, 9);  //将下标0对应的值修改为9

        //循环
        System.out.println("个数："+marks.size());
        System.out.println("循环：");
        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }

        //删除所有
        marks.clear();
        System.out.println("个数："+marks.size());

    }

}