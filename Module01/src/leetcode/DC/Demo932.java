package leetcode.DC;

import java.util.HashMap;
import java.util.Map;

public class Demo932 {
    private Map<Integer, int[]> memory = new HashMap<>();

    public int[] beautifulArray(int n) {
        int[] temp = memory.get(n);//记忆做过的
        if (temp != null) {
            return temp;
        }
        int[] result = new int[n];
        int i = 0;
        if (n != 1) {
            for (int num : beautifulArray((n + 1) / 2)
            )
                result[i++] = num * 2 - 1;
            for (int num : beautifulArray(n / 2)
            ) {
                result[i++] = num * 2;
            }

        } else result[0] = 1;
        memory.put(n, result);
        return result;
    }
}
