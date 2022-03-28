package leetcode.Part9;

public class Demo326 {
   static boolean isPowerOfThree(int n){
        while (n!=0&& n%3==0){
            n/=3;
        }
        return n==1;
    }

    public static void main(String[] args) {
        int   n=21;
        System.out.println(isPowerOfThree(n));
    }
}
