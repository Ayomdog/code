package study;

public class Test01 {
    public static void main(String[] args) {
        //创建数组
        int[][] arr = new int[10][];
        //初始化外层数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
            //给数组元素赋值
            //给首元素赋值
            arr[i][0] = 1;
            arr[i][i] = 1;
            //给每行的非首末元素赋值
            for (int j = 1; j < arr[i].length-1; j++) {
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }

            //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
