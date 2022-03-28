package leetcode.DC;

import java.util.ArrayList;
import java.util.List;

public class Demo241 {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list = new ArrayList<>();
        int len=expression.length();
        for (int i = 0; i < len; i++) {
            char c=expression.charAt(i);
            if (c=='+'||c=='-'||c=='*'){
                List<Integer> left= diffWaysToCompute(expression.substring(0,i));
                List<Integer>  right= diffWaysToCompute(expression.substring(i+1));
                for (int l:
                     left) {
                    for (int r:
                         right) {switch (c){
                        case '+':list.add(l+r);break;
                        case '-':list.add(l-r);break;
                        case '*':list.add(l*r);break;
                    }

                    }

                }
            }
        }
        if (list.isEmpty())list.add(Integer.parseInt(expression));
        return list;
    }
}
