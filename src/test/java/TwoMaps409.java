package studying;

import org.testng.annotations.Test;
import utils.Tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* 890
* You have a list of words and a pattern, and you want to know which words in words matches the pattern.
A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.
(Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)
Return a list of the words in words that match the given pattern.

You may return the answer in any order.

Example 1:
Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
since a and b map to the same letter.


Note:
1 <= words.length <= 50
1 <= pattern.length = words[i].length <= 20
本题目要求一一对应
*/


public class TwoMaps409 {
    @Test
    public void runFindandReplacePattern() {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        List list = findAndReplacePattern(words, pattern);
        Tools.printList(list);
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List list = new ArrayList();
        for (String word : words) {
            if (match(word, pattern)) list.add(word);
        }
        return list;
    }

    public boolean match(String word, String pattern) {
        //如果没有<Character,Character>，后面会出错
        HashMap<Character,Character> h1 = new HashMap();
        HashMap<Character,Character> h2 = new HashMap();
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!h1.containsKey(w)) h1.put(w, p); //put 会覆盖原有的key，value
            if (!h2.containsKey(p)) h2.put(p, w);
            //如果没有<Character,Character>，下面会出错
            if (h1.get(w) != p || h2.get(p) != w) {
                return false;
            }

        }
        return true;
    }

    @Test
    public void test() {
        HashMap h = new HashMap();
        System.out.println(h.put("a", "b"));
        System.out.println(h.put("a", "c"));
        System.out.println(h.get("a"));
    }
}
