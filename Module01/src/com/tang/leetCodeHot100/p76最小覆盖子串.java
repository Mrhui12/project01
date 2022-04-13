package com.tang.leetCodeHot100;

public class p76最小覆盖子串 {
    public String minWindow(String s,String t){
        int slen=s.length(),tlen=t.length();
        if (tlen>slen)return "";
        int[] cnt=new int[58];
        int flag=0;
        for (int i=0;i<tlen;i++){
            cnt[t.charAt(i)-'A']--;
            flag++;
        }
        int l=0,begin=0,len=Integer.MAX_VALUE;
        for (int r=0;r<slen;r++){
            int  index=s.charAt(r)-'A';
            if (cnt[index]<0){
                flag--;
            }cnt[index]++;
            while (flag==0&&cnt[s.charAt(l)-'A']>0){
                cnt[s.charAt(l)-'A']--;
                l++;
            }
            if (flag==0&&len>r-l){
                len=r-l;
                begin=l;
            }
        }
        return len>=slen?"":s.substring(begin,begin+len+1);
    }
}
/*
滑动窗口
先判断两个字符串长度
如果子串大于长串 直接返回为空
新建一个数据 长度为58
遍历子串 把每个对应字母的位置数组的值减一 同时Flag++;
之后去长串里面找
l=0 begin=0 len=MAX
            如果有相同的
        就flag--;
        并且把Cnt++;
        如果flag==0 且 cnt[s.charAt(l)-'A']>0
        l++
        cnt[s.charAt(l)]--;

       if(faag==0&&len>r-l) len=r-l begin=l;

      退出循环后判断 长度是不是比slen大  是就返回空 不是就返回子串 从begin,begin+len+1;
 */