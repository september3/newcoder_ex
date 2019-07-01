package niuke_ex;

/**
 * static修饰变量
 * @author sunlele
 * @className StaticTest
 * @date 2019/7/1 12:45
 **/
public class StaticTest {

    public static void main(String [] args){
        Test test=new Test();
        Test testObject=new Test();
        test.getNext();
        testObject.getNext();
        System.out.println(testObject.getNext());
    }


}
