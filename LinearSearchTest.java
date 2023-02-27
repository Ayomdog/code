package study;

/**
 * @title: LinearSearchTest
 * @Author 何锦杰
 * @Date: 2023/2/27 21:47
 * @Version 1.0
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        int target = 5;

        //线性查找
        boolean isFlag = true;
        for (int i = 0; i < arr1.length; i++) {
            if(target==arr1[i]){
                System.out.println("找到了" + target + "对应的位置： " + i);
                isFlag = false;
                break;
            }
        }
        if(isFlag){
            System.out.println("不好意思，没找到此元素");
        }
    }
}
