package study;

/**
 * @title: MyArrays
 * @Author 何锦杰
 * @Date: 2023/3/8 18:09
 * @Version 1.0
 */
public class MyArrays {
    /**
     * 获取int[]数组的最大值
     *
     * @param arr 要获取最大值的数组
     * @return 数组的最大值
     */
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * 获取int[]数组的最小值
     *
     * @param arr 要获取最小值的数组
     * @return 数组的最小值
     */
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    /**
     * 获取int[]数组的元素和
     *
     * @param arr 要获取元素和的数组
     * @return 数组的元素和
     */
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    /**
     * 获取int[]数组的平均值
     *
     * @param arr 要获取平均值的数组
     * @return 数组的平均值
     */
    public int getAvg(int[] arr) {

        return getSum(arr) / arr.length;
    }

    /**
     * 复制int[]数组
     *
     * @param arr 需要赋值的数组
     * @return 复制的数组
     */
    public int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    /**
     * 反转int[]数组
     *
     * @param arr 需要反转的数组
     */
    public void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * 将int[]数组中的元素排序
     *
     * @param arr 需要排序的数组
     */
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 使用线性查找查找指定的元素
     * @param arr 带查找的数组
     * @param target 要查找的元素
     * @return target元素在arr数组中的索引位置。若未找到，则返回-1
     */
    public int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
