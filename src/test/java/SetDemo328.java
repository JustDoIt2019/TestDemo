package studying;

import org.testng.annotations.Test;
import java.util.*;

public class SetDemo328 {
    @Test
    public void test1() {
        Set set = new HashSet();
        set.add("abc");
        set.add("cde");
        set.add("efg");
        set.add("fgh");
        set.add("abc"); //重复的abc,set会自动将其去掉
        System.out.println("size=" + set.size());

        List list = new ArrayList();
        list.add("abc");
        list.add("aaa");
        list.add("fff");
        set.addAll(list); //将list中的值加入set,并去掉重复的abc
        System.out.println("size=" + set.size());

        //迭代器是一种设计模式，它是一个对象，它可以遍历并选择序列中的对象
        //Java中的Iterator功能比较简单，并且只能单向移动
        //List Set都可以使用
        for (Iterator it = set.iterator(); it.hasNext(); ) {
            System.out.println("value=" + it.next().toString());
        }
    }
}
