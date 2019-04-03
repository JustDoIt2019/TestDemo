package studying;

import org.testng.annotations.Test;
import utils.Tools;


import java.util.ArrayList;
import java.util.Arrays;

//square array and sort
public class SquaresSortedArray401 {
    @Test
    public void test1() {
        int[] a = {-4, -1, 0, 3, 10};
        int length = a.length;
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) {
            ans[i] = a[i] * a[i];
           // System.out.println(ans[i]);
        }
        Arrays.sort(ans);
        Tools.printArrays(ans);
        //Arrays.binarySearch(ans,8);
        //printArrays(ans);
        //System.out.println(ans.toString());
    }



}
