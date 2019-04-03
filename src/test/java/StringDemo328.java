package studying;

import org.testng.annotations.Test;
import java.util.HashSet;
import java.util.Set;

public class StringDemo328 {
    String[] s = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
    public int numUniqueEmails(String[] emails) {
       // Set<String> seen = new HashSet();
        Set seen = new HashSet();
//以上写法也对
        for (String email : emails) {
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")) {
                //local = local.substring(0, local.indexOf('+'));
                String[] a = local.split("\\+");
                local = a[0];
            }
            local = local.replaceAll("\\pP", "");
            System.out.println(local);
            seen.add(local + rest);
        }

        return seen.size();
    }
    @Test
    public void test(){
        int re = numUniqueEmails(s);
        System.out.println(re);
    }
}



