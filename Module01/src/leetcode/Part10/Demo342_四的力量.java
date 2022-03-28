package leetcode.Part10;

public class Demo342_四的力量 {
    public static boolean isPowerOfYour(int n) {
        int ans = 1;
        boolean Flag = false;
        for (int i = 2; i < 32; i += 2) {
            ans <<= 2;
            if ((ans & n)==n) {
               return true;
            }

        }
        return Flag;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfYour(4));
    }
}
