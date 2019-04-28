package studying;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
//804  Return the number of different transformations among all words we have.

/*   字母对应Ascii：
 *A-Z 65-90
 *a-z 97-122
 */

public class UniqueMorseCodeWords403 {

    @Test
    public void runCase() {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};

        Set seen = new HashSet();
        for (String word : words) {
            StringBuilder code = new StringBuilder(); // 比StringBuffer速度快，用append不产生新的未使用对象
            for (char c : word.toCharArray())   //读取String中的char值方法：String.toCharArray()
                code.append(MORSE[c - 'a']);    //根据Assii码值来获取下标
            seen.add(code.toString());          // HashSet不重复无序
        }
        //如下错误点：
        //char 小写
        //add的时候StringBuilder要toString() 否则去重出错

        return seen.size();
    }
}
