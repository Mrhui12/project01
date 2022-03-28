package leetcode.Part10;

public class Demo461_汉明距离 {
    public int hammingDistance(int x,int y){
        int diff=x^y,ans=0;
        while (diff!=0){
            ans+=diff&1;
            diff>>=1;
        }
        return ans;
    }
}
