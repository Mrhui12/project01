package Strature.Data.Recursion;

import java.util.HashSet;

public class Maze {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i]=1;
            map[7][i]=1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0]=1;
            map[i][6]=1;
        }
        map[3][1]=1;
        map[3][2]=1;
//        map[1][2]=1;
//        map[2][2]=1;

        System.out.println("地图情况");
        for (int i = 0; i < 8; i++) {
            for (int i1 = 0; i1 < 7; i1++) {
                System.out.print(map[i][i1]+" ");
            }
            System.out.println();
        }
    }
    public int maxSubArray(int[] nums){
        int pre = 0, maxAns = nums[0];
        for (int x : nums
        ) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(pre, maxAns);

        }
        return maxAns;
    }
    
 
}
