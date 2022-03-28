package leetcode.Part10;

public class Demo476_补数 {
    public int findComplement(int num) {
        int ans = 0;
        int m = 0;
        while (num > 0) {
            int n = num % 2;
            n = ~n;
            n <<= m;
            ans += n;
            m++;
            num >>= 1;
        }
        return ans;
    }
}
