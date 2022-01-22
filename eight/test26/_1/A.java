package eight.test26._1;

import java.util.*;

public class A {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("first", 1);
        map.put("second", 2);
        map.put("three", 3);

//        方法一
        Set<String> keset = map.keySet();
        Iterator<String> iter = keset.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println(key + " : " + map.get(key));
        }
//方法二
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>>  entryIter =  entrySet.iterator();
        while (entryIter.hasNext()){
             Map.Entry<String,Integer>  entry =  entryIter.next();
             System.out.println(entry.getKey() +" : " + entry.getValue());
        }

    }
}
