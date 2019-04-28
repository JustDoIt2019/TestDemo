package studying;

import org.testng.annotations.Test;
/* 791. Custom Sort String
S and T are strings composed of lowercase letters. In S, no letter occurs more than once.
S was sorted in some custom order previously. We want to permute the characters of T so that they match the order that S was sorted. More specifically, if x occurs before y in S, then x should occur before y in the returned string.
Return any permutation of T (as a string) that satisfies this property.

Example :
Input:
S = "cba"
T = "abcd"
Output: "cbad"
Explanation:
"a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a".
Since "d" does not appear in S, it can be at any position in T. "dcba", "cdba", "cbda" are also valid outputs.
就是按照S的顺序重新排列T，不在S中的字母排在后面，顺序不限
解题重点复习了：
1. String.charAt()
2. char-'a'  可以组成数组下标，构成一个长度26的数组，记录对应元素的数量
3. (char)(int1+'a')可以让数字重新编辑成为字母
4. StringBuilder.append()
5. 判断一个char是否在一个String中，使用了indexOf
*/
public class CustomSortString410 {
    @Test
    public void runCustomSortString() {
//        String S = "cba";
//        String T = "abcd";

        String S = "exv";
        String T = "xwvee";
        System.out.println(customSortString(S, T));
    }

    public String customSortString(String S, String T) {
        int[] c = new int[26];
        for (int i = 0; i < T.length(); i++) {
            c[T.charAt(i) - 'a']++;
        }
        StringBuilder re = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            int count = c[S.charAt(i) - 'a'];
            while (count > 0) {
                re.append(S.charAt(i));
                count--;
            }

        }

        for (int i = 0; i < c.length; i++) {
            char ele = (char) (i + 'a');
            if (S.indexOf(ele) < 0) {
                int count = c[i];
                while (count > 0) {
                    re.append(ele);
                    count--;
                }
            }

        }
        return re.toString();


    }
}
