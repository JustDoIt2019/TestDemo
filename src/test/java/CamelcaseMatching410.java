package studying;

import org.testng.annotations.Test;
import utils.Tools;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching410 {
    @Test
    public void runCamelMatch() {
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String pattern = "FB";
        Tools.printList(camelMatch(queries, pattern));
    }

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> resultList = new ArrayList<Boolean>();
        for (int i = 0; i < queries.length; i++) {
            if (isMatch(queries[i], pattern))
                resultList.add(true);
            else
                resultList.add(false);
        }
        return resultList;
    }

    public boolean isMatch(String query, String pattern) {
        boolean dp[][] = new boolean[query.length() + 1][pattern.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i < query.length(); i++)
            if (Character.isLowerCase(query.charAt(i)))
                dp[i + 1][0] = dp[i][0];
        for (int i = 0; i < query.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if (query.charAt(i) == pattern.charAt(j))
                    dp[i + 1][j + 1] = dp[i][j];
                else if (Character.isLowerCase(query.charAt(i)))
                    dp[i + 1][j + 1] = dp[i][j + 1];
            }
        }
        return dp[query.length()][pattern.length()];
    }
}
