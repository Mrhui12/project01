package leetcode.demoString;

public class p205同构字符串 {
    public boolean isIsomorphic(String s, String t) {

        int n = s.length();
        if (n != t.length()) return false;
        int[] sarry = new int[256];
        int[] tarry = new int[256];
        for (int i = 0; i < n; i++) {
            int snum = s.charAt(i) , tnum = t.charAt(i) ;
            if (sarry[snum] != tarry[tnum])
                return false;
            sarry[snum] = tarry[tnum] = i + 1;
        }
        return true;
    }

}
