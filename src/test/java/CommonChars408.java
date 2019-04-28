package studying;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
//1002 Given an array A of strings made only from lowercase letters,
// return a list of all characters that show up in all strings within the list
// (including duplicates).  For example, if a character occurs 3 times in all strings
// but not 4 times, you need to include that character three times in the final answer.
//You may return the answer in any order.

//
//Example 1:
//Input: ["bella","label","roller"]
//Output: ["e","l","l"]

//Example 2:
//Input: ["cool","lock","cook"]
//Output: ["c","o"]


public class CommonChars408 {
    @Test
    public void runCommonChars() {
        String[] str = {"bella", "label", "roller"};
        List list = commonChars(str);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public List<String> commonChars(String[] A) {
        int[][] hash = new int[A.length][26];
        for (int i = 0; i < A.length; i++) {
            for (char ch : A[i].toCharArray()) {
                int j = ch -'a';
                hash[i][ch - 'a']++;
            }
        }
        List<String> re = new ArrayList<>();
        for (int col = 0; col < 26; col++) {
            int min = Integer.MAX_VALUE;
            for (int row = 0; row < A.length; row++) {
                min = Math.min(hash[row][col], min);
                if (min == 0) break;
            }

            while (min > 0) {
                re.add((char)(col + 'a') + "");
                //int转换成char使用强制向下转型即可
                min--;
            }
        }
        return re;
    }
}
