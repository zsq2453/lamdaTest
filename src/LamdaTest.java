import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by shiqiangzhang on 2018/5/15.
 */
public class LamdaTest {
    public static void main(String[] args) {
        sortTest();
        threadTest();
    }

    public static void sortTest(){
        //1、forEach()
        List<String> users = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
//        users.forEach(a -> System.out.println(a));
//        users.forEach(System.out::println);
        Collections.sort(users, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        users.forEach(a -> System.out.println(a));
    }

    public static void threadTest(){
        //2、匿名类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("before java 8");
            }
        }).start();

        new Thread(()->System.out.println("since java 8")).start();
    }
}
