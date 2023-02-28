package study;

/**
 * @title: BinarySearchTest
 * @Author 何锦杰
 * @Date: 2023/2/28 14:38
 * @Version 1.0
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,8};

        int target = 5;

        int head = 0;//首索引
        int end = arr.length-1;//尾索引

        boolean isFlag = true;//判断是否找到元素

        while (head<=end){

            int middle = (head+end) / 2;

            if(target==arr[middle]){
                System.out.println("找到了 " + target + " 对应的数组下标为 " + middle);
                isFlag = false;
                break;
            }else if (target>arr[middle]){
                head = middle + 1;
            } else{
                end = middle - 1;
            }
        }
        if (isFlag){
            System.out.println("没有找到对应元素");
        }
    }
}
