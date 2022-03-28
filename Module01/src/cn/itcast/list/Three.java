package cn.itcast.list;

public class Three {
    public static void main(String[] args) {
//        int a=5;
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print("*");//不换行
            }
            System.out.println();
        }
    }
}
