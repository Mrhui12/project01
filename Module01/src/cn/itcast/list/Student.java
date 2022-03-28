package cn.itcast.list;
/**学生类**/
public class Student {

    //构造方法
    public Student(String _no,String _name,String _sex,int _score) {
        this.no=_no;
        this.name=_name;
        this.sex=_sex;
        this.score=_score;
    }
    public Student() {
    }

    public String no;//学号
    public String name; //姓名
    public String sex;  //性别
    public int score;  //成绩


    @Override
    public String toString() {
        return  "学号："+no+"\t姓名："+name+"\t性别："+sex+"\t成绩："+score;
    }

}