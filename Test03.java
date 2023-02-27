package study;

/**
 * @title: Test03
 * @Author 何锦杰
 * @Date: 2023/2/27 20:04
 * @Version 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length/2; i++) {
            //交互arr[i]与arr[arr.length-1]位置的元素
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
