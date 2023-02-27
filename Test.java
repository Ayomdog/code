package study;

import java.util.Scanner;

public class Test {

    public static void main17(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
    }

    public static void main16(String[] args) {
        int num = 139;
        int bai = num / 100;
        int shi = num % 100 / 10;
        int ge = num % 10;
        System.out.println("百位：" + bai);
        System.out.println("十位：" + shi);
        System.out.println("个位：" + ge);
    }

    public static void main15(String[] args) {
        byte b = 127;
        b++;
        System.out.println(b);
    }

    public static void main14(String[] args) {
        int a = 20;
        int b = 12;
        double result = a / (b + 0.0);
        System.out.println(result);
    }

    public static void main13(String[] args) {
        char c = 'a';
        int num = 10;
        String str = "hello";
    }

    public static void main11(String[] args) {
//        double a = 12.9;
//        int i = (int)a;
//        System.out.println(i);
//        long b = 1023912413523L;
//        System.out.println(b);
        byte a = 12;
        int b = a + 1;
        System.out.println(b);
    }

    public static void main10(String[] args) {
        byte b = 13;
        int a = 20;

    }

    public static void main9(String[] args) {
        boolean IsBlack = true;
        if (IsBlack) {
            System.out.println("You are balckman");
        } else {
            System.out.println("You aren't blackman");
        }
    }

    public static void main8(String[] args) {
        System.out.println(520);
    }

    public static void main7(String[] args) {
        int a = 10;
        String str = a + "";
        System.out.println(str);

        String str1 = String.valueOf(10);
        System.out.println(str1);
    }

    public static void main6(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + "b:" + b);
    }

    public static void main5(String[] args) {
        String a = "HelloWorld";
        System.out.println(a);
        char b = 'h';
        System.out.println(b);
    }

    public static void main4(String[] args) {
        int a = 10;
        long b = 100L;
        //b = a;
        //System.out.println(b);
        a = (int) b;//显式类型转换
        System.out.println(a);
    }

    public static void main3(String[] args) {
        boolean a = true;
        System.out.println(a);
    }

    public static void main1(String[] args) {
        //int a = 20;
        //System.out.println(a);
        //System.out.println(Integer.MIN_VALUE);//输出int的最小值
        //System.out.println(Integer.MAX_VALUE);//输出int的最大值、
        //int c;
        //System.out.println(c);
        //int c = 10000000000000;
        //System.out.println(c);
        /*System.out.println(Double.MAX_VALUE);
        float a = 2.73f;
        System.out.println(a);*/
        double a = 1;
        double b = 2;
        System.out.println(a / b);
        System.out.println(1.0 / 2.0);
    }

    public static void main2(String[] args) {
        char ch = 'A';
        System.out.println(ch);
        int a = 10;
        System.out.println(a);
    }
}


class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);
    }
}

class Iftest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入我的成绩；");

        int score = scan.nextInt();
        if (score == 100) {
            System.out.println("奖励一辆BMW");
        } else if (score <= 99 && score > 80) {
            System.out.println("奖励一部苹果手机");
        } else {
            System.out.println("奖励一个1大嘴巴子");
        }
    }
}

class SwitchTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();
        int sumdays = 0;
        switch (month) {
            case 13:
                sumdays = sumdays + 31;
            case 12:
                sumdays = sumdays + 30;
            case 11:
                sumdays = sumdays + 31;
            case 10:
                sumdays = sumdays + 30;
            case 9:
                sumdays = sumdays + 31;
            case 8:
                sumdays = sumdays + 31;
            case 7:
                sumdays = sumdays + 30;
            case 6:
                sumdays = sumdays + 31;
            case 5:
                sumdays = sumdays + 30;
            case 4:
                sumdays = sumdays + 31;
            case 3:
                sumdays = sumdays + 28;
            case 2:
                sumdays = sumdays + 31;
            case 1:
                sumdays = sumdays + day;
        }
        System.out.println(sumdays);

    }
}

class ForTest {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 150; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                System.out.print("foo");
            }
            if (i % 5 == 0) {
                System.out.print("biz");
            }
            if (i % 7 == 0) {
                System.out.print("baz");
            }
            System.out.println();
        }
    }
}

class ForTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        do {
            if (num > 0) {
                num--;
                count++;
            } else {
                num++;
                count++;
            }
        } while (num != 0);
        System.out.println(count);
    }
}

class WhileForTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positiveNum = 0;
        int negativeNum = 0;
        while (true) {
            int num = scan.nextInt();
            if (num > 0) {
                positiveNum++;
            } else if (num < 0) {
                negativeNum++;
            } else {
                break;
            }
        }
        System.out.println("正数个数为" + positiveNum);
        System.out.println("负数个数为" + negativeNum);
    }
}

