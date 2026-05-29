package ch10;

//이름과 나이를 명령행 매개변수로 전달 받아서 출력하는 예제
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest at = new ArgsTest();
        String[] name = {"오달수", "강희찬", "송대관"};
        int[] age = {45, 75, 12};
        at.print( name[0], age[0]);
    }

    String name(String name) {
        return name;
    }

    int age(int age) {
        return age;
    }

    void print(String n, int a) {
        System.out.println("이름: " + name(n) + " 나이: " + age(a));
    }


}
