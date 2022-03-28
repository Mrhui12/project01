package cn.itcast.list;

import java.util.*;
import java.util.Map.Entry;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        // 向Map中添加元素
        map.put("Tom", 26);

        map.put("Micky", 17);
        map.put("Kate", 15);
        map.put("Jack", 20);
        // 根据Key获取Value
        System.out.println("Jack is " + map.get("Jack") + " years old");
        // 移除
        map.remove("Micky");
        // 遍历Map
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("name:" + entry.getKey() + " age:"
                    + entry.getValue());
        }
        // Key相同的元素将被覆盖
        map.put("Jack", 19);
        // 根据Key获取Value
        System.out.println("Jack is " + map.get("Jack") + " years old");
        // 判断是否包含某个Key
        if (map.containsKey("Tom")) {
            System.out.println(map.get("Tom"));
        }
        // 判断是否包含某个Value
        if (map.containsValue(26)) {
            System.out.println("The map include the value 26");
        }
        // 判断map是否为空
        if (!map.isEmpty()) {
            // 获取map大小
            System.out.println("The map's size=" + map.size());
        }
        // 获取Key的集合
        for (String str : map.keySet()) {
            System.out.println(str);
        }

        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.putAll(map);
        // 输出内容按照key值排序
        for (Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("name:" + entry.getKey() + " age:"
                    + entry.getValue());
            // name:Jack age:19
            // name:Kate age:15
            // name:Tom age:26
        }

        System.out.println("=====================");

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
        // 向Map中添加元素
        linkedHashMap.put("Tom", 26);
        linkedHashMap.put("Jack", 18);
        linkedHashMap.put("Micky", 17);
        linkedHashMap.put("Kate", 15);
        // 保持了插入的顺序
        for (Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("name:" + entry.getKey() + " age:"
                    + entry.getValue());

            // name:Tom age:26
            // name:Jack age:18
            // name:Micky age:17
            // name:Kate age:15
        }
        System.out.println("=====================");
    }
}
