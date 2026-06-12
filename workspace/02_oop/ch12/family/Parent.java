package ch12.family;

public class Parent {
    private String name;
    private int age;
    private String sex;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Parent(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void status() {
        System.out.println("이름: " + name + " 나이: " + age + " 성별: " + sex);
    }

    void eat() {

    }

    void play() {

    }
}
