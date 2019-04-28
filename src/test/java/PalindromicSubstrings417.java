package studying;

import org.testng.annotations.Test;

public class PalindromicSubstrings417 {

    public boolean isPalindromic(String s) {
        for (int i = 0; i < (s.length() / 2); i++)
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        return true;
    }

    @Test
    public void countSubstrings() {
        String s = "asdfbfdsa";
        int len = s.length();
        int[] dp = new int[len];
        for (int i = 1; i < len; i++) {
            int tmpNum = 0;
            for (int j = 0; j < i; j++)
                if (s.charAt(i) == s.charAt(j)) {
                    String subStr = s.substring(j, i + 1);
                    if (isPalindromic(subStr))
                        tmpNum++;
                }
            dp[i] = dp[i - 1] + tmpNum;
        }
        System.out.println(dp[len - 1] + len);
    }


}
