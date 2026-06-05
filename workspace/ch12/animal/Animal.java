package ch12.animal;

public class Animal {
    protected String name;
    protected int height;
    protected int weight;
    protected int age;

    public Animal(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        System.out.println("이름: " + name + " 키: " + height + " 무게: " + weight + " 나이: " + age);
    }

    void eat() {
        System.out.println(name + "이 사료를 먹습니다");
    }

    void bark() {
        System.out.println(name + "이 짓습니다");
    }

    void move() {
        System.out.println(name + "이 움직입니다");
    }
}
