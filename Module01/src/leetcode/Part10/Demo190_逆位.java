package leetcode.Part10;

public  class Demo190_逆位 {
    public static int reverseBits(int n){
        int ans=0;
        for (int i = 0; i < 32; i++) {
            ans<<=1;
            ans+=n&1;
            n>>=1;
        }
        return  ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
}
