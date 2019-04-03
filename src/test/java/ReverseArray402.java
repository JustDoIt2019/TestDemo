package studying;

import org.testng.annotations.Test;
import utils.Tools;

public class ReverseArray402 {

    @Test
    public void test() {
        int[][] array = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        reverse(array);
    }

    public void reverse(int[][] list) {
        for (int[] ele : list
                ) {
            for (int i = 0; i < ele.length / 2; i++) {
                int temp = 0;
                temp = ele[i];
                ele[i] = ele[ele.length - i - 1];
                ele[ele.length - 1 - i] = temp;
            }

        }

        for (int[] array : list) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    array[i] = 0;
                } else array[i] = 1;
            }

        }

        for (int[] ele : list
                ) {
            Tools.printArrays(ele);
        }
    }
}
