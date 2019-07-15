package classloader;

/**
 * @author sunlele
 * @className A
 * @date 2019/7/14 09:10
 **/
public class ClassA {

    static  int count = 0;
    static {
        count ++;
        System.out.println("A");
    }

    /**
     * 构造函数不能构造带有static的类变量
     */
    public ClassA() {
        System.out.println("B");
    }
}
