package leetcode.demoString;

public class p647回文子串 {

    public  int countSubstring(String s) {//动态规整法
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < 2 * n - 1; i++) {//长度为2n-1 l=i/2 r=l+i%2;
            int l = i / 2;
            int r = l + i % 2;
            while (l >= 0 && r <n && s.charAt(l) == s.charAt(r)) {//考虑边界条件
                l--;
                r++;
                ans++;
            }
        }
        return ans;
    }
    /*
      public  int countSubstring(String s) {//动态规整法
        int n = s.length();
        int ans=0;
        boolean[][] dps=new boolean[n][n];
      for(int i=0,i<n,i++){
      for(int j=0,i<=i,j++){
      if(s.charAt(i)==s.charAt(j)&&(i-j<2||dps[i-1][j+1])
      dps[i][j]=true;
      ans++;
      }
      }
        return ans;
    }
     */

    public static void main(String[] args) {
        String s="abbcbba";
        p647回文子串 p = new p647回文子串();
        System.out.println(p.countSubstring(s));

    }
}
