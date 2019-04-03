package studying;

import org.testng.annotations.Test;
import utils.Tools;

public class SortArray402 {
    @Test
    public void testSort() {
        int[] array = {4, 5, 68, 22, 3, 26, 17};
        int[] re = bubbleSort(array);
        Tools.printArrays(re);
    }

    /**
     * https://www.cnblogs.com/guoyaohua/p/8600214.html
     * 冒泡排序: 越小的元素会经由交换慢慢“浮”到数列的顶端。
     * 算法描述:
     * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 从开始第一对到结尾的最后一对，这样在最后的元素是最大的数；
     * 针对所有的元素重复以上的步骤，除了最后一个；
     * 重复步骤1~3，直到排序完成。
     */
    public int[] bubbleSort(int[] array) {
        //int[] array = {4, 5, 68, 22, 3, 26, 17};
        if (array.length == 0)
            return array;

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        //Tools.printArrays(array);
        return array;
    }

    /**
     * 选择排序:首先在未排序序列中找到最小（大）元素，存放到序列的起始位置，
     * 然后，再从剩余元素中继续寻找最小（大）元素，放到已排序序列的末尾。
     * 以此类推，直到所有元素均排序完毕
     */

    public static int[] selectionSort(int[] array) {

        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        //Tools.printArrays(array);
        return array;
    }
}
