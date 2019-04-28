package studying;

import org.testng.annotations.Test;
/*
537. Complex Number Multiplication
Given two strings representing two complex numbers.
You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

Example 1:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
Example 2:
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
*/
public class ComplexNumberMultiplication409 {
    @Test
    public void runComplexNumber() {
        String a = "1+1i";
        String b = "1+1i";
        System.out.println(complexNumberMultiply(a, b));
    }

    public String complexNumberMultiply(String a, String b) {
        String x[] = a.split("\\+|i"); // 学习正则表达式，用+和i 以及 | 共同分割string
        //  String x[] = a.split("i");
        String y[] = b.split("\\+|i");
        int a_real = Integer.parseInt(x[0]);//parseInt(), 将字符串解析为int类型。
        int a_img = Integer.parseInt(x[1]);
        int b_real = Integer.parseInt(y[0]);
        int b_img = Integer.parseInt(y[1]);
        return (a_real * b_real - a_img * b_img) + "+" + (a_real * b_img + a_img * b_real) + "i";
        // 主意int加减法与字符串的转换，自己可以再写一次
    }
}
