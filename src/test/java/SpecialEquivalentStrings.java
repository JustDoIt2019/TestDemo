package stringStudy;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

/*
893. Groups of Special-Equivalent Strings

You are given an array A of strings.
Two strings S and T are special-equivalent if after any number of moves, S == T.
A move consists of choosing two indices i and j with i % 2 == j % 2, and swapping S[i] with S[j].
Now, a group of special-equivalent strings from A is a non-empty subset S of A such that any string not in S is not special-equivalent with any string in S.
Return the number of groups of special-equivalent strings from A.

Example 1:
Input: ["a","b","c","a","c","c"]
Output: 3
Explanation: 3 groups ["a","a"], ["b"], ["c","c","c"]
Example 2:
Input: ["aa","bb","ab","ba"]
Output: 4
Explanation: 4 groups ["aa"], ["bb"], ["ab"], ["ba"]
Example 3:
Input: ["abc","acb","bac","bca","cab","cba"]
Output: 3
Explanation: 3 groups ["abc","cba"], ["acb","bca"], ["bac","cab"]
Example 4:
Input: ["abcd","cdab","adcb","cbad"]
Output: 1
Explanation: 1 group ["abcd","cdab","adcb","cbad"]


Note:

1 <= A.length <= 1000
1 <= A[i].length <= 20
All A[i] have the same length.
All A[i] consist of only lowercase letters.
 *
 * 题目大意
可以对一个字符串的所有奇数位置或者偶数位置进行任意的调换顺序。如果两个字符串在经历了上面的操作之后，可以做到完全相等，那么就属于题目中的一个组。现在就要我们求最终分为几个组。*/
public class SpecialEquivalentStrings {

    @Test
    public void runCase() {
        String[] str = {"abc", "acb", "bac", "bca", "cab", "cba"};
        System.out.println(numSpecialEquivGroups(str));
    }

    public int numSpecialEquivGroups(String[] A) {
        Set set = new HashSet();
        for (String s : A) {
            set.add(swapString(s));
        }

        return set.size();
    }

    public String swapString(String s) {
        int[] even = new int[26];
        int[] odd = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even[s.charAt(i) - 'a']++;
            } else {
                odd[s.charAt(i) - 'a']++;
            }
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < even.length; i++) {
            while (even[i] > 0) {
                str.append((i + 26) + "");
                even[i]--;
            }
        }

        for (int i = 0; i < odd.length; i++) {
            while (odd[i] > 0) {
                str.append((i + 26) + "");
                odd[i]--;
            }
        }
        return str.toString();

    }
}

/*
* 解题思路，奇数偶数分别计数后存到set里
* 还是之前的技术点：String中读取char，用charAt(i)
* 记录字符的数量用char-'a'，做下标
* 下标转换成char，用（char+'a'）+""
* Set = HashSet不重复，无顺序*/

