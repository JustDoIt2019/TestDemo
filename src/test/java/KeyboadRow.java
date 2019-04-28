package map;

import org.testng.annotations.Test;

import java.util.*;

/*500 Keyboard Row
* Example:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
如果输入的单词在键盘同一行，则输出
*/
public class KeyboadRow {
    @Test
    public void runcases() {
        String[] keywords = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        List<String> list = new ArrayList<String>();
        for (String word : words) {
            if (test(word, keywords)) {
                list.add(word);
            }
        }
        //List 转换成String[],使用toArray(new String[length])
        words = list.toArray(new String[list.size()]);
        //String[]转换成List方法如下，但是不能再进行增删操作
        List lit = Arrays.asList(new String[] { "aaa", "bbb" });
        //String[] 转换成List 或者进行遍历后add（）
        Collections.addAll(lit,keywords);


        for (String word : words) {
            System.out.println(word);
        }
    }

    public Boolean test(String sub, String[] stra) {
        sub = sub.toLowerCase();
        Boolean flag = true;
        for (String str : stra) {
            for (char c : sub.toCharArray()) {
                if (str.indexOf(c + "") < 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) break;
        }
        return flag;
    }

}
