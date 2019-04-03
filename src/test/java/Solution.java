package studying;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

//442     Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array),
//        some elements appear twice and others appear once.
//        Find all the elements that appear twice in this array.
public class Solution {

    @Test
    public void runCase() {
       // int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] array={10,2,5,10,9,1,1,4,3,7};
        List list = findDuplicates(array);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int count;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count = count + 1;
                    nums[j] = 0;
                    // System.out.print("asdf");
                }
            }

            if (count == 2) {
                //System.out.print(nums[i]);
                res.add(nums[i]);
            }
        }

        return res;
    }
}
