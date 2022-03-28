package cn.itcast.list;

import java.util.HashMap;
import java.util.Map;

public class Collection02 {
    public static void main(String[] args) {

        Student tom = new Student("201701", "张学友", "男", 98);
        //System.out.println(tom);

        Student rose = new Student("201702", "张汇美", "女", 69);
        //System.out.println(rose);


        //定义一个map，字典，key->String,value->Student
        Map<String,Student> stus=new HashMap<>();

        //添加
        stus.put(tom.no, tom);
        stus.put("201702", rose);
        stus.put("201703", new Student("201703","张国立","男",78));
        stus.put("201704", new Student("201704","张娜啦","女",60));
        stus.put("201709", new Student("201709","张铁林","男",35));

        //取值，引用类型传地址
        System.out.println(stus.get("201702"));
        Student jack=stus.get("201709");
        jack.score=36;

        //长度
        System.out.println("个数："+stus.size());

        //遍历,所有key
        System.err.println("\n所有key：");
        for (String key : stus.keySet()) {
            System.out.println(key+"："+stus.get(key));
        }


        //是否存在某个对象
        System.out.println("是否存在key201702："+stus.containsKey("201702"));

        //删除
        //根据key
        stus.remove("201702");
        System.out.println("是否存在key201702："+stus.containsKey("201702"));
        //修改
        stus.put("201709", new Student("201709","张林铁","女",37));

        //遍历,所有value
        System.err.println("\n所有value：");
        for (Student v : stus.values()) {
            System.out.println(v);
        }


        //删除所有
        stus.clear();

        //长度
        System.out.println("个数："+stus.size());






    }
}
