package study;

/**
 * @title: PersonTest
 * @Author 何锦杰
 * @Date: 2023/3/3 13:52
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建对象，类的实例化
        Person p1 = new Person();

        //通过对象调用属性或方法
        p1.name = "杰克";
        p1.age = 24;
        p1.gender = '男';

        System.out.println(p1.name);

        p1.eat();
        p1.sleep(8);
        p1.interest("画画");
    }
}
