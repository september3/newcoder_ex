package collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author sunlele
 * @className MapTraversalTest
 * @date 2019/7/4 22:43
 **/
public class MapTraversalTest {

    public static void main(String[] args) {

        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("1","s1");
        map1.put("2","s2");
        map1.put("3","s3");

        for (String key:map1.keySet()) {
            System.out.println("Map.keySet遍历输出map1集合" + key);
        }
        System.out.println("------------------");

        Iterator<Map.Entry<String, String>> iterator = map1.entrySet().iterator();
        while (iterator.hasNext()){
           Map.Entry<String,String> entry = iterator.next();
            System.out.println("Iterator遍历输出map1集合：" + entry.getKey());
        }

        System.out.println("--大容量推荐使用-----------------");
        for (Map.Entry<String,String> entry : map1.entrySet()){
            System.out.println("Entry遍历输出map1集合：" + entry.getKey());
        }
        System.out.println("----只遍历value，不遍历key-------------");
        for (String v : map1.values()){
            System.out.println(v);
        }
    }
}
