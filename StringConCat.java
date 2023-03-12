package study;

/**
 * @title: StringConCat
 * @Author 何锦杰
 * @Date: 2023/3/12 12:27
 * @Version 1.0
 */
public class StringConCat {
    //n个字符串进行拼接，使每个字符串之间使用某字符进行分割，如果没有传入字符串，则返回空字符串"”

    public static void main(String[] args) {
        StringConCat test = new StringConCat();
        String info = test.concat("-","hello","world");
        System.out.println(info);
        System.out.println(test.concat("_","i","am","sb"));

    }
    public String concat(String operator,String ... strs){
        String result = "";

        for (int i = 0;i < strs.length; i++){
            if(i == 0){
                result += strs[i];
            }else{
                result += operator + strs[i];
            }
        }


        return result;

    }

}
