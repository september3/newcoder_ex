package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sunlele
 * @className ListTraversalTest
 * @date 2019/7/4 22:47
 **/
public class ListTraversalTest {

    public static void main(String[] args) {
        List<User> list1 = new ArrayList<User>();
        User user1 = new User("赵子龙",34);
        User user2 = new User("刘备",23);
        User user3 = new User("吕布",23);
        list1.add(user1);
        list1.add(user2);
        list1.add(user3);


        for (int i = 0;i<list1.size();i++){
            System.out.println("for遍历输出list1集合中的元素"+list1.get(i));
        }
        System.out.println("---------------------------------");
        for (User user:list1) {
            System.out.println("for循环遍历输出list1集合中的元素"+user);
        }
        System.out.println("-------------------------------");
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println("Iterator遍历输出list1集合中的元素"+ iterator.next());
        }
    }
}
