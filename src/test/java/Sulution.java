package studying;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Sulution {

    @Test
    public void runCase() {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = findDuplicates(array);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        // List<Integer> res = new ArrayList<>();
        // List res = new ArrayList();
        // List res = new ArrayList<>();
//以上全对
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if(nums[i]-nums[j]==0){
                        nums[j]=-1;
                        nums[i]=-1;
                    }
                }

            }


//            int index = Math.abs(nums[i]) - 1;
//            if (nums[index] < 0)
//                res.add(Math.abs(index + 1));
//            nums[index] = -nums[index];
        }

        for(int i =0;i<nums.length;i++){
            if(nums[i]<0) res.add(nums[i]);
        }
        return (List<Integer>) res;
    }
}

