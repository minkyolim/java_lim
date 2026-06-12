package ch12.animal;

public class Dog extends Animal {
    public Dog(String name, int height) {
//        Animal클래스의 생성자호출
        super(name, height, 43, 12);

    }

    public Dog(String name, int height, int weight, int age) {
        super(name, height, weight, age);
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(name+"가/이 실컷먹고서 놀자고 조른다");
    }

    // 재정의 되지 않았기에 있으나마나한코드
    @Override
    void bark() {
        super.bark();
    }

    @Override
    void move() {
        System.out.println("강아지가 뛰어다닙니다");
    }

    void howling() {
        System.out.println(name + "이/가 하울링을 시작합니다");
    }
}
