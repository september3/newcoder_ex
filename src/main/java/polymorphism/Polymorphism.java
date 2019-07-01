package polymorphism;

/**
 * 多态
 * 情景描述：A派生出子类B，B派生出子类C
 * @author sunlele
 * @className polymorphism.Polymorphism
 * @date 2019/7/1 10:45
 **/
public class Polymorphism {
    public static void main(String[] args) {
        A a0=new A();
        A a1=new B();
        A a2=new C();
    }

}
