package niuke_ex;

/**
 * static修饰变量
 * @author sunlele
 * @className Test
 * @date 2019/7/1 12:47
 **/
public class Test {
    /**
     * static修饰的变量是类变量，不管有多少对象，使用的都是同一个 变量
     */
    private static int i=1;
    public int getNext() {
        //return i ++ ,先返回i，再进行++操作
        //return i = i+1，i+1完成后，返回
        return i ++;
    }
}
