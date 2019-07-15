package classloader;

/**
 * @author sunlele
 * @className ClassB
 * @date 2019/7/14 09:12
 **/
public class ClassB {
    /**
     * 无父类，则按照声明顺序初始化自身的静态变量和静态块赋值
     * 静态块只执行一次
     */
    static {
        //没有调用构造器，ClassA的class对象就没有加载
        ClassA t2;
        System.out.println("C");
    }

    /**
     * 表明为启动类的类（即包含main()方法的类）要初始化，因此ClassB先行初始化
     * @param args
     */
    public static void main(String[] args) {
        Class c1;
        Class c2;
        Class c3;

        try {
            c1 = ClassA.class;
            c2 = Class.forName("ClassA");
            //初始化ClassA
            ClassA a = new ClassA();
            c3 = a.getClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        if(c2 == c1 && c1 == c3){
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        System.out.println(ClassA.count);
    }
}
