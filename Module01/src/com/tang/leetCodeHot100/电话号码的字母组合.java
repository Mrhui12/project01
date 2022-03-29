package com.tang.leetCodeHot100;

import java.util.ArrayList;
import java.util.List;

public class 电话号码的字母组合 {
    List<String> RES = new ArrayList<>();//定一个全局的答案
    String[] letter_map = {" ", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};//定一个字符串组

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return RES;//字符串为空或者长度等于0就返回答案
        iterStr(digits, new StringBuilder(), 0);//传入数字字符串，结果StringBuilder ,指针
        return RES;
    }

    private void iterStr(String str, StringBuilder letter, int i) {
        if (i == str.length()) {//递归终止条件
            RES.add(letter.toString());//将每次的BUFFER 结果加入RES
            return;//返回
        }
        char c = str.charAt(i);//根据指针去数据字符串的值
        String map_String = letter_map[c - '0'];
        for (int i1 = 0; i1 < map_String.length(); i1++) {
            letter.append(map_String.charAt(i1));//添加到末尾
            iterStr(str, letter, i + 1);
            letter.deleteCharAt(letter.length() - 1);//删除最后一个元素 //回溯
        }

    }
}
