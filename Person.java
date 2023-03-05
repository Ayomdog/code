package study;

/**
 * @title: Person
 * @Author 何锦杰
 * @Date: 2023/3/3 13:36
 * @Version 1.0
 */
public class Person {

    String name;
    int age;
    char gender;

    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(int hour){
        System.out.println(hour);
    }

    public void interest(String hobby){
        System.out.println(hobby);
    }
}
