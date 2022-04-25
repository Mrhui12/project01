package com.tang.leetcode1.search;

public class p547省份数量 {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[]  visited= new boolean[n];
        int ans=0;
        for (int i = 0; i < n; i++) {
           if (!visited[i]){
               dfs(visited,isConnected,i);
               ans++;
           }
        }
            return  ans;
    }

    private void dfs(boolean[] visited, int[][] isConnected, int i) {
        for (int j = 0; j < isConnected.length; j++) {
            if (!visited[j]&&isConnected[i][j]==1){
                visited[j]=true;
                dfs(visited,isConnected,j);
            }
        }
    }
}
/*
        并查集问题
        1.遍历所有点 判断当前点有没有参观
        没有就去递归 当前点
        递归进去把到当前点 变为true;
        之后再遍历所有路径 如果当前路径没有被参观 且连接为1直接再递归当前路径
        递归结束 ans++;
 */