class SumTest {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        num1 = scan.nextInt();
        System.out.println("请在输入一个数字：");
        num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("两个数的和为：");
        System.out.println(sum);
    }
}

class multiplicationTest {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }

}

class PrimeNumber {
    public static void main(String[] args) {
        int i, j;
        int count = 0;
        for (i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {//判断是否为质数
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}

class ArrayTest {
    public static void main(String[] args) {
        int[] ids;//声明数组
        ids = new int[]{1001, 1002, 1003, 1004};//静态初始化
        String[] names = new String[5];//动态初始化
        names[0] = "何锦杰";
        names[1] = "刘亦菲";
        names[2] = "杨幂";
        names[3] = "喻佳";
        names[4] = "我是谁";
//        System.out.println(names[1]);
//        System.out.println(names.length);
//        for (int i = 0; i < names.length ; i++) {
//            System.out.println(names[i]);
//        }
        int[] arr;
        arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        int lenth = arr.length;//数组长度
        System.out.println(lenth);
    }
}

class Array1Test {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        for (int i = 0; i < 5; i++) {
//            Scanner scan = new Scanner(System.in);
//            arr[i] = scan.nextInt();
//        }
//        System.out.println(arr);
//    }

    }
}

class ArrayExer {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};

        String tel = "";

        for (int i = 0; i < index.length; i++) {
            int value = index[i];
            tel += arr[value];
        }
        System.out.println("联系方式" + tel);
    }
}

class ArrayExer2 {
    public static void main(String[] args) {
        //定义包含7个单词的数组
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //从键盘获取指定的数值，使用Scanner
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        System.out.println(day[value - 1]);

    }
}

class ArrayExer3 {
    public static void main(String[] args) {
        //从键盘输入学生的人数，根据人数，创建数组（动态初始化）
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数 ");
        int count = scan.nextInt();

        int[] scores = new int[count];
        //依次输入学生成绩，并将成绩保存在数组元素中
        System.out.println("请输入" + count + "个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }
        //获取学生成绩的最大值
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }

        System.out.println("最高分为" + maxScore);
        //遍历数组元素，根据学生成绩与最高分的差值，得到每个学生的成绩，并输出成绩和等级
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= maxScore - 10) {
                System.out.println("student" + i + "score is" + scores[i] + "grade is A");
            } else if (scores[i] >= maxScore - 20) {
                System.out.println("student" + i + "score is" + scores[i] + "grade is B");
            } else if (scores[i] >= maxScore - 30) {
                System.out.println("student" + i + "score is" + scores[i] + "grade is C");
            } else {
                System.out.println("student" + i + "score is" + scores[i] + "grade is D");
            }
        }
        scan.close();
    }
}

class TwoArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int[][] arr2 = new int[][]{{1, 2, 3}, {2, 3}, {1, 2, 3, 4}};


        String[][] arr3 = new String[3][4];
        double[][] arr4 = new double[2][];

        int arr5[][] = new int[3][4];
        int[] arr6[] = new int[3][4];

        arr3[0][1] = "Tom";
        System.out.println(arr3[0][1]);//Tom
        System.out.println(arr3[0]);//[Ljava.lang.String;@1b6d3586

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }
    }
}

class ArrayExer03 {
    public static void main(String[] args) {
        //定义二位数组
        String[][] employees = {
                {"10", "1", "何锦杰", "19", "20000"},
                {"12", "2", "章畜", "\t19", "2000"}
        };
        System.out.println("员工类型\t编号\t姓名\t年龄\t薪资\t奖金\t\t股票");
        for (int i = 0; i < employees.length; i++) {

            String employeeType = employees[i][0];
            switch (employeeType) {
                case "10":
                    System.out.print("程序员\t");
                    break;
                case "12":
                    System.out.print("土木人\t");
                    break;
            }

            for (int j = 1; j < employees[i].length; j++) {
                System.out.print(employees[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class ArrayExer04 {
    public static void main(String[] args) {
        //1.动态初始化创建数组
        int[] arr = new int[10];

        //2.通过循环给数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
        }
        //3.按照题目要求输出
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

    }
}
class GivePoints{
    public static void main(String[] args) {
        //静态初始化数组
        int[] points = new int[]{5,4,6,8,9,0,1,2,7,3};

        //找出数组中的最大值最小值
        int max = points[0];
        int min = points[0];
        for (int i = 1; i < points.length ; i++) {
            if(max < points[i]){
                max = points[i];
            }

        }
        for (int i = 1; i < points.length ; i++) {
            if(min > points[i]){
                min = points[i];
            }
        }
        //计算平均值
        int avg = 0;
        for (int i = 0; i < points.length; i++) {
            avg += points[i];
        }
        avg = avg - max - min;
        System.out.println(avg/ 8);
    }
}

