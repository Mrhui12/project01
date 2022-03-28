

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(isSame(10,20)); // false
        System.out.println(isSame(20,20)); // true
    }
    /*
    三要素：
    返回值类型：boolean
    方法名称：isSame
    参数列表：int a, int b
    */
    public static boolean isSame(int a, int b){
        /*boolean same;
        if(a == b){
            same = true;
        }
        same = false;*/
//        same = a == b ? true : false;
        return a == b;
    }
}

