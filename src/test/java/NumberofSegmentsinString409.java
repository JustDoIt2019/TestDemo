package studying;

import org.testng.annotations.Test;
/*434. Number of Segments in a String

Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
Please note that the string does not contain any non-printable characters.

Example:
Input: "Hello, my name is John"
Output: 5
*/
public class NumberofSegmentsinString409 {
    @Test
    public void runCountSegment(){
        System.out.println(countSegments("hello, grace, good morning"));
    }
    public int countSegments(String s) {
        String s1 = s.trim();//去掉String前后空格
        if(s1.length()==0) return 0;
        String[] re = s1.split("\\s+"); //学习空格用法，正则
        return re.length;

    }
}
