package cn.itcast.list;

import java.util.HashMap;

//import java.util.HashMap;
import java.util.Map;
public class StudentClient {
    //方法  主方法 静态 数组
    public static void main(String[] args) {
        Stu s1=new Stu("201701","张学友","男");
        Stu s2=new Stu("201702","张汇美","女");
        Stu s3=new Stu("201703","张卫健","男");


        //创建一个Map集合 <>泛型 集合中只能存放学生对象
        //键是字符类型，值是Stu类型
        Map<String,Stu> students=new HashMap();

        //添加对象
        students.put(s1.no,s1);
        students.put(s2.no,s2);
        students.put("201703",s3);

        //取集合中key对应的元素
        students.get("201703").show();
        System.out.println("=====================");
        //遍历key
        for (String key : students.keySet()) {
            System.out.println("key："+key);
        }
        System.out.println("=====================");
        //移除
        students.remove("201702");

        //遍历Value
        for (Stu s : students.values()) {
            s.show();
        }

        //移除所有
        students.clear();

        System.out.println("总个数："+students.size());


    }
}

/**学生*/
class Stu
{
    //构造方法
    public Stu(String no,String name,String sex) {
        this.no=no;
        this.name=name;
        this.sex=sex;
    }
    //属性
    public String no;  //学号
    public String name;  //姓名
    public String sex;  //性别
    //方法
    public void show(){
        System.out.println("学号："+no+" 姓名："+name+" 性别："+sex);
    }
}