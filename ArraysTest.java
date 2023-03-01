package study;

import java.time.temporal.ValueRange;
import java.util.Arrays;

/**
 * @title: ArraysTest
 * @Author 何锦杰
 * @Date: 2023/3/1 22:37
 * @Version 1.0
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};
        arr2 = new int[]{1,2,3,5,4};

        System.out.println(arr1==arr2);

        //1.boolen equals(int[] a,int[] b):比较两个数组的元素是否依次相等
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        //2.String toString(int[] a):输出数组元素信息
        System.out.println(Arrays.toString(arr1));

        //3.void fill(int[] a,int val):将指定值填充到数组中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //4.void sort(int[] a):使用快速排序算法实现的排序
        int[] arr3 = new int[]{32,21,42,31,23,12,22,67,89};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        //5.int binarySearch(int[] a,int key):二分查找
        //数组必须是有序的
        int index = Arrays.binarySearch(arr3,22);
        System.out.println(index);
    }
}
