package cn.itcast.day11.demo01;

public class Math0 {
    public static void main(String[] args) {
        int[] a=new int[10];
        int i = 0;
        for (i=0; i< a.length; i++)
        {
            a[i]=i*i;
        }
        for (i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
