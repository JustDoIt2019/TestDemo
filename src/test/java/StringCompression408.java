package studying;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/* 403
Given an array of characters, compress it in-place.
The length after compression must always be smaller than or equal to the original array.
Every element of the array should be a character (not int) of length 1.
After you are done modifying the input array in-place, return the new length of the array.

Follow up:
Could you solve it using only O(1) extra space?
Example 1:
Input: ["a","a","b","b","c","c","c"]
Output: Return 6, ["a","2","b","2","c","3"]
Explanation: "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".

Example 2:
Input: ["a"]
Output: Return 1, and the first 1 characters of the input array should be: ["a"]
Explanation: Nothing is replaced.

Example 3:
Input: ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".

Notice each digit has it's own entry in the array.
Note: All characters have an ASCII value in [35, 126].
        1 <= len(chars) <= 1000.
*/
public class StringCompression408 {
@Test
public void runCompressString(){
   char[] ch1 = {'a','a','b','b','b','c','c'};
  System.out.println(compress(ch1));
   // System.out.println(compress(ch2));
}
    public int compress(char[] chars) {
        int label = 0;
        List list = new ArrayList<>();
        for (int index = 0; index < chars.length; index++) {
            if (index + 1 == chars.length || chars[index + 1] != chars[index]) {
               list.add(chars[label]);
                // chars[newIndex++] = chars[label];
                if (index > label) {
                    char[] a = ((index - label + 1)+"").toCharArray();
                    for (char c: a) {
                        //chars[newIndex++] = c;
                        list.add(c);
                    }
                    //学一下如何将int 存入char[]，先转化成String再转换成toCharArray()
                }
                label = index + 1;
            }
        }

        for (int i=0;i<list.size();i++) {
            System.out.print(list.get(i));
            if(i<list.size()-1) {
                System.out.print(", ");
            }else {
                System.out.println(" ");
            }
        }
       // System.out.println(chars.toString());
        return list.size();
    }
}
