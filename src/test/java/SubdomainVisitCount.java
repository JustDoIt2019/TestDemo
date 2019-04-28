package map;

import org.testng.annotations.Test;

import java.util.*;
/*
* 811. Subdomain Visit Count
* A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.
Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".
We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.

Example 1:
Input:
["9001 discuss.leetcode.com"]
Output:
["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
Explanation:
We only have one website domain: "discuss.leetcode.com". As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.

Example 2:
Input:
["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
Output:
["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
Explanation:
We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times. For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.
* */
public class SubdomainVisitCount {

    @Test
    private void runCase(){
        String[] str = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List list = subdomainVisits(str);

        //1. 遍历List简单方式如下：size(), get(index)
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    private List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        if(cpdomains == null || cpdomains.length == 0) return res;
        Map<String, Integer> map = new HashMap<>();

        for(String domains : cpdomains){
            int spaceIndex = domains.indexOf(" ");

            //2. Integer.parseInt(String, 进制)，将string转换成int
            int time = Integer.parseInt(domains.substring(0, spaceIndex));

            String domain = domains.substring(spaceIndex+1);
            map.put(domain, map.getOrDefault(domain, 0) + time);
            int i = 0;
            while(i< domain.length()){
                if(domain.charAt(i) == '.'){
                    //3. 使用getOrDefault(string, defaultValue) 获取value的方法
                    map.put(domain.substring(i+1), map.getOrDefault(domain.substring(i+1), 0) + time);
                }
                i++;
            }
        }
         //4. 遍历HashMap的方法如下：
         //获取getKey， getValue
        for(Map.Entry<String, Integer> e : map.entrySet()){
            String oneRecord = e.getValue() + " " + e.getKey();
            res.add(oneRecord);
        }

        return res;
    }
}
