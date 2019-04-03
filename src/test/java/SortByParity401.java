package studying;

import org.junit.Test;
import utils.Tools;

//Input: [3,1,2,4]
//        Output: [2,4,3,1]
//Followed by odd elements. The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be ac
public class SortByParity401 {

    public int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int i = 0;
        int j = length - 1;
        int[] B = new int[length];
        for (int index = 0; index < length; index++) {
            if (A[index] % 2 == 0) {
                B[i++] = A[index];
            } else {
                B[j--] = A[index];
            }
        }
        Tools.printArrays(B);
        return B;
    }
    @Test
    public void runCase(){
        int[] a = {1,2,5,6,8};
        sortArrayByParity(a);

    }
}
