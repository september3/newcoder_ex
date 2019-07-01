package niuke_ex;

/**
 * 静态变量的访问
 * @author sunlele
 * @className HasStatic
 * @date 2019/7/1 11:57
 **/
public class HasStatic {

    /**
     * 私有静态变量
     */
    private static int x = 100;

    public static void main(String[] args) {
        HasStatic hasStatic = new HasStatic();
        //避免通过一个类的对象的引用来访问静态变量或者静态方法，无畏增加编译器解析成本，直接使用类名来访问即可
        hasStatic.x ++;
        HasStatic hasStatic1 = new HasStatic();
        hasStatic1.x ++;
        hasStatic = new HasStatic();
        hasStatic.x ++;
        HasStatic.x --;
        System.out.println("x=" + x);

    }
}
