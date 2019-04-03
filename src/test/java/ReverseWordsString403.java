package studying;

import org.testng.annotations.Test;

public class ReverseWordsString403 {
    @Test
    public void runCase(){
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public String reverseWords(String s){
        //String re = new String();
        String[] t=s.split(" ");
        StringBuilder re = new StringBuilder();
        for (String ele:t) {
            re.append(new StringBuilder(ele).reverse().toString() + " ");
            //new StringBuilder(s) 以上用法值得记一下
        }
        return re.toString().trim(); //trim()函数是去掉String字符串的首尾空格;
    }
}
